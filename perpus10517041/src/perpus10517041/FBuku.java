package perpus10517041;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class FBuku extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel tabModel;
    
    public FBuku() {
       initComponents();
       conn=koneksi.getConnection();
       setJTable();
       setTitle("FORM BUKU ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPenulis = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtJudul = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtPenerbit = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtTahunTerbit = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        CBStatus = new javax.swing.JComboBox();
        BTambah = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BClose = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CBCari = new javax.swing.JComboBox();
        txtCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBuku = new javax.swing.JTable();
        BCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus10517041/small.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(32, 25, 80));
        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 25, 80));
        jLabel7.setText("DATA BUKU");

        jLabel11.setBackground(new java.awt.Color(32, 25, 80));
        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 25, 80));
        jLabel11.setText("PERPUSTAKAAN UNIKOM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)))
                .addGap(112, 112, 112))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 90));

        jPanel2.setBackground(new java.awt.Color(32, 25, 80));
        jPanel2.setForeground(new java.awt.Color(147, 188, 248));

        jLabel1.setBackground(new java.awt.Color(147, 188, 248));
        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(147, 188, 248));
        jLabel1.setText("Kode Buku");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(147, 188, 248));
        jLabel2.setText("Penulis");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(147, 188, 248));
        jLabel3.setText("Judul");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(147, 188, 248));
        jLabel4.setText("Penerbit");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(147, 188, 248));
        jLabel5.setText("Tahun Terbit");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(147, 188, 248));
        jLabel6.setText("Status");

        txtKodeBuku.setEditable(false);
        txtKodeBuku.setBackground(new java.awt.Color(32, 25, 80));
        txtKodeBuku.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtKodeBuku.setForeground(new java.awt.Color(204, 204, 204));
        txtKodeBuku.setBorder(null);
        txtKodeBuku.setEnabled(false);

        jSeparator1.setForeground(new java.awt.Color(147, 188, 248));

        txtPenulis.setBackground(new java.awt.Color(32, 25, 80));
        txtPenulis.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtPenulis.setForeground(new java.awt.Color(204, 204, 204));
        txtPenulis.setBorder(null);
        txtPenulis.setEnabled(false);

        txtJudul.setBackground(new java.awt.Color(32, 25, 80));
        txtJudul.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtJudul.setForeground(new java.awt.Color(204, 204, 204));
        txtJudul.setBorder(null);
        txtJudul.setEnabled(false);

        txtPenerbit.setBackground(new java.awt.Color(32, 25, 80));
        txtPenerbit.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtPenerbit.setForeground(new java.awt.Color(204, 204, 204));
        txtPenerbit.setBorder(null);
        txtPenerbit.setEnabled(false);

        txtTahunTerbit.setBackground(new java.awt.Color(32, 25, 80));
        txtTahunTerbit.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtTahunTerbit.setForeground(new java.awt.Color(204, 204, 204));
        txtTahunTerbit.setBorder(null);
        txtTahunTerbit.setEnabled(false);

        CBStatus.setBackground(new java.awt.Color(39, 71, 133));
        CBStatus.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        CBStatus.setForeground(new java.awt.Color(103, 141, 216));
        CBStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tersedia", "Dipinjam" }));
        CBStatus.setEnabled(false);

        BTambah.setBackground(new java.awt.Color(60, 116, 229));
        BTambah.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BTambah.setForeground(new java.awt.Color(255, 255, 255));
        BTambah.setText("TAMBAH");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BSimpan.setBackground(new java.awt.Color(60, 116, 229));
        BSimpan.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BSimpan.setText("SIMPAN");
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BEdit.setBackground(new java.awt.Color(60, 116, 229));
        BEdit.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BEdit.setForeground(new java.awt.Color(255, 255, 255));
        BEdit.setText("EDIT");
        BEdit.setEnabled(false);
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        BBatal.setBackground(new java.awt.Color(60, 116, 229));
        BBatal.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BBatal.setForeground(new java.awt.Color(255, 255, 255));
        BBatal.setText("BATAL");
        BBatal.setEnabled(false);
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        BHapus.setBackground(new java.awt.Color(60, 116, 229));
        BHapus.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BHapus.setForeground(new java.awt.Color(255, 255, 255));
        BHapus.setText("HAPUS");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BClose.setBackground(new java.awt.Color(60, 116, 229));
        BClose.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BClose.setForeground(new java.awt.Color(255, 255, 255));
        BClose.setText("CLOSE");
        BClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCloseActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(147, 188, 248));
        jLabel9.setText("Cari Berdasarkan");

        CBCari.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        CBCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kode Buku", "Judul", "Penulis", "Tahun Terbit", "Penerbit", "Status" }));

        txtCari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCariCaretUpdate(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        BCari.setBackground(new java.awt.Color(60, 116, 229));
        BCari.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BCari.setForeground(new java.awt.Color(255, 255, 255));
        BCari.setText("CARI");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        TBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TBuku);

        BCetak.setBackground(new java.awt.Color(60, 116, 229));
        BCetak.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        BCetak.setForeground(new java.awt.Color(255, 255, 255));
        BCetak.setText("CETAK");
        BCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CBCari, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BCari, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BClose, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(txtTahunTerbit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtKodeBuku, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtJudul)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtPenerbit)
                            .addComponent(jSeparator4))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator2)
                            .addComponent(txtPenulis)
                            .addComponent(CBStatus, 0, 194, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BCari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 760, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
       if(BSimpan.getText().equalsIgnoreCase("SIMPAN"))
            simpanData();
        else
            updateData();

        txtKodeBuku.setText("");
        txtJudul.setText("");        
        txtPenulis.setText("");
        txtTahunTerbit.setText("");
        txtPenerbit.setText("");
        

        txtKodeBuku.setEnabled(false); // txtNoAnggota Tidak Aktif
        txtJudul.setEnabled(false);       
        txtPenulis.setEnabled(false);
        txtTahunTerbit.setEnabled(false);
        txtPenerbit.setEnabled(false);
        CBStatus.setEnabled(false);
       
        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BClose.setEnabled(true);  
    }//GEN-LAST:event_BSimpanActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
        
        txtKodeBuku.setEnabled(false); 
        txtJudul.setEnabled(true);       
        txtPenulis.setEnabled(true);
        txtTahunTerbit.setEnabled(true);
        txtPenerbit.setEnabled(true);
        CBStatus.setEnabled(true);  

        BSimpan.setText("UPDATE"); 

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(false);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BClose.setEnabled(false);

        // Memanggil Method  ambilData_dari_JTable()
        ambilData_dari_JTable();
    }//GEN-LAST:event_BEditActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
        kodeBuku();
        
        txtKodeBuku.setEnabled(true); 
        txtJudul.setEnabled(true);       
        txtPenulis.setEnabled(true);
        txtTahunTerbit.setEnabled(true);
        txtPenerbit.setEnabled(true);
        CBStatus.setEnabled(true);  
        BSimpan.setText("SIMPAN");

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(true);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BClose.setEnabled(false);
    }//GEN-LAST:event_BTambahActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_BHapusActionPerformed

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
        String sql;
        int pilih = CBCari.getSelectedIndex();
        String cari = txtCari.getText();
    try {
        if(pilih==0)
        sql ="SELECT * FROM buku WHERE kode_buku ='" +txtCari.getText() + "'";
        else if(pilih==1)
        sql ="SELECT * FROM buku WHERE judul Like '%" +txtCari.getText() + "%'";
        else if(pilih==2)
        sql ="SELECT * FROM buku WHERE penulis Like '%" +txtCari.getText() + "%'";
        else if(pilih==3)
        sql ="SELECT * FROM buku WHERE tahun_terbit Like '%" +txtCari.getText() + "%'";
        else if(pilih==4)
        sql ="SELECT * FROM buku WHERE penerbit Like '%" +txtCari.getText() + "%'";
        else
        sql ="SELECT * FROM buku WHERE status Like '%" +txtCari.getText() + "%'";    

        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs =st.executeQuery();

        hapusIsiJTable();
        int no=0;
        while (rs.next()) {
            no++;
             String KodeBuku = rs.getString("kode_buku");
             String Judul = rs.getString("judul");
             String Penulis = rs.getString("penulis");
             String Penerbit = rs.getString("penerbit");
             String Tahun = rs.getString("tahun_terbit");
             String Status = rs.getString("status");
             Object [] data = {no,KodeBuku,Judul,Penulis,Penerbit,Tahun,Status};
             tabModel.addRow(data);
        }
         if(tabModel.getRowCount()>0)         
           JOptionPane.showMessageDialog(this,"Data Ditemukan ");        
        else
            JOptionPane.showMessageDialog(this,"Data Tidak Ditemukan.. ");

      }
      catch (SQLException se) {} 
    }//GEN-LAST:event_BCariActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        txtKodeBuku.setText("");
        txtJudul.setText("");        
        txtPenulis.setText("");
        txtTahunTerbit.setText("");
        txtPenerbit.setText("");

       // Mengatur  Enable Tombol Dan Textfield  
        txtKodeBuku.setEnabled(false); 
        txtJudul.setEnabled(false);       
        txtPenulis.setEnabled(false);
        txtTahunTerbit.setEnabled(false);
        txtPenerbit.setEnabled(false);
        CBStatus.setEnabled(false); 
        
        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BClose.setEnabled(true);
    }//GEN-LAST:event_BBatalActionPerformed

    private void BCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCloseActionPerformed
        // TODO add your handling code here:
        admin ad = new admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_BCloseActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased

    }//GEN-LAST:event_txtCariKeyReleased

    private void txtCariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCariCaretUpdate
        cari();
    }//GEN-LAST:event_txtCariCaretUpdate

    private void BCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCetakActionPerformed
        // TODO add your handling code here:
    String reportSource;
    String reportDest;

    try{
              reportSource = System.getProperty("user.dir")+"/laporan/buku.jrxml";
               reportDest= System.getProperty("user.dir")+"/laporan/buku.html";

               JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

               JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,null,conn);

               JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

               JasperViewer.viewReport(jasperPrint,false);

    }catch(Exception e){
           System.out.println(e);
 }
    }//GEN-LAST:event_BCetakActionPerformed
    void cari(){
        try{
        String sql ="Select * from buku WHERE "
                + "kode_buku Like '%" +txtCari.getText() + "%' or "
                + "judul Like '%" +txtCari.getText() + "%' or "
                + "penulis Like '%" +txtCari.getText() + "%' or "
                + "penerbit Like '%" +txtCari.getText() + "%' or "
                + "tahun_terbit Like '%" +txtCari.getText() + "%' or "
                + "status Like '%" +txtCari.getText() + "%'";
               
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        hapusIsiJTable();
        int no=0;
        while(rs.next()){
            no++;
            String kode = rs.getString("kode_buku");
            String judul = rs.getString("judul");
            String penulis = rs.getString("penulis");
            String penerbit = rs.getString("penerbit");
            String tahun = rs.getString("tahun_terbit");
            String status = rs.getString("status");
            
            Object Data[]={no,kode,judul,penulis,penerbit,tahun,status};
            tabModel.addRow(Data);
        }
    }catch(SQLException ex){}
    }
    
    private void setJTable(){
    String [] BukuKolom={"No","Kode Buku","Judul","Penulis","Penerbit","Tahun Terbit","Status"};
        tabModel = new DefaultTableModel(null, BukuKolom){
                      boolean[] canEdit = new boolean [] { false, false, false, false, false, false,false};
                      @Override
                      public boolean isCellEditable(int rowIndex, int columnIndex) {
                       return canEdit [columnIndex];
                      }
                  };
        TBuku.setModel(tabModel);
        TBuku.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TBuku.getColumnModel().getColumn(0).setPreferredWidth(30);
        TBuku.getColumnModel().getColumn(1).setPreferredWidth(100);
        TBuku.getColumnModel().getColumn(2).setPreferredWidth(120);
        TBuku.getColumnModel().getColumn(3).setPreferredWidth(150);
        TBuku.getColumnModel().getColumn(4).setPreferredWidth(100);
        TBuku.getColumnModel().getColumn(5).setPreferredWidth(100);
        TBuku.getColumnModel().getColumn(6).setPreferredWidth(100);

        getData();
} // Akhir setJTable
    
    private void getData(){
    try{   
            String sql="Select * from buku";
            PreparedStatement st=conn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            String KodeBuku,Judul,Penulis,Penerbit,Tahun,Status;
            int no=0;
            while(rs.next()){
                no=no+1;
                KodeBuku=rs.getString("kode_buku");
                Judul=rs.getString("judul");
                Penulis=rs.getString("penulis");
                Penerbit=rs.getString("penerbit");
                Tahun=rs.getString("tahun_terbit");
                Status=rs.getString("status");
                Object Data[]={no,KodeBuku,Judul,Penulis,Penerbit,Tahun,Status};
                tabModel.addRow(Data);
            }
        }
        catch (SQLException sqle) {                  
               System.out.println("Proses Query Gagal = " + sqle);
               System.exit(0);
        }
        catch(Exception e){
               System.out.println("Koneksi Access Gagal " +e.getMessage());
               System.exit(0);
        }
}
//AKHIR AMBIL DATA DARI DATABASE
    
