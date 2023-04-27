import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.JFileChooser.*;
import java.sql.*;

public class rincianAnime{
	Integer ids;
    String juduls;
    Float ratings;
    Integer episodes;
    String genres;
    String studios;
    String haris;
    String sinopsiss;
    String gambars;
	// rincianAnime(String judul, String gambar, Float rating,String sipnosis, String studio){
// 	public rincianAnime(Integer id,String juduls,Float ratings,Integer episodes,String genres,String studios, String haris, String sinopsiss,String gambars){
// 		// setBounds(0,25,600,675);
// 		// setBackground(new Color(161, 161, 143));
// 		// setLayout(null);

// // 		// int banyak =10;
// // 		// JPanel[] panel = new JPanel[banyak];
// // 		// JLabel[] judulAnime = new JLabel[banyak];
// // 		// JLabel[] rating = new JLabel[banyak];
// // 		// JLabel[] episode = new JLabel[banyak];
// // 		// JLabel[] genre = new JLabel[banyak];

// // 		JLabel judulAnime = new JLabel("judul anime");
// // 		judulAnime.setBounds(20,5,300,30);
// // 		judulAnime.setVisible(true);


// // 		tampilGambar gambar = new tampilGambar();
// // 		gambar.setBounds(10,35,200,300);
// // 		gambar.atur("C:/Users/Abdullah/Favorites/Downloads/pixelate.jpg",gambar.getWidth(),gambar.getHeight());
// // 		gambar.setVisible(true);

// // 		JLabel labelSipnosis = new JLabel("sipnosis :");
// // 		labelSipnosis.setForeground(Color.green);
// // 		labelSipnosis.setBounds(225,35,180,25);
// // 		labelSipnosis.setVisible(true);

// // 	    JTextArea sipnosis = new JTextArea("ayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyghubhjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjjsndfjkansfhbasdfagjsbhjsabdabkababababababababababababababababkakbakbakbakbakbakbakbakbabkabkakbakbakbakbakbakbakbakbababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababkjkjkjkjkjkjkjk");
// // 	    // JTextArea sipnosis = new JTextArea();
// // 	    sipnosis.setSize(350,1500);
// // 	    // sipnosis.setOpaque(true);
// // 	    sipnosis.setBackground(Color.black);
// // 	    sipnosis.setVisible(true);
// // 	    sipnosis.setForeground(Color.white);
// // 	    sipnosis.setLineWrap(true);
// // 	    sipnosis.setEditable(false);

// // 	    JScrollPane scroll = new JScrollPane (sipnosis);
// // 	    // scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
// // 	    scroll.setBounds(225,35,350,300);
// // 	    scroll.setVisible(true);
// // 	    scroll.getVerticalScrollBar().setPreferredSize(new Dimension(5, 0));
// // // jScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
// // 	    add(scroll);


// // 	    JLabel labelRating = new JLabel("rating");
// // 	    labelRating.setBounds(30,350,180,25);
// // 	    labelRating.setVisible(true);
// // 	    labelRating.setForeground(Color.black);

// // 	    JLabel labelGenre = new JLabel("genre");
// // 	    labelGenre.setBounds(30,390,180,25);
// // 	    labelGenre.setVisible(true);
// // 	    labelGenre.setForeground(Color.black);

// // 	    JLabel labelEpisode = new JLabel("episode");
// // 	    labelEpisode.setBounds(30,430,180,25);
// // 	    labelEpisode.setVisible(true);
// // 	    labelEpisode.setForeground(Color.black);

// // 	    JLabel labelStudio = new JLabel("studio");
// // 	    labelStudio.setBounds(30,470,180,25);
// // 	    labelStudio.setVisible(true);
// // 	    labelStudio.setForeground(Color.black);

// // 	    add(labelGenre);
// // 	    add(labelEpisode);
// // 	    add(labelStudio);
// // 	    add(labelRating);
// // 		add(judulAnime);
// // 		add(labelSipnosis);
// // 		// add(sipnosis);
// // 		add(gambar);



// 		setBounds(0,25,600,675);
// 		setBackground(new Color(161, 161, 143));
// 		setLayout(null);


// 		// int banyak =10;
// 		// JPanel[] panel = new JPanel[banyak];
// 		// JLabel[] judulAnime = new JLabel[banyak];
// 		// JLabel[] rating = new JLabel[banyak];
// 		// JLabel[] episode = new JLabel[banyak];
// 		// JLabel[] genre = new JLabel[banyak];

// 		JLabel judulAnime = new JLabel(juduls);
// 		judulAnime.setBounds(20,5,300,30);
// 		judulAnime.setVisible(true);


// 		tampilGambar gambar = new tampilGambar();
// 		gambar.setBounds(10,35,200,300);
// 		gambar.atur("C:/Users/Abdullah/Favorites/Downloads/pixelate.jpg",gambar.getWidth(),gambar.getHeight());
// 		gambar.setVisible(true);

// 		JLabel labelSipnosis = new JLabel("sipnosis :");
// 		labelSipnosis.setForeground(Color.green);
// 		labelSipnosis.setBounds(225,35,180,25);
// 		labelSipnosis.setVisible(true);

// 	    JTextArea sipnosis = new JTextArea(sinopsiss);
// 	    // JTextArea sipnosis = new JTextArea();
// 	    sipnosis.setSize(350,1500);
// 	    // sipnosis.setOpaque(true);
// 	    sipnosis.setBackground(Color.black);
// 	    sipnosis.setVisible(true);
// 	    sipnosis.setForeground(Color.white);
// 	    sipnosis.setLineWrap(true);
// 	    sipnosis.setEditable(false);

// 	    JScrollPane scroll = new JScrollPane (sipnosis);
// 	    // scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
// 	    scroll.setBounds(225,35,350,300);
// 	    scroll.setVisible(true);
// 	    scroll.getVerticalScrollBar().setPreferredSize(new Dimension(5, 0));
// // jScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
// 	    add(scroll);


// 	    JLabel labelRating = new JLabel("rating : "+ratings);
// 	    labelRating.setBounds(30,350,180,25);
// 	    labelRating.setVisible(true);
// 	    labelRating.setForeground(Color.black);

// 	    JLabel labelGenre = new JLabel("genre : "+genres);
// 	    labelGenre.setBounds(30,390,180,25);
// 	    labelGenre.setVisible(true);
// 	    labelGenre.setForeground(Color.black);

// 	    JLabel labelEpisode = new JLabel("episode : "+episodes);
// 	    labelEpisode.setBounds(30,430,180,25);
// 	    labelEpisode.setVisible(true);
// 	    labelEpisode.setForeground(Color.black);

// 	    JLabel labelStudio = new JLabel("studio : "+studios);
// 	    labelStudio.setBounds(30,470,180,25);
// 	    labelStudio.setVisible(true);
// 	    labelStudio.setForeground(Color.black);

// 	    JLabel labelHari = new JLabel("hari : "+haris);
// 	    labelHari.setBounds(30,510,180,25);
// 	    labelHari.setVisible(true);
// 	    labelHari.setForeground(Color.black);

// 	    add(labelGenre);
// 	    add(labelEpisode);
// 	    add(labelHari);
// 	    add(labelStudio);
// 	    add(labelRating);
// 		add(judulAnime);
// 		add(labelSipnosis);
// 		// add(sipnosis);
// 		add(gambar);
// 	}

