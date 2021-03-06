/**
 * Kelompok 10
 * Kelas    : S1 IF-06-B
 * Anggota  :
 * 1. Naufal Yusuf Kartiko (181020)
 * 2. Nur Rizki Adi Prasetyo (18102064)
 * 3. Wisanti (181020)
 */
package com.nurrizkiadip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Pengaturan extends javax.swing.JFrame {

    /**
     * Creates new form RiwayatPengeluar
     */
    public Pengaturan() throws ParseException {
        initComponents();
        if (Main.waktuSetLimit != null) {
            Main.setUlangLimitBulanan();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSelesai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        tfSetLimit = new javax.swing.JTextField();
        tfPengingatLimit = new javax.swing.JTextField();
        MenuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuBeranda = new javax.swing.JMenuItem();
        menuCatat = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenuItem();
        menuPengaturan = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        menuKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pengaturan Struk Harian");
        setSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pengaturan");

        jLabel2.setText("Limit Bulanan");

        btnSelesai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok-converted.png"))); // NOI18N
        btnSelesai.setText(" Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });

        jLabel3.setText("Pengingat Limit Bulanan");

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_cancel_converted.png"))); // NOI18N
        btnBatal.setText(" Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        menuBeranda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homeflat_converted2.png"))); // NOI18N
        menuBeranda.setText("Beranda");
        menuBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBerandaActionPerformed(evt);
            }
        });
        menuFile.add(menuBeranda);

        menuCatat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCatat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_write_converted.png"))); // NOI18N
        menuCatat.setText("Catat Pengeluaran");
        menuCatat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCatatActionPerformed(evt);
            }
        });
        menuFile.add(menuCatat);

        menuLaporan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Laporan-converted2.png"))); // NOI18N
        menuLaporan.setText("Laporan");
        menuLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLaporanActionPerformed(evt);
            }
        });
        menuFile.add(menuLaporan);

        menuPengaturan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuPengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Setting-converted2.png"))); // NOI18N
        menuPengaturan.setText("Pengaturan");
        menuPengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPengaturanActionPerformed(evt);
            }
        });
        menuFile.add(menuPengaturan);

        MenuBar.add(menuFile);

        MenuEdit.setText("Exit");

        menuKeluar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit-converted2.png"))); // NOI18N
        menuKeluar.setText("Keluar");
        menuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluarActionPerformed(evt);
            }
        });
        MenuEdit.add(menuKeluar);

        MenuBar.add(MenuEdit);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfSetLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfPengingatLimit))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBatal)
                .addGap(18, 18, 18)
                .addComponent(btnSelesai)
                .addGap(187, 187, 187))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBatal, btnSelesai});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSetLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPengingatLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelesai)
                    .addComponent(btnBatal))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBatal, btnSelesai});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method tombol selesai untuk menyelesaikan penyetingan limit bulanan
    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime currentDate = LocalDateTime.now();

        PreparedStatement pStt;
        Connection conn;
        
        try {
            Main.limitBulananFinal = Integer.parseInt(tfSetLimit.getText());
            Main.pengingatLimitBulanan = Integer.parseInt(tfPengingatLimit.getText());

            if (Main.cekBelanja() == 1) {
                int input = JOptionPane.showConfirmDialog(null, "Anda memiliki riwayat barang belanja sebelumnya.\nApakah anda ingin mengatur ulang riwayat belanja anda?",
                        "Perubahan Limit Bulanan", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    Main.resetData(input);
                }

                Pengaturan.this.setVisible(false);
                new Beranda().setVisible(true);

            } else {
                Pengaturan.this.setVisible(false);
                new Beranda().setVisible(true);
            }

            Main.limitBulananNonFinal = Main.limitBulananFinal;
            Main.waktuSetLimit = dtf.format(currentDate);
            System.out.println(dtf.format(currentDate));
            System.out.println(currentDate);

            String sqlReset = "TRUNCATE TABLE db_strukharian.pengaturan";
            conn = Database.koneksi();
            pStt = conn.prepareStatement(sqlReset);
            pStt.execute();
            
            String sql = "INSERT INTO pengaturan VALUES('" + tfSetLimit.getText() + "','" + tfSetLimit.getText() + 
                    "','" + tfPengingatLimit.getText() + "','" + dtf.format(currentDate) + "')";
            pStt = conn.prepareStatement(sql);
            pStt.execute();

            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Anda harus melengkapi kolom pengaturan\nError : " + e.getMessage());
        } catch (ParseException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSelesaiActionPerformed

    //method tombol batal untuk membatalkan penyetingan limit bulanan
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        Beranda mainMenu;
        try {
            mainMenu = new Beranda();
            mainMenu.setVisible(true);

            Pengaturan.this.setVisible(false);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBatalActionPerformed

    //method menu item beranda untuk menuju ke beranda program
    private void menuBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBerandaActionPerformed
        // TODO add your handling code here:
        Beranda mainMenu;
        try {
            mainMenu = new Beranda();
            Pengaturan.this.setVisible(false);
            mainMenu.setVisible(true);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }
    }//GEN-LAST:event_menuBerandaActionPerformed

    //method menu item catat untuk menuju ke pencatatan barang belanja
    private void menuCatatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCatatActionPerformed
        // TODO add your handling code here:

        Pencatatan catat = null;
        try {
            catat = new Pencatatan();
            catat.setVisible(true);
            Pengaturan.this.setVisible(false);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }

        //memunculkan jendela pencatatan jika memiliki limit bulanan
        int input;

        if (Main.limitBulananFinal <= 0) {
            input = JOptionPane.showConfirmDialog(null, "Anda tidak memiliki limit bulanan. Apakah anda ingin mengatur limit bulanan sekarang?\n"
                    + "Jika Ya tekan 'YES', jika Tidak tekan 'NO'", "Peringatan", JOptionPane.YES_NO_OPTION);
            if (input == 0) {
                Pengaturan.this.setVisible(false);
                catat.setVisible(false);
                try {
                    new Pengaturan().setVisible(true);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
                }

            } else {
                Pengaturan.this.setVisible(true);
                catat.setVisible(false);
            }
        }
    }//GEN-LAST:event_menuCatatActionPerformed

    //method menu item laporan untuk menuju ke laporan belanja
    private void menuLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLaporanActionPerformed
        // TODO add your handling code here:
        Laporan lap = null;
        try {
            lap = new Laporan();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }
        Pengaturan.this.setVisible(false);
        lap.setVisible(true);
    }//GEN-LAST:event_menuLaporanActionPerformed

    //method menu item pengaturan untuk menuju ke pengaturan limit bulanan
    private void menuPengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPengaturanActionPerformed
        // TODO add your handling code here:

        try {
            Pengaturan atur = new Pengaturan();
            Pengaturan.this.setVisible(false);
            atur.setVisible(true);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }

    }//GEN-LAST:event_menuPengaturanActionPerformed

    //method menu item keluar untuk mengakhiri running program
    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuKeluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem menuBeranda;
    private javax.swing.JMenuItem menuCatat;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenuItem menuLaporan;
    private javax.swing.JMenuItem menuPengaturan;
    private javax.swing.JTextField tfPengingatLimit;
    private javax.swing.JTextField tfSetLimit;
    // End of variables declaration//GEN-END:variables
}
