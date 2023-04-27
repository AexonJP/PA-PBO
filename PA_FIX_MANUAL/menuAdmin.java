import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class menuAdmin{
	menuAdmin(int nomors){
		JFrame formAdmin = new JFrame("menu admin");
		formAdmin.setSize(600,700);
		formAdmin.setLocation(100,150);
		formAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formAdmin.setLocationRelativeTo(null);
		formAdmin.setLayout(null);
        formAdmin.setBackground(Color.black);
        formAdmin.setResizable(false);

        

		JButton anime = new JButton("TOP AIRING ANIME");
		anime.setMargin( new Insets(5, 5, 5, 5) );
        anime.setBounds(0,0,220,25);
        anime.setFont(new Font("Dialog", Font.BOLD, 12));
        //add button to the frame
        formAdmin.add(anime);
        anime.setVisible(false);

        JLabel labelAnime = new JLabel("TOP AIRING ANIME");
        labelAnime.setBounds(0,0,220,25);
        labelAnime.setHorizontalAlignment(JLabel.CENTER);
        labelAnime.setFont(new Font("Dialog", Font.BOLD, 12));
        //add button to the frame
        formAdmin.add(labelAnime);
        labelAnime.setVisible(true);

        JButton tambah = new JButton("Tambah");
        tambah.setMargin( new Insets(5, 5, 5, 5) );
        tambah.setBounds(500,0,70,25);
        tambah.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formAdmin.add(tambah);
        tambah.setVisible(true);

        JLabel labelTambah = new JLabel("Tambah");
        // labelTambah.setMargin( new Insets(5, 5, 5, 5) );
        labelTambah.setBounds(500,0,70,25);
        labelTambah.setHorizontalAlignment(JLabel.CENTER);
        labelTambah.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formAdmin.add(labelTambah);
        labelTambah.setVisible(false);

        // JButton rincian = new JButton("rincian");
        // rincian.setMargin( new Insets(5, 5, 5, 5) );
        // rincian.setBounds(140,0,70,25);
        // rincian.setFont(new Font("Dialog", Font.PLAIN, 10));
        // //add button to the frame
        // formAdmin.add(rincian);
        // rincian.setVisible(true);
    	
    	formAdmin.setVisible(true);

        JPanel panelAnimeAdmin = new JPanel();
        panelAnimeAdmin.setBounds(0,25,600,675);
        panelAnimeAdmin.setBackground(Color.black);
        panelAnimeAdmin.setLayout(null);


        ArrayList<varAnime> dataAnime = new ArrayList<varAnime>();


        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/anime",
                    "root", "");

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "SELECT * FROM animes ORDER BY `rating` DESC");
            Integer code;
            String title;
            Float rating;
            Integer episode;
            String genre;
            String studio;
            String hari;
            String sinopsis;
            String gambar;


            while (resultSet.next()) {
                code = resultSet.getInt("id");
                title = resultSet.getString("judul").trim();
                rating = resultSet.getFloat("rating");
                episode  = resultSet.getInt("episode");
                genre = resultSet.getString("genre").trim();
                studio = resultSet.getString("studio").trim();
                hari = resultSet.getString("hari").trim();
                sinopsis = resultSet.getString("sinopsis").trim();
                gambar = resultSet.getString("gambar").trim();
                varAnime okk = new varAnime(code,title,rating,episode,genre,studio,hari,sinopsis,gambar);
                // okk();
                // if(nomors)
                dataAnime.add(okk);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        
        
        int banyak = dataAnime.size();

        JButton[] detail = new JButton[banyak];
        JLabel[] isi = new JLabel[]{
            new JLabel("Rank"),
            new JLabel("Title"),
            new JLabel("Rating"),
            new JLabel("Detail")
        };
        int x[] = new int[]{0,103,366,469};
        int panjang[] = new int[]{100,260,100,100};
        // int y[] = new int[]{0}

        JPanel[] panel = new JPanel[banyak];
        JLabel[] judulAnime = new JLabel[banyak];
        JLabel[] ratingAnime = new JLabel[banyak];
        JLabel[] rank = new JLabel[banyak];
        int[][] warna = new int[][]{
            {18,18,18},
            {24,24,24}
        };

        // JLabel[]

        // JLabel[] episodeAnime = new JLabel[banyak];
        // JLabel[] genreAnime = new JLabel[banyak];
        // JLabel[] studioAnime = new JLabel[banyak];
        // JLabel[] hariAnime = new JLabel[banyak];
        // JLabel[] sinopsisAnime = new JLabel[banyak];
        

        JButton[] navigasi = new JButton[]{
            new JButton("<<"),
            new JButton("<"),
            new JButton(">"),
            new JButton(">>")
        };
        
        // JLabel nomor_halaman = new JLabel();

        int[] navigasiku = new int[]
            {1,-1,1,((banyak-1)/9)+1};


        for(int i =0;i<4;i++){
            isi[i].setBounds(x[i]+3,3,panjang[i],60);
            isi[i].setOpaque(true);
            isi[i].setBackground(new Color(51,51,51));
            isi[i].setForeground(Color.white);
            isi[i].setVisible(true);
            isi[i].setHorizontalAlignment(JLabel.CENTER);
            panelAnimeAdmin.add(isi[i]);
        }

        for(int i =0;i<banyak;i++){
            panel[i] = new JPanel();
            judulAnime[i] = new JLabel(dataAnime.get(i).judul);
            ratingAnime[i] = new JLabel("Rating : " + dataAnime.get(i).rating);
            rank[i] = new JLabel(""+(i+1));
            // episodeAnime[i]= new JLabel("Episode : " + dataAnime.get(i).episode);
            // genreAnime[i] = new JLabel("Genre : "+ dataAnime.get(i).genre);
            // studioAnime[i] = new JLabel("Studio : "+ dataAnime.get(i).studio);
            // hariAnime[i] = new JLabel("Hari : "+ dataAnime.get(i).hari);
            // sinopsisAnime[i] = new JLabel("Sinopsis : "+ dataAnime.get(i).sinopsis);
            detail[i] = new JButton("detail");
        }
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        for (int i =0;i<banyak;i++){
            final int final_i = dataAnime.get(i).id;

            panel[i].setBounds(3,66+((i*53)%(477)),600,50);
            panel[i].setBackground(Color.black);
            // panel[i].setCursor(cursor);


            rank[i].setBounds(x[0],0,panjang[0],60);
            rank[i].setOpaque(true);
            rank[i].setHorizontalAlignment(JLabel.CENTER);
            rank[i].setBackground(new Color(warna[i%2][0],warna[i%2][1],warna[i%2][2]));
            detail[i].setFont(new Font("Dialog", Font.PLAIN, 20));
            rank[i].setForeground(new Color(163,163,163));
            rank[i].setVisible(false);


            detail[i].setBounds(x[3],0,panjang[3],60);
            detail[i].setForeground(Color.white);
            detail[i].setVisible(false);
            detail[i].setHorizontalAlignment(JLabel.CENTER);
            detail[i].setBackground(new Color(warna[i%2][0],warna[i%2][1],warna[i%2][2]));
            detail[i].setMargin( new Insets(2, 2, 2, 2) );
            detail[i].setFont(new Font("Dialog", Font.PLAIN, 12));
            detail[i].setCursor(cursor);
            detail[i].addActionListener(new ActionListener() {
              // @Override

              public void actionPerformed(ActionEvent e) {
                  //your actions
                    // setVisible(false);
                new rincianAnimeAdmin(final_i);
                formAdmin.dispose();
              }});

            judulAnime[i].setBounds(x[1],0,panjang[1],60);
            judulAnime[i].setOpaque(true);
            judulAnime[i].setHorizontalAlignment(JLabel.CENTER);
            judulAnime[i].setBackground(new Color(warna[i%2][0],warna[i%2][1],warna[i%2][2]));
            judulAnime[i].setForeground(new Color(171,196,237));
            judulAnime[i].setVisible(false);
            
            ratingAnime[i].setBounds(x[2],0,panjang[2],60);
            ratingAnime[i].setOpaque(true);
            ratingAnime[i].setHorizontalAlignment(JLabel.CENTER);
            ratingAnime[i].setBackground(new Color(warna[i%2][0],warna[i%2][1],warna[i%2][2]));
            ratingAnime[i].setForeground(new Color(163,163,163));
            ratingAnime[i].setVisible(false);

            // episodeAnime[i].setBounds(220,30,180,20);
            // // episodeAnime[i].setForeground(Color.white);
            // episodeAnime[i].setVisible(true);

            // genreAnime[i].setBounds(340,30,180,20);
            // // genreAnime[i].setForeground(Color.white);
            // genreAnime[i].setVisible(true);

            // panel[i].add(rank[i]);
            // panel[i].add(judulAnime[i]);
            // panel[i].add(ratingAnime[i]);
            // // panel[i].add(episodeAnime[i]);
            // // panel[i].add(genreAnime[i]);
            // panel[i].add(detail[i]);
            // panel[i].setLayout(null);
            // panelAnimeAdmin.add(panel[i]);
        }

        for (int i =0;i<banyak;i++){
            if((nomors-1)*9<=i){
                rank[i].setVisible(true);

                detail[i].setVisible(true);
                
                judulAnime[i].setVisible(true);
                
                
                ratingAnime[i].setVisible(true);
                panel[i].add(rank[i]);
                panel[i].add(judulAnime[i]);
                panel[i].add(ratingAnime[i]);
                // panel[i].add(episodeAnime[i]);
                // panel[i].add(genreAnime[i]);
                panel[i].add(detail[i]);
                panel[i].setLayout(null);
                panelAnimeAdmin.add(panel[i]);
            }
            

        }

        for(int i =0;i<4;i++){
            navigasi[i].setBounds(((150*i)+60),600,20,20);
            navigasi[i].setOpaque(false);
            navigasi[i].setMargin( new Insets(1, 1, 1, 1) );
            navigasi[i].setForeground(Color.white);
            navigasi[i].setBorder(null);
            navigasi[i].setBorderPainted(false);
            navigasi[i].setContentAreaFilled(false);
            navigasi[i].setOpaque(false);
            navigasi[i].setCursor(cursor);
            navigasi[i].setVisible(true);
            
            // navigasi[i].addActionListener(new ActionListener() {
            //     @Override
            //     public void actionPerformed(ActionEvent e) {
            //         //your actions
            //         // panel_tambah.setVisible(true);
            //          //or .remove(previousPanel);

            //         // panel_anime.setVisible(false);

            //         new menuAdmin(nomors=nomor+navigasiku[i]);
            //         // anime.setVisible(true);
            //         // labelAnime.setVisible(false);
            //         // labelTambah.setVisible(true);
            //         // tambah.setVisible(false); 

            //         // f.setVisible(false);

            //     }

            // });
            // panelAnimeAdmin.add(navigasi[i]);
        }


        navigasi[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi0 = nomors;
                //your actions
                // panel_tambah.setVisible(true);
                 //or .remove(previousPanel);

                // panel_anime.setVisible(false);

                new menuAdmin(navigasiku[0]);
                formAdmin.dispose();
                // anime.setVisible(true);
                // labelAnime.setVisible(false);
                // labelTambah.setVisible(true);
                // tambah.setVisible(false); 

                // f.setVisible(false);

            }

        });
        panelAnimeAdmin.add(navigasi[0]);


        navigasi[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi1 = nomors;
                //your actions
                // panel_tambah.setVisible(true);
                 //or .remove(previousPanel);

                // panel_anime.setVisible(false);
                if(nomors>1){
                    new menuAdmin(navigasi1+navigasiku[1]);
                }
                else{
                    new menuAdmin(1);
                }
                formAdmin.dispose();
                // anime.setVisible(true);
                // labelAnime.setVisible(false);
                // labelTambah.setVisible(true);
                // tambah.setVisible(false); 

                // f.setVisible(false);

            }

        });
        panelAnimeAdmin.add(navigasi[1]);


        navigasi[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi2 = nomors;
                //your actions
                // panel_tambah.setVisible(true);
                 //or .remove(previousPanel);

                // panel_anime.setVisible(false);
                if(nomors<navigasiku[3]){
                    new menuAdmin(navigasi2+navigasiku[2]);
                }
                else{
                    new menuAdmin(navigasiku[3]);
                }
                formAdmin.dispose();
                // new menuAdmin(navigasi2+navigasiku[2]);
                // anime.setVisible(true);
                // labelAnime.setVisible(false);
                // labelTambah.setVisible(true);
                // tambah.setVisible(false); 

                // f.setVisible(false);

            }

        });
        panelAnimeAdmin.add(navigasi[2]);


        navigasi[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi3 = nomors;
                //your actions
                // panel_tambah.setVisible(true);
                 //or .remove(previousPanel);

                // panel_anime.setVisible(false);

                new menuAdmin(navigasiku[3]);
                formAdmin.dispose();
                // anime.setVisible(true);
                // labelAnime.setVisible(false);
                // labelTambah.setVisible(true);
                // tambah.setVisible(false); 

                // f.setVisible(false);

            }

        });
        panelAnimeAdmin.add(navigasi[3]);
    

        formAdmin.add(panelAnimeAdmin);

        anime.setVisible(false);
        labelAnime.setVisible(true);
        labelTambah.setVisible(false);
        tambah.setVisible(true); 
        

    	// JPanel panel_tambah = new panelTambah();
    	// formAdmin.add(panel_tambah);
        // panel_tambah.setVisible(false);

        // JPanel f = new rincianAnime();
        // formAdmin.add(f);
        // f.setVisible(false);

    	tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	// panel_tambah.setVisible(true);
                 //or .remove(previousPanel);

            	// panel_anime.setVisible(false);
                new menuAdminTambah();
                formAdmin.dispose();
                // anime.setVisible(true);
                // labelAnime.setVisible(false);
                // labelTambah.setVisible(true);
                // tambah.setVisible(false); 

                // f.setVisible(false);

            }

        });

        // rincian.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         //your actions
        //         t.setVisible(false);
        //         g.setVisible(false);
        //         f.setVisible(true);
        //         anime.setVisible(true);
        //         labelAnime.setVisible(false);
        //         labelTambah.setVisible(false);
        //         tambah.setVisible(true);
        //     }

        // });

        // anime.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         //your actions
        //     	// panel_anime.setVisible(true);
        //         // formAdmin.getContentPane().remove(panel_anime);
        //         formAdmin.getContentPane().remove(panel_anime);
        //         JPanel panel_anime = new panelAnimeAdmin();
        //         formAdmin.add(panel_anime);
        //         // panel_anime.buildPanel(); // panel needs a builder method
        //         formAdmin.revalidate(); // in- and validate in one !! 
        //         formAdmin.pack();

        //     	panel_tambah.setVisible(false);
        //         anime.setVisible(false);
        //         labelAnime.setVisible(true);

        //         labelTambah.setVisible(false);
        //         tambah.setVisible(true);
                
        //         // f.setVisible(false);
                
        //     }

        // });
        JLabel nomor_halaman = new JLabel(Integer.toString(nomors));
        // navigasi[i].setBounds(((150*i)+60),600,20,20);
        nomor_halaman.setBounds(300,600,20,20);
        // nomor_halaman.setHorizontalAlignment(JLabel.CENTER);
        nomor_halaman.setForeground(Color.white);
        nomor_halaman.setFont(new Font("Dialog", Font.BOLD, 12));
        //add button to the frame
        panelAnimeAdmin.add(nomor_halaman);
        nomor_halaman.setVisible(true);
    }

	
}