	rincianAnime(Integer id){
		

		JFrame formAnimes = new JFrame("rincian anime");
        formAnimes.setSize(600,700);
        formAnimes.setLocation(700,150);
        // formAnimes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formAnimes.setLocationRelativeTo(null);
        formAnimes.setLayout(null);
        formAnimes.setResizable(false);
        
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
                    "SELECT * FROM animes WHERE `id` = "+id);
            


            while (resultSet.next()) {
                ids = resultSet.getInt("id");
                juduls = resultSet.getString("judul").trim();
                ratings = resultSet.getFloat("rating");
                episodes  = resultSet.getInt("episode");
                genres = resultSet.getString("genre").trim();
                studios = resultSet.getString("studio").trim();
                haris = resultSet.getString("hari").trim();
                sinopsiss = resultSet.getString("sinopsis").trim();
                gambars = resultSet.getString("gambar").trim();
                // varAnime okk = new varAnime(code,title,rating,episode,genre,studio,hari,sinopsis,gambar);
                // // okk();
                // dataAnime.add(okk);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
		// int banyak =10;
		// JPanel[] panel = new JPanel[banyak];
		// JLabel[] judulAnime = new JLabel[banyak];
		// JLabel[] rating = new JLabel[banyak];
		// JLabel[] episode = new JLabel[banyak];
		// JLabel[] genre = new JLabel[banyak];

		JLabel judulAnime = new JLabel(juduls);
		judulAnime.setBounds(20,5,300,30);
		judulAnime.setVisible(true);


		tampilGambar gambar = new tampilGambar();
		gambar.setBounds(10,35,200,300);
		gambar.atur("C:/Users/Abdullah/Favorites/Downloads/pixelate.jpg",gambar.getWidth(),gambar.getHeight());
		gambar.setVisible(true);

		JLabel labelSipnosis = new JLabel("sipnosis :");
		labelSipnosis.setForeground(Color.green);
		labelSipnosis.setBounds(225,35,180,25);
		labelSipnosis.setVisible(true);

	    JTextArea sipnosis = new JTextArea(sinopsiss);
	    // JTextArea sipnosis = new JTextArea();
	    sipnosis.setSize(350,1500);
	    // sipnosis.setOpaque(true);
	    sipnosis.setBackground(Color.black);
	    sipnosis.setVisible(true);
	    sipnosis.setForeground(Color.white);
	    sipnosis.setLineWrap(true);
	    sipnosis.setEditable(false);

	    JScrollPane scroll = new JScrollPane (sipnosis);
	    // scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setBounds(225,35,350,300);
	    scroll.setVisible(true);
	    scroll.getVerticalScrollBar().setPreferredSize(new Dimension(5, 0));
// jScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
	    


	    JLabel labelRating = new JLabel("rating : "+ratings);
	    labelRating.setBounds(30,350,180,25);
	    labelRating.setVisible(true);
	    labelRating.setForeground(Color.black);

	    JLabel labelGenre = new JLabel("genre : "+genres);
	    labelGenre.setBounds(30,390,180,25);
	    labelGenre.setVisible(true);
	    labelGenre.setForeground(Color.black);

	    JLabel labelEpisode = new JLabel("episode : "+episodes);
	    labelEpisode.setBounds(30,430,180,25);
	    labelEpisode.setVisible(true);
	    labelEpisode.setForeground(Color.black);

	    JLabel labelStudio = new JLabel("studio : "+studios);
	    labelStudio.setBounds(30,470,180,25);
	    labelStudio.setVisible(true);
	    labelStudio.setForeground(Color.black);

	    JLabel labelHari = new JLabel("hari : "+haris);
	    labelHari.setBounds(30,510,180,25);
	    labelHari.setVisible(true);
	    labelHari.setForeground(Color.black);

	    formAnimes.add(labelGenre);
	    formAnimes.add(scroll);
	    formAnimes.add(labelEpisode);
	    formAnimes.add(labelHari);
	    formAnimes.add(labelStudio);
	    formAnimes.add(labelRating);
		formAnimes.add(judulAnime);
		formAnimes.add(labelSipnosis);
		// add(sipnosis);
		formAnimes.add(gambar);
		formAnimes.setVisible(true);
	}

	public void show(){

	}
}