// AWAL SIMPAN DATA
void simpanData(){    
     try{            
            String sql="Insert into buku values(?,?,?,?,?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1, txtKodeBuku.getText());
                st.setString(2, txtJudul.getText());
                st.setString(3, txtPenulis.getText());
                st.setString(4, txtPenerbit.getText());
                st.setString(5, txtTahunTerbit.getText());
                st.setString(6, (String) CBStatus.getSelectedItem());
            int rs=st.executeUpdate();

            if(rs>0){
            JOptionPane.showMessageDialog(this,"Input Berhasil");
      	    setJTable();
            }
        }
        catch (SQLException sqle) {
           JOptionPane.showMessageDialog(this,"Input  Gagal = " + sqle.getMessage());
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(this,"Koneksi Gagal " +e.getMessage());
        }
}
//AKHIR SIMPAN DATA

//AWAL EDIT DATA
void ambilData_dari_JTable() {
        int row = TBuku.getSelectedRow();

        String KodeBuku = tabModel.getValueAt(row, 1).toString();
        String Judul = tabModel.getValueAt(row, 2).toString();
        String Penulis = tabModel.getValueAt(row, 3).toString();
        String Penerbit = tabModel.getValueAt(row, 4).toString();
        String TahunTerbit = tabModel.getValueAt(row, 5).toString();

        txtKodeBuku.setText(KodeBuku);
        txtJudul.setText(Judul);
        txtPenulis.setText(Penulis);
        txtPenerbit.setText(Penerbit);
        txtTahunTerbit.setText(TahunTerbit);
      
    }
