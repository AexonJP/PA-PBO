import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;
// import javax.swing.JTextArea.setLineWrap;

class panelTambah extends JPanel{
	panelTambah(){
		setBounds(0,25,600,675);
		setBackground(new Color(18,18,18));
		setLayout(null);

		JLabel label1 = new JLabel("Judul Anime");
		label1.setBounds(10,0,180,25);
		label1.setForeground(Color.white);
		add(label1);
		label1.setVisible(true);

		JLabel labelgenre =new JLabel("genre");
		labelgenre.setBounds(300,0,180,25); //20
		labelgenre.setForeground(Color.white);
		add(labelgenre);
		labelgenre.setVisible(true);

		JLabel labelhari =new JLabel("hari");
		labelhari.setBounds(300,65,180,25); //20
		labelhari.setForeground(Color.white);
		add(labelhari);
		labelhari.setVisible(true);

		JLabel labelfile =new JLabel("FILE PATH");
		labelfile.setBounds(303,200,180,25); //20
		labelfile.setForeground(Color.white);
		add(labelfile);
		labelfile.setVisible(true);

		

		String [] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
		JComboBox cbhari = new JComboBox<>(hari);
		cbhari.setBounds(300,95,180,25);
		add(cbhari);
		cbhari.setVisible(true);

		JButton btfile= new JButton("OPEN FILE");
        btfile.setMargin( new Insets(5, 5, 5, 5) );
        btfile.setBounds(300,160,100,20);
        btfile.setFont(new Font("Dialog", Font.PLAIN, 11 ));
        //add button to the frame
        add(btfile);
        btfile.setVisible(true);


		JTextField tfgenre = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfgenre.setBounds(295,30,200,25);
		add(tfgenre);
		tfgenre.setVisible(true);

		JTextField tfJudul = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfJudul.setBounds(5,30,200,25);
		add(tfJudul);
		tfJudul.setVisible(true);

		JLabel labelEpisode = new JLabel("episode");
		labelEpisode.setBounds(10,65,180,25);
		labelEpisode.setForeground(Color.white);
		add(labelEpisode);
		labelEpisode.setVisible(true);

		JTextField tfEpisode = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfEpisode.setBounds(5,95,200,25);
		add(tfEpisode);
		tfEpisode.setVisible(true);

		JLabel labelRating = new JLabel("Rating Anime");
		labelRating.setBounds(10,130,180,25);// 10
		labelRating.setForeground(Color.white);
		add(labelRating);
		labelRating.setVisible(true);

		JTextField tfRating = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfRating.setBounds(5,160,200,25);// 10
		add(tfRating);
		tfRating.setVisible(true);

		JLabel labelStudio = new JLabel("Studio Anime");
		labelStudio.setBounds(10,195,180,25); // 15
		labelStudio.setForeground(Color.white);
		add(labelStudio);
		labelStudio.setVisible(true);

		JTextField tfStudio = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfStudio.setBounds(5,225,200,25); //15
		add(tfStudio);
		tfStudio.setVisible(true);

		JLabel labelSipnosis =new JLabel("Sipnosis");
		labelSipnosis.setBounds(10,260,180,25); //20
		labelSipnosis.setForeground(Color.white);
		add(labelSipnosis);
		labelSipnosis.setVisible(true);

		JTextArea tfSipnosis = new JTextArea();
		tfSipnosis.setLineWrap(true);
		tfSipnosis.setBounds(5,290, 400,200); //20
		add(tfSipnosis);
		tfSipnosis.setVisible(true);



		JButton btTambah= new JButton("Tambah");
        btTambah.setMargin( new Insets(5, 5, 5, 5) );
        btTambah.setBounds(270,595,60,20);
        btTambah.setFont(new Font("Dialog", Font.PLAIN, 11 ));
        //add button to the frame
        add(btTambah);
        btTambah.setVisible(true);


        btfile.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		JFileChooser pilihfile = new JFileChooser();
        		int returnValue = pilihfile.showOpenDialog(null);
        		if(returnValue == JFileChooser.APPROVE_OPTION){
        			File pathfile = pilihfile.getSelectedFile();
        			labelfile.setText(pathfile.getAbsolutePath());
        		}
        	}
        });

        btTambah.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		try{
        			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/anime", "root", "");
        			String sql = "insert into animes (judul, rating, genre, episode, hari, sinopsis, gambar, studio) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        			PreparedStatement stmt = conn.prepareStatement(sql);
        			stmt.setString(1, tfJudul.getText());
        			stmt.setDouble(2, Double.parseDouble(tfRating.getText()));
        			stmt.setString(3, tfgenre.getText());
        			stmt.setInt(4, Integer.parseInt(tfEpisode.getText()));
        			stmt.setString(5, cbhari.getSelectedItem().toString());
        			stmt.setString(6, tfSipnosis.getText());
        			stmt.setString(7, labelfile.getText());
        			stmt.setString(8, tfStudio.getText());

        			int masukan_row = stmt.executeUpdate();

        			if(masukan_row > 0){
        				JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!!!");
        				tfJudul.setText("");
			        	tfSipnosis.setText("");
			        	tfgenre.setText("");
			        	tfEpisode.setText("");
			        	tfRating.setText("");
			        	tfStudio.setText("");
			        	cbhari.setSelectedIndex(-1);
			        	labelfile.setText("OPEN FILE");
        			}

        			conn.close();
        		}catch(SQLException ex){
        			JOptionPane.showMessageDialog(null, "Data gak bisa masuk!!! terjadi error:" + ex.getMessage());
        		}
        	}

        });

	}

	
}