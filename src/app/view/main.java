/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.utils.TimerThread;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author SEED
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        initManual();
        initStart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        bankPanel1 = new app.view.panel.bank.bankPanel();
        panelMobil1 = new app.view.panel.mobil.panelMobil();
        jPanel1 = new app.view.panel.inven.Inventaris();
        panelHutang1 = new app.view.panel.hutang.panelHutang();
        jPanel3 = new app.view.panel.laporan.panelMaster(app.table.Pengeluaran.class)
        ;
        jPanel2 = new app.view.panel.laporan.panelMaster(app.table.Pemasukan.class)
        ;
        panelLaporan1 = new app.view.panel.laporan.panelLaporan();
        panelRental1 = new app.view.panel.bank.panelRental();
        panelPegawai1 = new app.view.panel.Pegawai.PanelPegawai();
        panelPiutang1 = new app.view.panel.hutang.panelPiutang();
        panelJasa1 = new app.view.panel.jasa.panelJasa();
        panelPerjalanan1 = new app.view.panel.perjalanan.panelPerjalanan();
        jPanel4 = new app.view.panel.leasing.panelLeasing();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        managementMenu = new javax.swing.JMenu();
        Mobil = new javax.swing.JMenuItem();
        Keuangan = new javax.swing.JMenuItem();
        Asset = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        jLabel1.setText("jLabel1");

        jDialog1.setTitle("Content");

        jTextPane1.setText("hello");
        jScrollPane1.setViewportView(jTextPane1);

        jDialog1.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel1, org.jdesktop.beansbinding.ELProperty.create("${text}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(jLabel2, "card2");
        getContentPane().add(bankPanel1, "card4");
        getContentPane().add(panelMobil1, "card3");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPanel1, "card6");
        getContentPane().add(panelHutang1, "card7");
        getContentPane().add(jPanel3, "card10");
        getContentPane().add(jPanel2, "card9");
        getContentPane().add(panelLaporan1, "card8");
        getContentPane().add(panelRental1, "card12");
        getContentPane().add(panelPegawai1, "card11");
        getContentPane().add(panelPiutang1, "card13");
        getContentPane().add(panelJasa1, "card14");
        getContentPane().add(panelPerjalanan1, "card15");
        getContentPane().add(jPanel4, "card16");

        fileMenu.setMnemonic('f');
        fileMenu.setText("Akuntasi");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Beranda");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        jMenuItem3.setText("Laporan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        jMenuItem4.setText("Pemasukan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem4);

        jMenuItem5.setText("Pengeluaran");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem5);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        managementMenu.setMnemonic('e');
        managementMenu.setText("Management");

        Mobil.setMnemonic('t');
        Mobil.setText("Mobil");
        Mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobilActionPerformed(evt);
            }
        });
        managementMenu.add(Mobil);

        Keuangan.setMnemonic('y');
        Keuangan.setText("Keuangan");
        Keuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeuanganActionPerformed(evt);
            }
        });
        managementMenu.add(Keuangan);

        Asset.setMnemonic('d');
        Asset.setText("Asset/Inventaris");
        Asset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssetActionPerformed(evt);
            }
        });
        managementMenu.add(Asset);

        jMenu1.setText("Hutang/Piutang");

        jMenuItem1.setText("Hutang");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Piutang");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        managementMenu.add(jMenu1);

        jMenuItem6.setText("Pegawai");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        managementMenu.add(jMenuItem6);

        jMenuItem7.setText("Rental");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        managementMenu.add(jMenuItem7);

        jMenuItem8.setText("Cabut Berkas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        managementMenu.add(jMenuItem8);

        jMenuItem9.setText("Lap. Perjalanan");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        managementMenu.add(jMenuItem9);

        jMenuItem10.setText("Kredit Leasing");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        managementMenu.add(jMenuItem10);

        menuBar.add(managementMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemActionPerformed
        // TODO add your handling code here:
        this.jDialog1.setSize(500,400);
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
        
    }//GEN-LAST:event_contentsMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card2");
//        this.getContentPane().sh
//        this.jLabel2.setVisible(true);
//        this.pack();
//        System.out.println(getContentPane().getComponentCount() );
    }//GEN-LAST:event_openMenuItemActionPerformed

//        javax.swing.JPanel mob = new app.view.panel.mobil.panelMobil();
//        javax.swing.JPanel bank = new app.view.panel.bank.bankPanel();
//        javax.swing.JPanel t = new app.view.NewJPanel();
    private void MobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobilActionPerformed
                CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();

        cardLayout.show(this.getContentPane(), "card3");
        System.out.println("app.view.main.MobilActionPerformed()");
//        this.jLabel2.setVisible(false);
//        this.getContentPane().add(mob);
        // TODO add your handling code here:

    }//GEN-LAST:event_MobilActionPerformed

    private void KeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeuanganActionPerformed
        CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card4");
//        this.jLabel2.setVisible(false);
//        this.getContentPane().add(bank);        // TODO add your handling code here:
    }//GEN-LAST:event_KeuanganActionPerformed

    private void AssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssetActionPerformed
        CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card6");        // TODO add your handling code here:
    }//GEN-LAST:event_AssetActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(null, "Hello dunia");
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card7");        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card8"); 
        this.panelLaporan1.Refresh();
        System.out.println("app.view.main.jMenuItem3ActionPerformed()");
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed
        void chandePanel(String t)
        {
            CardLayout cardLayout = (CardLayout) this.getContentPane().getLayout();
            cardLayout.show(this.getContentPane(), t);        // TODO add your handling code here:

        }
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.chandePanel("card9");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.chandePanel("card10");
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.chandePanel("card11");
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.chandePanel("card12");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.chandePanel("card13");
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.chandePanel("card14");
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.chandePanel("card15");
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.chandePanel("card16");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asset;
    private javax.swing.JMenuItem Keuangan;
    private javax.swing.JMenuItem Mobil;
    private javax.swing.JMenuItem aboutMenuItem;
    private app.view.panel.bank.bankPanel bankPanel1;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenu managementMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private app.view.panel.hutang.panelHutang panelHutang1;
    private app.view.panel.jasa.panelJasa panelJasa1;
    private app.view.panel.laporan.panelLaporan panelLaporan1;
    private app.view.panel.mobil.panelMobil panelMobil1;
    private app.view.panel.Pegawai.PanelPegawai panelPegawai1;
    private app.view.panel.perjalanan.panelPerjalanan panelPerjalanan1;
    private app.view.panel.hutang.panelPiutang panelPiutang1;
    private app.view.panel.bank.panelRental panelRental1;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void initManual() {
        System.out.println("app.view.main.initManual()");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        ImageIcon home = new javax.swing.ImageIcon(getClass().getResource("/app/main.png"));
//        ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image to a imageIcon
        Image image = home.getImage(); // transform it 
        Image newimg = image.getScaledInstance(dim.width, dim.height,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        home = new ImageIcon(newimg);
        this.jLabel2.setIcon(home);
    }

    private void initStart() {
        System.out.println("app.view.main.initStart()");
        TimerThread timerThread = new TimerThread(this.jLabel3, this.jLabel1);        
        timerThread.start();
    }
    

}
