import javax.swing.*;
// import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
class varAnime{
	Integer id ;
	String judul;
	Float rating;
	Integer episode;
	String genre;
	String studio;
	String hari;
	String sinopsis;
	String gambar;

	public varAnime(Integer id,String judul,Float rating,Integer episode,String genre,String studio, String hari, String sinopsis,String gambar){
		this.id = id;
		this.judul = judul;
		this.rating = rating;
		this.episode = episode;
		this.genre = genre;
		this.studio = studio;
		this.hari = hari;
		this.sinopsis = sinopsis;
		this.gambar = gambar;
	}

// 	void lihatAnime(){
// 		JPanel panel = new JPanel();
// 		panel.setBounds(40,80,500,500);
// 		panel.setBackground(Color.blue);

// 	}
}