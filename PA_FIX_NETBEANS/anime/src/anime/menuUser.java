package anime;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class menuUser extends JFrame{
        private Connection conn = null;
        private PreparedStatement pst = null;
        private ResultSet resultSet = null;
    menuUser(int nomors){
        intialize(nomors);
    }
    public void intialize(int nomors){
//        JFrame = new JFrame("menu user");
        setSize(600,700);
        setLocation(100,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.black);
        setResizable(false);
        JLabel labelAnime = new JLabel("TOP AIRING ANIME");
        labelAnime.setBounds(175,0,220,25);
        labelAnime.setHorizontalAlignment(JLabel.CENTER);
        labelAnime.setFont(new Font("Dialog", Font.BOLD, 12));
        add(labelAnime);
        labelAnime.setVisible(true);
        JButton kembali = new JButton("LOG OUT");
        kembali.setMargin( new Insets(5, 5, 5, 5) );
        kembali.setBounds(511,0,75,25);
        kembali.setFont(new Font("Dialog", Font.BOLD, 12));
        add(kembali);
        kembali.setVisible(true);
        setVisible(true);
        JPanel panelAnimeUser = new JPanel();
        panelAnimeUser.setBounds(0,25,600,675);
        panelAnimeUser.setBackground(Color.black);
        panelAnimeUser.setLayout(null);
        ArrayList<varAnime> dataAnime = new ArrayList<varAnime>();
        try {            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anime", "root", "");
            String sql = "SELECT * FROM animes ORDER BY `rating` DESC";
            pst = conn.prepareStatement(sql);
            resultSet = pst.executeQuery();
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
                dataAnime.add(okk);
            }
            conn.close();
        } catch (SQLException exception) {
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
        JPanel[] panel = new JPanel[banyak];
        JLabel[] judulAnime = new JLabel[banyak];
        JLabel[] ratingAnime = new JLabel[banyak];
        JLabel[] rank = new JLabel[banyak];
        int[][] warna = new int[][]{
            {18,18,18},
            {24,24,24}
        };
        JButton[] navigasi = new JButton[]{
            new JButton("<<"),
            new JButton("<"),
            new JButton(">"),
            new JButton(">>")
        };
        int[] navigasiku = new int[]
            {1,-1,1,((banyak-1)/9)+1};


        for(int i =0;i<4;i++){
            isi[i].setBounds(x[i]+3,3,panjang[i],60);
            isi[i].setOpaque(true);
            isi[i].setBackground(new Color(51,51,51));
            isi[i].setForeground(Color.white);
            isi[i].setVisible(true);
            isi[i].setHorizontalAlignment(JLabel.CENTER);
            panelAnimeUser.add(isi[i]);
        }

        for(int i =0;i<banyak;i++){
            panel[i] = new JPanel();
            judulAnime[i] = new JLabel(dataAnime.get(i).judul);
            ratingAnime[i] = new JLabel("Rating : " + dataAnime.get(i).rating);
            rank[i] = new JLabel(""+(i+1));
            detail[i] = new JButton("detail");
        }
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        for (int i =0;i<banyak;i++){
            final int final_i = dataAnime.get(i).id;
            final int final_nomor = nomors;
            panel[i].setBounds(3,66+((i*53)%(477)),600,50);
            panel[i].setBackground(Color.black);
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
              @Override
              public void actionPerformed(ActionEvent e) {
                rincian_animes animes = new rincian_animes(final_i);
                animes.setVisible(true);
                dispose();
                
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
                panel[i].add(detail[i]);
                panel[i].setLayout(null);
                panelAnimeUser.add(panel[i]);
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
        }


        navigasi[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi0 = nomors;
                new menuUser(navigasiku[0]);
                dispose();
            }

        });
        panelAnimeUser.add(navigasi[0]);


        navigasi[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi1 = nomors;
                if(nomors>1){
                    new menuUser(navigasi1+navigasiku[1]);
                }
                else{
                    new menuUser(1);
                }
                dispose();
            }
        });
        panelAnimeUser.add(navigasi[1]);

        navigasi[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi2 = nomors;
                //your actions
                // panel_tambah.setVisible(true);
                 //or .remove(previousPanel);

                // panel_anime.setVisible(false);
                if(nomors<navigasiku[3]){
                    new menuUser(navigasi2+navigasiku[2]);
                }
                else{
                    new menuUser(navigasiku[3]);
                }
                dispose();
            }

        });
        panelAnimeUser.add(navigasi[2]);

        navigasi[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final int navigasi3 = nomors;
                new menuUser(navigasiku[3]);
                dispose();
            }

        });
        panelAnimeUser.add(navigasi[3]);
        
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm login = new LoginForm();
                login.setVisible(true);
                dispose();
            }
        });
    
        add(panelAnimeUser);
        labelAnime.setVisible(true);
        
        JLabel nomor_halaman = new JLabel(Integer.toString(nomors));
        
        nomor_halaman.setBounds(295,600,20,20);
        
        nomor_halaman.setForeground(Color.white);
        nomor_halaman.setFont(new Font("Dialog", Font.BOLD, 12));
        
        panelAnimeUser.add(nomor_halaman);
        nomor_halaman.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUser(1);
            }
        });
    }

    
}