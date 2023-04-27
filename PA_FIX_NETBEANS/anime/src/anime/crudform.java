package anime;
import java.sql.*;
import java.io.File;
import javax.swing.*;
import javax.swing.table.*;
public class crudform extends javax.swing.JFrame {
    
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public crudform() {
        initComponents();
        table();
    }
    private void table(){
        DefaultTableModel tbl  = (DefaultTableModel) data_anime.getModel();
        data_anime.setRowHeight(40);
        data_anime.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        data_anime.getColumnModel().getColumn(0).setPreferredWidth(60);
////        data_anime.getColumnModel().getColumn(1).setPreferredWidth(10);
////        data_anime.getColumnModel().getColumn(3).setPreferredWidth(10);
////        data_anime.getColumnModel().getColumn(4).setPreferredWidth(15);
            data_anime.getColumnModel().getColumn(0).setMaxWidth(0);
            data_anime.getColumnModel().getColumn(0).setMinWidth(0);
            data_anime.getColumnModel().getColumn(6).setMinWidth(0);
            data_anime.getColumnModel().getColumn(6).setMaxWidth(0);
            data_anime.getColumnModel().getColumn(7).setMinWidth(0);
            data_anime.getColumnModel().getColumn(7).setMaxWidth(0);
        
//        data_anime.getColumnModel().removeColumn(data_anime.getColumnModel().getColumn(6));
//        data_anime.getColumnModel().removeColumn(data_anime.getColumnModel().getColumn(6));
        
        tbl.setRowCount(0);        
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anime", "root", "");
            // membuat statement dan mengirimkan query ke database
            String sql = "SELECT * FROM animes";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            // mengisi data dari ResultSet ke dalam model
            while(rs.next()) {
                String id = Integer.toString(rs.getInt("id"));
                String namaAnime = rs.getString("judul");
                String rating = Double.toString(rs.getDouble("rating"));
                String genre = rs.getString("genre");
                String episode = Integer.toString(rs.getInt("episode"));
                String hari = rs.getString("hari");
                String sinopsis = rs.getString("sinopsis");
                String gambar = rs.getString("gambar");
                String studio = rs.getString("studio");
                tbl.addRow(new Object []{id, namaAnime, rating, genre, episode, hari, sinopsis, gambar, studio});
                data_anime.setModel(tbl);
            }
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        judul_txt = new javax.swing.JTextField();
        rating_txt = new javax.swing.JTextField();
        genre_txt = new javax.swing.JTextField();
        cb_hari = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gambar_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_browse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sinopsis_txt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        episode_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        studio_txt = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_log_out = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        data_anime = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        judul_txt.setName("tfJudul"); // NOI18N
        judul_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judul_txtActionPerformed(evt);
            }
        });

        rating_txt.setName("tfJudul"); // NOI18N
        rating_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rating_txtActionPerformed(evt);
            }
        });

        genre_txt.setName("tfJudul"); // NOI18N
        genre_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genre_txtActionPerformed(evt);
            }
        });

        cb_hari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));
        cb_hari.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("JUDUL ANIME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("RATING");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("GENRE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("HARI");

        gambar_txt.setName("tfJudul"); // NOI18N
        gambar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambar_txtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("GAMBAR");

        btn_browse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_browse.setText("BROWSE");
        btn_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseActionPerformed(evt);
            }
        });

        sinopsis_txt.setColumns(20);
        sinopsis_txt.setRows(5);
        jScrollPane2.setViewportView(sinopsis_txt);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("SINOPSIS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("CRUD ANIME");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("JUMLAH EPISODE");

        episode_txt.setName("tfJudul"); // NOI18N
        episode_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                episode_txtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("STUDIO");

        studio_txt.setName("tfJudul"); // NOI18N
        studio_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studio_txtActionPerformed(evt);
            }
        });

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_log_out.setText("LOG OUT");
        btn_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cb_hari, javax.swing.GroupLayout.Alignment.LEADING, 0, 109, Short.MAX_VALUE)
                                        .addComponent(gambar_txt, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(btn_browse)
                                    .addComponent(episode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rating_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(judul_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_log_out, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_tambah)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete)
                        .addGap(292, 292, 292))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judul_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rating_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(episode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btn_log_out))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gambar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        data_anime.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Judul", "rating", "genre", "episode", "hari", "sinopsis", "gambar", "studio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data_anime.setColumnSelectionAllowed(true);
        data_anime.setShowGrid(true);
        data_anime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_animeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(data_anime);
        data_anime.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (data_anime.getColumnModel().getColumnCount() > 0) {
            data_anime.getColumnModel().getColumn(0).setResizable(false);
            data_anime.getColumnModel().getColumn(1).setResizable(false);
            data_anime.getColumnModel().getColumn(2).setResizable(false);
            data_anime.getColumnModel().getColumn(3).setResizable(false);
            data_anime.getColumnModel().getColumn(4).setResizable(false);
            data_anime.getColumnModel().getColumn(5).setResizable(false);
            data_anime.getColumnModel().getColumn(6).setResizable(false);
            data_anime.getColumnModel().getColumn(7).setResizable(false);
            data_anime.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void judul_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judul_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judul_txtActionPerformed

    private void rating_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rating_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rating_txtActionPerformed

    private void genre_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genre_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genre_txtActionPerformed

    private void gambar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gambar_txtActionPerformed

    private void btn_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseActionPerformed
        JFileChooser pilihfile = new JFileChooser();
        int returnValue = pilihfile.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            File pathfile = pilihfile.getSelectedFile();
            gambar_txt.setText(pathfile.getAbsolutePath());
        }
    }//GEN-LAST:event_btn_browseActionPerformed

    private void episode_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_episode_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_episode_txtActionPerformed

    private void studio_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studio_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studio_txtActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/anime", "root", "");
                String sql = "insert into animes (judul, rating, genre, episode, hari, sinopsis, gambar, studio) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, judul_txt.getText());
                stmt.setDouble(2, Double.parseDouble(rating_txt.getText()));
                stmt.setString(3, genre_txt.getText());
                stmt.setInt(4, Integer.parseInt(episode_txt.getText()));
                stmt.setString(5, cb_hari.getSelectedItem().toString());
                stmt.setString(6, sinopsis_txt.getText());
                stmt.setString(7, gambar_txt.getText());
                stmt.setString(8, studio_txt.getText());

                int masukan_row = stmt.executeUpdate();

                if(masukan_row > 0){
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!!!");
                    judul_txt.setText("");
                    sinopsis_txt.setText("");
                    genre_txt.setText("");
                    episode_txt.setText("");
                    rating_txt.setText("");
                    studio_txt.setText("");
                    cb_hari.setSelectedIndex(-1);
                    gambar_txt.setText("");
                    table();
                }
                conn.close();
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Data gak bisa masuk!!! terjadi error:" + ex.getMessage());
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void data_animeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_animeMouseClicked
        int baris = data_anime.getSelectedRow();
        judul_txt.setText(data_anime.getValueAt(baris,1).toString());
        rating_txt.setText(data_anime.getValueAt(baris,2).toString());
        genre_txt.setText(data_anime.getValueAt(baris,3).toString());
        studio_txt.setText(data_anime.getValueAt(baris,8).toString());
        episode_txt.setText(data_anime.getValueAt(baris,4).toString());
        cb_hari.setSelectedItem(data_anime.getValueAt(baris,5).toString());
        gambar_txt.setText(data_anime.getValueAt(baris,7).toString());
        sinopsis_txt.setText(data_anime.getValueAt(baris,6).toString());
    }//GEN-LAST:event_data_animeMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int baris = data_anime.getSelectedRow();
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anime", "root", "");
//            String query = "SELECT * FROM animes WHERE judul = ?";
//            pst = conn.prepareStatement(query);
//            pst.setString(1, judul_txt.getText());
//            rs = pst.executeQuery();
//            
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "Judul anime sudah ada di database");
//            }
//            else{
                String sql = "UPDATE animes SET judul=?, rating=?, genre=?, episode=?, hari=?, sinopsis=?, gambar=?, studio=? WHERE id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, judul_txt.getText());
                pst.setString(2, rating_txt.getText());
                pst.setString(3, genre_txt.getText());
                pst.setString(4, episode_txt.getText());
                pst.setString(5, cb_hari.getSelectedItem().toString());
                pst.setString(6, sinopsis_txt.getText());
                pst.setString(7, gambar_txt.getText());
                pst.setString(8, studio_txt.getText());
                pst.setString(9, data_anime.getValueAt(baris,0).toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATA ANIME SUDAH DIUPDATE");
                table();
//            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int baris = data_anime.getSelectedRow();
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anime", "root", "");
            int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM animes WHERE id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, data_anime.getValueAt(baris,0).toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATA ANIME SUDAH DIHAPUS!!!");
                table();
            } else {
                JOptionPane.showMessageDialog(null, "DATA TIDAK JADI DIHAPUS!!!");
                table();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_outActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Log Out", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
                landing_page home = new landing_page();
                home.setVisible(true);
                this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "SAYA KENA PRANK!!!!");
            table();
        }
    }//GEN-LAST:event_btn_log_outActionPerformed

    public static void main(String args[]) {
    
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crudform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_browse;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_log_out;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_hari;
    private javax.swing.JTable data_anime;
    private javax.swing.JTextField episode_txt;
    private javax.swing.JTextField gambar_txt;
    private javax.swing.JTextField genre_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField judul_txt;
    private javax.swing.JTextField rating_txt;
    private javax.swing.JTextArea sinopsis_txt;
    private javax.swing.JTextField studio_txt;
    // End of variables declaration//GEN-END:variables
}

