package perpus10517041;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pengembaliansir extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel tabModel;
   
    public pengembaliansir() {
        initComponents();
        conn = koneksi.getConnection();
        setJTable();
        setTitle("PENGEMBALIAN BUKU");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNoAnggota = new javax.swing.JTextField();
        BLihat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTglPinjam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTglKembali = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TKembali = new javax.swing.JTable();
        BTambah = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BClose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtNoKembali = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 25, 80));
        jLabel1.setText("No Anggota");

        txtNoAnggota.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNoAnggota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoAnggota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoAnggotaKeyPressed(evt);
            }
        });

        BLihat.setBackground(new java.awt.Color(32, 25, 80));
        BLihat.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BLihat.setForeground(new java.awt.Color(255, 255, 255));
        BLihat.setText("Lihat Data");
        BLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLihatActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 25, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No Kembali");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 25, 80));
        jLabel3.setText("Tanggal Pinjam");

        txtTglPinjam.setEditable(false);
        txtTglPinjam.setEnabled(false);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 25, 80));
        jLabel4.setText("Tanggal Kembali");

        txtTglKembali.setEnabled(false);
        txtTglKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTglKembaliKeyPressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 25, 80));
        jLabel5.setText("Denda ");

        txtDenda.setEditable(false);
        txtDenda.setEnabled(false);

        TKembali.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TKembali.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TKembali);

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

        BSimpan.setBackground(new java.awt.Color(32, 25, 80));
        BSimpan.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BSimpan.setText("Simpan");
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BBatal.setBackground(new java.awt.Color(32, 25, 80));
        BBatal.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        BBatal.setForeground(new java.awt.Color(255, 255, 255));
        BBatal.setText("Batal");
        BBatal.setEnabled(false);
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

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 25, 80));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Judul Buku");

        txtJudul.setEditable(false);
        txtJudul.setEnabled(false);

        txtNoKembali.setEditable(false);
        txtNoKembali.setEnabled(false);

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 25, 80));
        jLabel7.setText("Lama Pinjam");

        txtLama.setEditable(false);
        txtLama.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("* keterlambatan 5000/hari");

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 25, 80));
        jLabel9.setText("Keterlambatan");

        txtTelat.setEditable(false);
        txtTelat.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("hari");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("hari");

        txtKodeBuku.setEditable(false);
        txtKodeBuku.setEnabled(false);

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 25, 80));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Kode Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNoKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTglPinjam)
                                .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDenda)
                                    .addComponent(txtTelat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(BLihat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(txtNoAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(BTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BClose, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLihat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTelat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNoKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BSimpan)
                    .addComponent(BBatal)
                    .addComponent(BClose))
                .addGap(56, 56, 56))
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
    String [] JudulKolom={"No Anggota","Nama","Kode Buku","Judul Buku", "Tgl_Pinjam"};
    tabModel = new DefaultTableModel(null, JudulKolom){
                  boolean[] canEdit = new boolean [] {false,false,false,false,false};
                  @Override
                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit [columnIndex];
                  }
              };
    TKembali.setModel(tabModel);
    TKembali.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TKembali.getColumnModel().getColumn(0).setPreferredWidth(90);
    TKembali.getColumnModel().getColumn(1).setPreferredWidth(150);
    TKembali.getColumnModel().getColumn(2).setPreferredWidth(90);
    TKembali.getColumnModel().getColumn(3).setPreferredWidth(250);
    TKembali.getColumnModel().getColumn(4).setPreferredWidth(122);

