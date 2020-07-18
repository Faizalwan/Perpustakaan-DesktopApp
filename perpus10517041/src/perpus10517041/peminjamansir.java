package perpus10517041;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class peminjamansir extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel tabModel;
    public peminjamansir() {
        initComponents();
        conn = koneksi.getConnection();
        setJTable();
        setTitle("PEMINJAMAN BUKU");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNoPinjam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNoAnggota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTglPinjam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPinjam = new javax.swing.JTable();
        BTambah1 = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 25, 80));
        jLabel1.setText("No Pinjam");

        txtNoPinjam.setEditable(false);
        txtNoPinjam.setForeground(new java.awt.Color(51, 51, 51));
        txtNoPinjam.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 25, 80));
        jLabel2.setText("No Anggota");

        txtNoAnggota.setForeground(new java.awt.Color(51, 51, 51));
        txtNoAnggota.setEnabled(false);
        txtNoAnggota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoAnggotaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 25, 80));
        jLabel3.setText("Nama");

        txtNama.setForeground(new java.awt.Color(51, 51, 51));
        txtNama.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 25, 80));
        jLabel4.setText("Tgl Pinjam");

        txtTglPinjam.setEditable(false);
        txtTglPinjam.setForeground(new java.awt.Color(51, 51, 51));
        txtTglPinjam.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 25, 80));
        jLabel5.setText("Kode Buku");

        txtKodeBuku.setForeground(new java.awt.Color(51, 51, 51));
        txtKodeBuku.setEnabled(false);
        txtKodeBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeBukuKeyPressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 25, 80));
        jLabel6.setText("Judul");

        txtJudul.setForeground(new java.awt.Color(51, 51, 51));
        txtJudul.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 25, 80));
        jLabel7.setText("Status");

        txtStatus.setForeground(new java.awt.Color(51, 51, 51));
        txtStatus.setEnabled(false);

        BTambah.setBackground(new java.awt.Color(32, 25, 80));
        BTambah.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BTambah.setForeground(new java.awt.Color(255, 255, 255));
        BTambah.setText("Tambah");
        BTambah.setEnabled(false);
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BHapus.setBackground(new java.awt.Color(32, 25, 80));
        BHapus.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BHapus.setForeground(new java.awt.Color(255, 255, 255));
        BHapus.setText("Hapus");
        BHapus.setEnabled(false);
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        TPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TPinjam);

        BTambah1.setBackground(new java.awt.Color(32, 25, 80));
        BTambah1.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BTambah1.setForeground(new java.awt.Color(255, 255, 255));
        BTambah1.setText("Tambah");
        BTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambah1ActionPerformed(evt);
            }
        });

        BSimpan.setBackground(new java.awt.Color(32, 25, 80));
        BSimpan.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BSimpan.setText("Simpan");
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BBatal.setBackground(new java.awt.Color(32, 25, 80));
        BBatal.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BBatal.setForeground(new java.awt.Color(255, 255, 255));
        BBatal.setText("Batal");
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        BClose.setBackground(new java.awt.Color(32, 25, 80));
        BClose.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BClose.setForeground(new java.awt.Color(255, 255, 255));
        BClose.setText("Close");
        BClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(BTambah)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BHapus)
                            .addGap(483, 483, 483))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNoAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNoPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(BTambah1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BClose)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNoAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah1)
                    .addComponent(BSimpan)
                    .addComponent(BBatal)
                    .addComponent(BClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setJTable(){
    String [] JudulKolom={"Kode Buku","Judul"};
    tabModel = new DefaultTableModel(null, JudulKolom){
                  boolean[] canEdit = new boolean [] { false, false };
                  @Override
                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit [columnIndex];
                  }
              };
    TPinjam.setModel(tabModel);
    TPinjam.getColumnModel().getColumn(0).setPreferredWidth(100);
    TPinjam.getColumnModel().getColumn(1).setPreferredWidth(200);
}