// AKHIR EDIT DATA

// AWAL HAPUS DATA
public void hapusIsiJTable() {
        int row = tabModel.getRowCount();
        for (int i = 0; i < row; i++) {
          tabModel.removeRow(0);
        }
    }
public void tampilDataKeJTable() {
        hapusIsiJTable();
        try {
            String sql="Select * from buku";
            PreparedStatement st=conn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            String KodeBuku,Judul,Penulis,Penerbit,Tahun,Status;
            int no=0;
            while(rs.next()){
             no=no+1;
             KodeBuku=rs.getString("kode_buku");
             Judul=rs.getString("judul");
             Penulis=rs.getString("penulis");
             Penerbit=rs.getString("penerbit");
             Tahun=rs.getString("tahun_terbit");
             Status=rs.getString("status");

             Object Data[]={no,KodeBuku,Judul,Penulis,Penerbit,Tahun,Status};
             tabModel.addRow(Data);
            }
        }
        catch (Exception e) { }
    }
    
public void hapusData() {
        ambilData_dari_JTable();
        int ok = JOptionPane.showConfirmDialog(this,
            "Anda Yakin Ingin Menghapus Data\nDengan Kode Buku = '" + txtKodeBuku.getText() +
            "'", "Konfirmasi Menghapus Data",JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
          try {       
            String sql = "DELETE FROM buku WHERE kode_buku = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txtKodeBuku.getText());
            int rs=st.executeUpdate();
            if(rs>0){
            tampilDataKeJTable();
            JOptionPane.showMessageDialog(this,"Data Berhasil dihapus");
            }
            txtKodeBuku.setText("");
            txtJudul.setText("");
            txtPenulis.setText("");
            txtPenerbit.setText("");
            txtTahunTerbit.setText("");
          } catch (Exception se) {
             JOptionPane.showMessageDialog(this,"Gagal Hapus Data.. ");
           }
        }
    }