//    getData();
} // Akhir setJTable
    
    private void tanggalKembali(){
    Date tgl_sekarang = new Date();
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    String tgl=format.format(tgl_sekarang);
    txtTglKembali.setText(tgl);
}
    private void hitungLama(){
    try {
        String pinjam = txtTglPinjam.getText();
        String kembali = txtTglKembali.getText();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalpinjam = format.parse(pinjam);
        Date tanggalkembali = format.parse(kembali);
        long tanggalpinjam1 = tanggalpinjam.getTime();
        long tanggalkembali1 = tanggalkembali.getTime();
        long diff = tanggalkembali1 - tanggalpinjam1;
        long lama = diff / (24 * 60 * 60 * 1000);
        txtLama.setText(String.valueOf(lama));
    } catch (Exception e) {
        System.out.println("" + e.getMessage());
    }
    }
    
    private void hitungDenda(){
        long lama,denda = 0,telat;
        lama = Long.valueOf(txtLama.getText());
        if(lama>5)
        {
            telat = lama-5;
            txtTelat.setText(String.valueOf(telat));
            denda = telat*5000;
        }
        else if(lama<=5){
            telat = 0;
            txtTelat.setText(String.valueOf(telat));
        }
        
        txtDenda.setText(String.valueOf(denda));
    }
    
    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
            noKembali();
            ambilData_dari_JTable();
            BSimpan.setEnabled(true);
            BBatal.setEnabled(true); 
            tanggalKembali();
            hitungLama();
            hitungDenda();
    }//GEN-LAST:event_BTambahActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
         try{
                // Menyimpan ke Tabel Pinjam
                String sql="INSERT INTO kembali values(?,?,?)";
                PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1,txtNoKembali.getText());
                st.setString(2,txtTglKembali.getText());
                st.setString(3,txtNoAnggota.getText());
                int rs= st.executeUpdate();

                // Menyimpan Ke detail kembali
                
                String sql2="INSERT INTO detailkembali VALUES(?,?,?,?,?)";
                PreparedStatement st2=conn.prepareStatement(sql2);
                    st2.setString(1,txtNoKembali.getText());
                    st2.setString(2,txtKodeBuku.getText());
                    st2.setString(3,"1");
                    st2.setString(4, txtLama.getText());
                    st2.setString(5, txtDenda.getText());
                int rs2= st2.executeUpdate();
                    
                // Merubah status Buku
                String sql3="UPDATE buku SET status=? WHERE kode_buku=?";
                PreparedStatement st3=conn.prepareStatement(sql3);
                    st3.setString(1,"Teredia");
                    st3.setString(2,txtKodeBuku.getText());
                    st3.executeUpdate();
                
                if((rs>0) && (rs2>0)){
                    JOptionPane.showMessageDialog(this,"Input Berhasil");
                    Kosongkan();
                } else
                    JOptionPane.showMessageDialog(this,"Input Gagal");
        } // akhir try
        catch(Exception e){
            System.out.println("Exception " +e);
        }
    }//GEN-LAST:event_BSimpanActionPerformed

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

    private void txtTglKembaliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTglKembaliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglKembaliKeyPressed

    private void BLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLihatActionPerformed
        // TODO add your handling code here:
        BTambah.setEnabled(true);
        String sql;
        String noAgt = txtNoAnggota.getText();
    try {
       sql ="SELECT p.NoAnggota, a.Nama, b.kode_buku, b.judul, p.TglPinjam FROM pinjam p INNER JOIN anggota a ON p.NoAnggota = a.NoAnggota INNER JOIN detailpinjam d  ON d.NoPinjam = p.NoPinjam  INNER JOIN buku b  ON b.kode_buku = d.kode_buku WHERE  d.status = '0' AND p.NoAnggota ='" +txtNoAnggota.getText() + "'";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs =st.executeQuery();

        hapusIsiJTable();
        while (rs.next()) {
             String NoAnggota = rs.getString("NoAnggota");
             String Nama = rs.getString("Nama");
             String kode = rs.getString("kode_buku");
             String judul = rs.getString("judul");
             String tgl = rs.getString("TglPinjam");
             Object [] data = {NoAnggota,Nama,kode,judul,tgl};
             tabModel.addRow(data);    
        }
        
         if(tabModel.getRowCount()>0)         
             JOptionPane.showMessageDialog(this,"Data Ditemukan ");  
         
        else
            JOptionPane.showMessageDialog(this,"Data Tidak Ditemukan.. ");
      }
  catch (SQLException se) {}  
    }//GEN-LAST:event_BLihatActionPerformed

    private void txtNoAnggotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoAnggotaKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==10){
            BLihat.requestFocus();
        }
    }//GEN-LAST:event_txtNoAnggotaKeyPressed

    public void hapusIsiJTable() {
        int row = tabModel.getRowCount();
        for (int i = 0; i < row; i++) {
          tabModel.removeRow(0);
        }
    }
    private void noKembali(){
    try{
        String sql= "SELECT*FROM kembali ORDER BY NoKembali DESC";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        if (rs.next()){
           String no= rs.getString("NoKembali").substring(2);
           String AN = "" + (Integer.parseInt(no)+1);
           String nol = "";
           
           if(AN.length()==1)
               nol = "00";
           else if (AN.length()==2)
               nol = "0";
           else if (AN.length()==3)
               nol = "";
           
           txtNoKembali.setText("KB" + nol + AN);
        } else
           txtNoKembali.setText("KB001");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void ambilData_dari_JTable() {
    int row = TKembali.getSelectedRow();

    // Mengambil data yang dipilih pada JTable
    String kode = tabModel.getValueAt(row, 2).toString();
    String judul = tabModel.getValueAt(row, 3).toString();
    String tglPinjam = tabModel.getValueAt(row, 4).toString();
    
    txtKodeBuku.setText(kode);
    txtJudul.setText(judul);
    txtTglPinjam.setText(tglPinjam);
  }
    
  private void Kosongkan(){
     txtNoKembali.setText("");
     txtJudul.setText("");
     txtLama.setText("");
     txtTglKembali.setText("");
     txtTglPinjam.setText("");
     txtDenda.setText("");
     txtTelat.setText("");
     txtNoAnggota.setText("");
     txtKodeBuku.setText("");

     int row=tabModel.getRowCount();
     for(int i=0;i<row;i++){
         tabModel.removeRow(0);
     }

     txtTglKembali.setEnabled(false);
     

 }
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
            java.util.logging.Logger.getLogger(pengembaliansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembaliansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembaliansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembaliansir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembaliansir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BClose;
    private javax.swing.JButton BLihat;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JTable TKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNoAnggota;
    private javax.swing.JTextField txtNoKembali;
    private javax.swing.JTextField txtTelat;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