private void tanggalPinjam(){
    Date tgl_sekarang = new Date();
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    String tgl=format.format(tgl_sekarang);
    txtTglPinjam.setText(tgl);
}
    
    private void txtNoAnggotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoAnggotaKeyPressed
        // TODO add your handling code here:
            if (evt.getKeyCode()==10){
            try {                
                String sql="SELECT * FROM anggota WHERE NoAnggota=?";
                PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1,txtNoAnggota.getText());
                ResultSet rs= st.executeQuery();
                if( rs.next()){
                    String Nama = rs.getString("Nama");
                    txtNama.setText(Nama);
                    txtKodeBuku.requestFocus();
                } else{
                    JOptionPane.showMessageDialog(this, "No Anggota Tidak  Ada","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    txtNama.setText("");
                }
            } // akhir try
            catch(Exception e){
                System.out.println("Koneksi Gagal " +e.getMessage());
            }
        }

    }//GEN-LAST:event_txtNoAnggotaKeyPressed

    private void txtKodeBukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeBukuKeyPressed
        // TODO add your handling code here:
      if (evt.getKeyCode()==10){           
        try {
        String sql="SELECT * FROM buku WHERE kode_buku=?";
        PreparedStatement st=conn.prepareStatement(sql);
        st.setString(1,txtKodeBuku.getText());
        ResultSet rs= st.executeQuery();

        if( rs.next()){
            String Judul = rs.getString("judul");
            String Status = rs.getString("status");
            txtJudul.setText(Judul);
            txtStatus.setText(Status);
            BTambah.requestFocus();
       }else
        {
        JOptionPane.showMessageDialog(this, "Kode Buku Tidak Ada","Informasi",JOptionPane.INFORMATION_MESSAGE);
        txtJudul.setText("");
        txtStatus.setText("");
        }
        } // akhir try
          catch(Exception e){
             System.out.println("Exception :  " +e);
          }
    }
    }//GEN-LAST:event_txtKodeBukuKeyPressed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
        String KodeBuku;
        boolean ketemu=false;

        int jum=tabModel.getRowCount();
        if(txtStatus.getText().equalsIgnoreCase("Tersedia")){

            for(int i=0;i<jum;i++){
                KodeBuku = tabModel.getValueAt(i, 0).toString();
                if(KodeBuku.equalsIgnoreCase(txtKodeBuku.getText())){
                    JOptionPane.showMessageDialog(this,"Buku Sudah Ada Pada List Pinjaman");
                    ketemu=true;
                    TPinjam.setRowSelectionInterval(i, i);
                    break;}
            }
            if (ketemu==false) {
                String Data[]={txtKodeBuku.getText(),txtJudul.getText()};
                tabModel.addRow(Data);

                txtKodeBuku.setText("");
                txtJudul.setText("");
                txtStatus.setText("");
            }
        } else
            JOptionPane.showMessageDialog(this, "Buku ini sedang dipinjam","Informasi",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BTambahActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
        int row=TPinjam.getSelectedRow();
        System.out.println(row);
        if(row>=0)
            tabModel.removeRow(row);
        else
            JOptionPane.showMessageDialog(this, "Hapus Gagal");

    }//GEN-LAST:event_BHapusActionPerformed

    private void noPinjam(){
    try{
        String sql= "SELECT*FROM pinjam ORDER BY NoPinjam DESC";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        if (rs.next()){
           String no= rs.getString("NoPinjam").substring(2);
           String AN = "" + (Integer.parseInt(no)+1);
           String nol = "";
           
           if(AN.length()==1)
               nol = "00";
           else if (AN.length()==2)
               nol = "0";
           else if (AN.length()==3)
               nol = "";
           
           txtNoPinjam.setText("PJ" + nol + AN);
        } else
           txtNoPinjam.setText("PJ001");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

    private void Kosongkan(){
     txtNoPinjam.setText("");
     txtNoAnggota.setText("");
     txtTglPinjam.setText("");
     txtNama.setText("");
     txtKodeBuku.setText("");
     txtJudul.setText("");
     txtStatus.setText("");

     int row=tabModel.getRowCount();
     for(int i=0;i<row;i++){
         tabModel.removeRow(0);
     }

     txtNoPinjam.setEnabled(false);
     txtNoAnggota.setEnabled(false);
     txtKodeBuku.setEnabled(false);

 }

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
            try{
            if(txtNama.getText().isEmpty() || tabModel.getRowCount()==0 ){
                JOptionPane.showMessageDialog(this,"Silahkan Input Anggota dan Buku");
            } else {
                // Menyimpan ke Tabel Pinjam
                String sql="INSERT INTO pinjam values(?,?,?)";
                PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1,txtNoPinjam.getText());
                st.setString(2,txtTglPinjam.getText());
                st.setString(3,txtNoAnggota.getText());
                int rs= st.executeUpdate();

                String KodeBuku; int rs2=0;
                int jum=tabModel.getRowCount();
                for(int i=0;i<jum;i++){
                    // Menyimpan Ke detail Pinjam
                    String sql2="INSERT INTO detailpinjam VALUES(?,?,?)";
                    PreparedStatement st2=conn.prepareStatement(sql2);
                    KodeBuku = tabModel.getValueAt(i, 0).toString();
                    st2.setString(1,txtNoPinjam.getText());
                    st2.setString(2,KodeBuku);
                    st2.setString(3,"0");
                    rs2= st2.executeUpdate();
                    // Merubah status Buku
                    String sql3="UPDATE buku SET status=? WHERE kode_buku=?";
                    PreparedStatement st3=conn.prepareStatement(sql3);
                    st3.setString(1,"Dipinjam");
                    st3.setString(2,KodeBuku);
                    st3.executeUpdate();
                }
                if((rs>0) && (rs2>0)){
                    JOptionPane.showMessageDialog(this,"Input Berhasil");
                    Kosongkan();
                } else
                    JOptionPane.showMessageDialog(this,"Input Gagal");
                
            }

        } // akhir try
        catch(Exception e){
            System.out.println("Exception " +e);

        }

    }//GEN-LAST:event_BSimpanActionPerformed

    private void BTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambah1ActionPerformed
        // TODO add your handling code here:

        noPinjam();
        tanggalPinjam();
        txtNoAnggota.setEnabled(true);
        txtKodeBuku.setEnabled(true);
        BTambah.setEnabled(true);
        BHapus.setEnabled(true);

    }//GEN-LAST:event_BTambah1ActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
        Kosongkan();
    }//GEN-LAST:event_BBatalActionPerformed

    private void BCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCloseActionPerformed
        // TODO add your handling code here:
        sirkulasi sir = new sirkulasi();
        sir.setVisible(true);
        dispose();
    }//GEN-LAST:event_BCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(peminjamansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peminjamansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peminjamansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peminjamansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peminjamansir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BClose;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JButton BTambah1;
    private javax.swing.JTable TPinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoAnggota;
    private javax.swing.JTextField txtNoPinjam;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