// AKHIR HAPUS DATA

public void updateData() {
    // Konfirmasi sebelum melakukan perubahan data
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Mengubah Data\n Dengan Kode Buku = '" + txtKodeBuku.getText() +
        "'", "Konfirmasi ",JOptionPane.YES_NO_OPTION);
    // Apabila tombol Yes ditekan
    if (ok == 0) {
      try {
        String sql ="UPDATE buku SET judul = ?, penulis= ?, penerbit= ?, tahun_terbit= ?, status=? WHERE kode_buku = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        
          st.setString(1, txtJudul.getText());
          st.setString(2, txtPenulis.getText());
          st.setString(3, txtPenerbit.getText());
          st.setString(4, txtTahunTerbit.getText());
          st.setString(5, (String) CBStatus.getSelectedItem());
          st.setString(6, txtKodeBuku.getText());
          int rs=st.executeUpdate();

          if(rs>0){
            JOptionPane.showMessageDialog(this,"Edit Data Berhasil");
      	    tampilDataKeJTable();
          }

          txtJudul.setText("");
          txtPenulis.setText("");
          txtPenerbit.setText(""); 
          txtTahunTerbit.setText("");
          
      }catch (SQLException se) {
        System.out.println("Proses Query Gagal = " + se);
        System.exit(0);
      }  // Silahkan tambahkan Sendiri informasi Eksepsi
    }
    
  }

//AUTO UPDATE KODE BUKU
private void kodeBuku(){
    try{
        String sql= "SELECT*FROM buku ORDER BY kode_buku DESC";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        if (rs.next()){
           String kode= rs.getString("kode_buku").substring(1);
           String AN = "" + (Integer.parseInt(kode)+1);
           String nol = "";
           
           if(AN.length()==1)
               nol = "00";
           else if (AN.length()==2)
               nol = "0";
           else if (AN.length()==3)
               nol = "";
           
           txtKodeBuku.setText("B" + nol + AN);
        } else
            txtKodeBuku.setText("B001");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

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
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FBuku().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BCari;
    private javax.swing.JButton BCetak;
    private javax.swing.JButton BClose;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox CBCari;
    private javax.swing.JComboBox CBStatus;
    private javax.swing.JTable TBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JTextField txtTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
