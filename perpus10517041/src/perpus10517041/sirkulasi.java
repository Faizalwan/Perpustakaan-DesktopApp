package perpus10517041;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class sirkulasi extends javax.swing.JFrame {
    Connection conn;
    public sirkulasi() {
        initComponents();
        conn=koneksi.getConnection();
        hide_menu();
        setTitle("HALAMAN SIRKULASI");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MFile = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();
        itemExit = new javax.swing.JMenuItem();
        MPelayanan = new javax.swing.JMenu();
        itemPeminjaman = new javax.swing.JMenuItem();
        itemPengembalian = new javax.swing.JMenuItem();
        MLaporan = new javax.swing.JMenu();
        itemLPeminjaman = new javax.swing.JMenuItem();
        itemLPengembalian = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perpus10517041/logo_unikom_kuning.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Selamat Datang Sirkulasi");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(237, 237, 237))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        MFile.setText("File");
        MFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MFileActionPerformed(evt);
            }
        });

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itemLogin.setText("Login");
        itemLogin.setEnabled(false);
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        MFile.add(itemLogin);

        itemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemLogout.setText("Logout");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });
        MFile.add(itemLogout);

        itemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        MFile.add(itemExit);

        MenuBar.add(MFile);

        MPelayanan.setText("Pelayanan");

        itemPeminjaman.setText("Peminjaman");
        itemPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPeminjamanActionPerformed(evt);
            }
        });
        MPelayanan.add(itemPeminjaman);

        itemPengembalian.setText("Pengembalian");
        itemPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPengembalianActionPerformed(evt);
            }
        });
        MPelayanan.add(itemPengembalian);

        MenuBar.add(MPelayanan);

        MLaporan.setText("Laporan");

        itemLPeminjaman.setText("Peminjaman");
        itemLPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLPeminjamanActionPerformed(evt);
            }
        });
        MLaporan.add(itemLPeminjaman);

        itemLPengembalian.setText("Pengembalian");
        itemLPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLPengembalianActionPerformed(evt);
            }
        });
        MLaporan.add(itemLPengembalian);

        MenuBar.add(MLaporan);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    final void hide_menu(){
        MPelayanan.setVisible(true);
        MLaporan.setVisible(true);
    }
    
    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPengembalianActionPerformed
        // TODO add your handling code here:
        pengembaliansir kembalisir = new pengembaliansir();
        kembalisir.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPengembalianActionPerformed

    private void MFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MFileActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_MFileActionPerformed

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_itemLoginActionPerformed

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoutActionPerformed
        // TODO add your handling code here:
        Utama ut = new Utama();
        ut.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemLogoutActionPerformed

    
    private void itemPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPeminjamanActionPerformed
        // TODO add your handling code here:
        peminjamansir pinjamsir = new peminjamansir();
        pinjamsir.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPeminjamanActionPerformed

    private void itemLPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLPeminjamanActionPerformed
        // TODO add your handling code here:
        laporanPeminjamansir lapJamsir = new laporanPeminjamansir();
        lapJamsir.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemLPeminjamanActionPerformed

    private void itemLPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLPengembalianActionPerformed
        // TODO add your handling code here:
        laporanPengembaliansir lapKemsir = new laporanPengembaliansir();
        lapKemsir.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemLPengembalianActionPerformed

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
            java.util.logging.Logger.getLogger(sirkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sirkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sirkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sirkulasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sirkulasi().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MFile;
    private javax.swing.JMenu MLaporan;
    private javax.swing.JMenu MPelayanan;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemLPeminjaman;
    private javax.swing.JMenuItem itemLPengembalian;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemPeminjaman;
    private javax.swing.JMenuItem itemPengembalian;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
