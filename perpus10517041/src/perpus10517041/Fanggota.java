
package perpus10517041;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
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


/**
 *
 * @author Faizal
 */
public class Fanggota extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel tabModel;
    
    
    public Fanggota() {
        initComponents();
        conn=koneksi.getConnection();
        setJTable();
        setTitle("FORM ANGGOTA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spNoAnggota = new javax.swing.JSeparator();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoAnggota = new javax.swing.JTextField();
        spNama = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        spAlamat = new javax.swing.JSeparator();
        BEdit = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BClose = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BTambah = new javax.swing.JButton();
        dbPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CBCari = new javax.swing.JComboBox();
        BCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAnggota = new javax.swing.JTable();
        BCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));
        registerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus10517041/logo_unikom_kuning.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 25, 80));
        jLabel2.setText("PERPUSTAKAAN");

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 25, 80));
        jLabel3.setText("UNIKOM");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("No. Anggota");

        spNoAnggota.setForeground(new java.awt.Color(32, 25, 89));

        txtNama.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtNama.setForeground(new java.awt.Color(32, 25, 80));
        txtNama.setBorder(null);
        txtNama.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Nama");

        txtNoAnggota.setEditable(false);
        txtNoAnggota.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtNoAnggota.setForeground(new java.awt.Color(32, 25, 80));
        txtNoAnggota.setBorder(null);
        txtNoAnggota.setEnabled(false);

        spNama.setForeground(new java.awt.Color(32, 25, 89));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Alamat");

        txtAlamat.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtAlamat.setForeground(new java.awt.Color(32, 25, 80));
        txtAlamat.setBorder(null);
        txtAlamat.setEnabled(false);

        spAlamat.setForeground(new java.awt.Color(32, 25, 89));

        BEdit.setBackground(new java.awt.Color(32, 25, 80));
        BEdit.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BEdit.setForeground(new java.awt.Color(255, 255, 255));
        BEdit.setText("EDIT");
        BEdit.setEnabled(false);
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        BBatal.setBackground(new java.awt.Color(32, 25, 80));
        BBatal.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BBatal.setForeground(new java.awt.Color(255, 255, 255));
        BBatal.setText("BATAL");
        BBatal.setEnabled(false);
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        BHapus.setBackground(new java.awt.Color(32, 25, 80));
        BHapus.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BHapus.setForeground(new java.awt.Color(255, 255, 255));
        BHapus.setText("HAPUS");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BClose.setBackground(new java.awt.Color(32, 25, 80));
        BClose.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BClose.setForeground(new java.awt.Color(255, 255, 255));
        BClose.setText("CLOSE");
        BClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCloseActionPerformed(evt);
            }
        });

        BSimpan.setBackground(new java.awt.Color(32, 25, 80));
        BSimpan.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BSimpan.setForeground(new java.awt.Color(255, 255, 255));
        BSimpan.setText("SIMPAN");
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BTambah.setBackground(new java.awt.Color(32, 25, 80));
        BTambah.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BTambah.setForeground(new java.awt.Color(255, 255, 255));
        BTambah.setText("TAMBAH");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel2)
                            .addGap(44, 44, 44))
                        .addGroup(registerPanelLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtAlamat)
                                .addComponent(spNoAnggota, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(registerPanelLayout.createSequentialGroup()
                                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addGroup(registerPanelLayout.createSequentialGroup()
                                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(registerPanelLayout.createSequentialGroup()
                                                    .addComponent(BBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(registerPanelLayout.createSequentialGroup()
                                                    .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BClose, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addComponent(BEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(spAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(registerPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNoAnggota, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4))))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spNoAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spNama, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BEdit)
                    .addComponent(BSimpan)
                    .addComponent(BTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBatal)
                    .addComponent(BHapus)
                    .addComponent(BClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(registerPanel);

        dbPanel.setBackground(new java.awt.Color(32, 25, 80));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATA ANGGOTA");

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PERPUSTAKAAN UNIKOM");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(147, 188, 248));
        jLabel9.setText("Cari Berdasarkan");

        CBCari.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        CBCari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Anggota", "Nama" }));

        BCari.setBackground(new java.awt.Color(60, 116, 229));
        BCari.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BCari.setForeground(new java.awt.Color(255, 255, 255));
        BCari.setText("CARI");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

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

        TAnggota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TAnggota);

        BCetak.setBackground(new java.awt.Color(60, 116, 229));
        BCetak.setFont(new java.awt.Font("Poppins Medium", 1, 10)); // NOI18N
        BCetak.setForeground(new java.awt.Color(255, 255, 255));
        BCetak.setText("CETAK");
        BCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dbPanelLayout = new javax.swing.GroupLayout(dbPanel);
        dbPanel.setLayout(dbPanelLayout);
        dbPanelLayout.setHorizontalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dbPanelLayout.createSequentialGroup()
                        .addComponent(CBCari, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCari, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(dbPanelLayout.createSequentialGroup()
                        .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(140, 140, 140))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(93, 93, 93))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        dbPanelLayout.setVerticalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBCari, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BCari)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCetak)
                .addGap(57, 57, 57))
        );

        getContentPane().add(dbPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
         if(BSimpan.getText().equalsIgnoreCase("SIMPAN"))
            simpanData();
        else
            updateData();

        txtNoAnggota.setText(""); // txtNoAnggota Tidak Aktif
        txtNama.setText("");        
        txtAlamat.setText("");

        txtNoAnggota.setEnabled(false);
        txtNama.setEnabled(false);
        txtAlamat.setEnabled(false);

        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BClose.setEnabled(true);  
    }//GEN-LAST:event_BSimpanActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        txtNoAnggota.setEnabled(false); 
        txtNama.setEnabled(true);       
        txtAlamat.setEnabled(true);     

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
        noAnggota();
        txtNoAnggota.setEnabled(true);
        txtNama.setEnabled(true);
        txtAlamat.setEnabled(true);
        BSimpan.setText("SIMPAN");

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(false);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BClose.setEnabled(false);
    }//GEN-LAST:event_BTambahActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
         hapusData();
    }//GEN-LAST:event_BHapusActionPerformed


    
    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed

    }//GEN-LAST:event_BCariActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
        txtNoAnggota.setText(""); 
        txtNama.setText("");        
        txtAlamat.setText("");

       // Mengatur  Enable Tombol Dan Textfield  
        txtNoAnggota.setEnabled(false);
        txtNama.setEnabled(false);
        txtAlamat.setEnabled(false);

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
    String reportSource;
    String reportDest;
    Map<String,Object> param = new HashMap<>();

    try{
               reportSource = System.getProperty("user.dir")+"/laporan/anggota.jrxml";
               reportDest= System.getProperty("user.dir")+"/laporan/anggota.html";

               JasperReport jasperReport= JasperCompileManager.compileReport(reportSource);

               JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,null,conn);

               JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

               JasperViewer.viewReport(jasperPrint,false);

    }catch(Exception e){
           System.out.println(e);
 }

    }//GEN-LAST:event_BCetakActionPerformed
 
    void cari(){
        try{
        String sql ="Select * from Anggota WHERE "
                +"NoAnggota Like '%" +txtCari.getText() + "%' or "
                + "Nama Like '%" +txtCari.getText() + "%' or "
                + "Alamat Like '%" +txtCari.getText() + "%'";
               
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        
        hapusIsiJTable();
        int no=0;
        while(rs.next()){
            no++;
            String NoAnggota = rs.getString("NoAnggota");
            String Nama = rs.getString("Nama");
            String Alamat = rs.getString("Alamat");
            
            Object Data[]={no,NoAnggota,Nama,Alamat};
            tabModel.addRow(Data);
        }
    }catch(SQLException ex){}
    }
    
    
    
    private void setJTable(){
    String [] JudulKolom={"No","No Anggota","Nama Anggota","Alamat"};
    tabModel = new DefaultTableModel(null, JudulKolom){
                  boolean[] canEdit = new boolean [] { false, false, false, false};
                  @Override
                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit [columnIndex];
                  }
              };
    TAnggota.setModel(tabModel);
    TAnggota.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TAnggota.getColumnModel().getColumn(0).setPreferredWidth(30);
    TAnggota.getColumnModel().getColumn(1).setPreferredWidth(80);
    TAnggota.getColumnModel().getColumn(2).setPreferredWidth(150);
    TAnggota.getColumnModel().getColumn(3).setPreferredWidth(250);

    getData();
} // Akhir setJTable
    
 private void getData(){  
  try{   
              // Membuat perintah sql 
        String sql="Select * from Anggota";
        PreparedStatement st=conn.prepareStatement(sql);  // import java.sql.PreparedStatement
              //Membuat Variabel Bertipe ResulSet
             //Kelas Resultset Berfungsi Menyimpan Dataset(Sekumpulan Data) hasil prepareStatement Query
        ResultSet rs=st.executeQuery();   // import java.sql.ResultSet;
            // Menampilkan ke JTable  melalui tabModel
        String NoAnggota,Nama,Alamat;
        int no=0;
        while(rs.next()){
         no=no+1;
         NoAnggota=rs.getString("NoAnggota");
         Nama=rs.getString("Nama");
         Alamat=rs.getString("Alamat");

         Object Data[]={no,NoAnggota,Nama,Alamat};
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

    }    // Akhir Method getData
 
// Method Simpan Data
void simpanData(){    
     try{            
            String sql = "INSERT INTO anggota VALUES (?,?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1, txtNoAnggota.getText());
                st.setString(2, txtNama.getText());
                st.setString(3, txtAlamat.getText());
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
//Akhir Method Simpan Data
 
//Method ambil data dari JTable
void ambilData_dari_JTable() {
    int row = TAnggota.getSelectedRow();

    // Mengambil data yang dipilih pada JTable
    String NoAnggota = tabModel.getValueAt(row, 1).toString();
    String Nama = tabModel.getValueAt(row, 2).toString();
    String Alamat = tabModel.getValueAt(row, 3).toString();
    
    txtNoAnggota.setText(NoAnggota);
    txtNama.setText(Nama);
    txtAlamat.setText(Alamat);
  }
//Akhir method ambil data dari JTable

// Method Untuk Menghapus Semua Isi JTable
public void hapusIsiJTable() {
    int row = tabModel.getRowCount();
    for (int i = 0; i < row; i++) {
      tabModel.removeRow(0);
    }
  }
//  Method Untuk Menampilkan Data dari tabel Anggota Ke JTable
public void tampilDataKeJTable() {
    hapusIsiJTable();
    try {
        String sql="Select * from Anggota";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        String NoAnggota,Nama,Alamat;
        int no=0;
        while(rs.next()){
         no=no+1;
         NoAnggota=rs.getString("NoAnggota");
         Nama=rs.getString("Nama");
         Alamat=rs.getString("Alamat");
         Object Data[]={no,NoAnggota,Nama,Alamat};
         tabModel.addRow(Data);
      }
  }
    catch (Exception e) { }  // Isi informasi eksepsi
}

private void noAnggota(){
    try{
        String sql= "SELECT*FROM anggota ORDER BY NoAnggota DESC";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        if (rs.next()){
           String noagt= rs.getString("NoAnggota").substring(1);
           String AN = "" + (Integer.parseInt(noagt)+1);
           String nol = "";
           
           if(AN.length()==1)
               nol = "00";
           else if (AN.length()==2)
               nol = "0";
           else if (AN.length()==3)
               nol = "";
           
           txtNoAnggota.setText("A" + nol + AN);
        } else
            txtNoAnggota.setText("A001");
    }catch(Exception e){
        
    }
}

public void updateData() {
    // Konfirmasi sebelum melakukan perubahan data
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Mengubah Data\n Dengan No Anggota = '" + txtNoAnggota.getText() +
        "'", "Konfirmasi ",JOptionPane.YES_NO_OPTION);
    // Apabila tombol Yes ditekan
    if (ok == 0) {
      try {
        String sql ="UPDATE Anggota SET Nama = ?, Alamat= ? WHERE NoAnggota = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        
          st.setString(1, txtNama.getText());
          st.setString(2, txtAlamat.getText());
          st.setString(3, txtNoAnggota.getText());
          int rs=st.executeUpdate();

          if(rs>0){
            JOptionPane.showMessageDialog(this,"Edit Data Berhasil");
      	    tampilDataKeJTable();
          }         

          txtNoAnggota.setText("");
          txtNama.setText("");
          txtAlamat.setText("");             
      }catch (SQLException se) {}  // Silahkan tambahkan Sendiri informasi Eksepsi
    }
    
  }

public void hapusData() {
    // Konfirmasi sebelum melakukan penghapusan data
    ambilData_dari_JTable();
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Menghapus Data\nDengan No Anggota = '" + txtNoAnggota.getText() +
        "'", "Konfirmasi Menghapus Data",JOptionPane.YES_NO_OPTION);
    if (ok == 0) {     // Apabila tombol OK ditekan
      try {       
        String sql = "DELETE FROM Anggota WHERE NoAnggota = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, txtNoAnggota.getText());
        int rs=st.executeUpdate();
        if(rs>0){
        tampilDataKeJTable();
        JOptionPane.showMessageDialog(this,"Data Berhasil dihapus");
        }
        txtNoAnggota.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
      } catch (Exception se) {  // Silahkan tambahkan catch Exception yang lain
         JOptionPane.showMessageDialog(this,"Gagal Hapus Data.. ");
       }
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
            java.util.logging.Logger.getLogger(Fanggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fanggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fanggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fanggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fanggota().setVisible(true);
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
    private javax.swing.JTable TAnggota;
    private javax.swing.JPanel dbPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JSeparator spAlamat;
    private javax.swing.JSeparator spNama;
    private javax.swing.JSeparator spNoAnggota;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoAnggota;
    // End of variables declaration//GEN-END:variables

    
}
