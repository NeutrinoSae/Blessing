/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.FixPanel;

import app.table.Asset;
import app.table.Bank;
import app.table.Saldo;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.EventQueue;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author SEED
 */
public class Inventaris extends javax.swing.JPanel {

    /**
     * Creates new form Inventaris
     */
    public Inventaris() {
        System.out.println("app.view.panel.inven.Inventaris.<init>()");
        initComponents();
        this.update();
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

        blessingPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blessingPU").createEntityManager();
        assetQuery = java.beans.Beans.isDesignTime() ? null : blessingPUEntityManager.createQuery("SELECT a FROM Asset a");
        assetList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(assetQuery.getResultList());
        jDialog1 = new javax.swing.JDialog();
        inputPanel1 = new app.utils.inputPanel(app.table.Asset.class);
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        bankQuery = java.beans.Beans.isDesignTime() ? null : blessingPUEntityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(bankQuery.getResultList());
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jDialog1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog1.setType(java.awt.Window.Type.POPUP);
        jDialog1.getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        jLabel2.setText("Tujuan");
        inputPanel1.add(jLabel2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        inputPanel1.add(jComboBox1);

        jButton4.setText("TAMBAH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        inputPanel1.add(jButton4);

        jDialog1.getContentPane().add(inputPanel1);

        setLayout(new java.awt.BorderLayout());

        jTable1.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        jTable1.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        jTable1.setDefaultEditor(Integer.class, new app.utils.TablePopupEditor());
        jTable1.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        jTable1.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        jTable1.setColumnSelectionAllowed(false);
        jTable1.setRowHeight(25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, assetList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Asset REF");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${namaAsset}"));
        columnBinding.setColumnName("Nama Asset");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal Transaksi");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggalStock}"));
        columnBinding.setColumnName("Tanggal Restock");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stock}"));
        columnBinding.setColumnName("Stock");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hargaBarang}"));
        columnBinding.setColumnName("Harga Barang");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jumlah}"));
        columnBinding.setColumnName("Total");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${transaksi}"));
        columnBinding.setColumnName("Transaksi");
        columnBinding.setColumnClass(app.table.Saldo.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${transaksi.bankId}"));
        columnBinding.setColumnName("Sumber");
        columnBinding.setColumnClass(app.table.Bank.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${as}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jLabel1.setText("Total Asset IDR");
        jPanel1.add(jLabel1);

        jTextField1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.add(jTextField1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.jDialog1.setSize(400, 600);
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    Asset as;

    public Asset getAs() {
        return as;
    }

    public void setAs(Asset as) {
        this.as = as;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("app.view.panel.bank.bankPanel.jButton4ActionPerformed()");
        this.update();
        if (!this.blessingPUEntityManager.getTransaction().isActive()) 
                this.blessingPUEntityManager.getTransaction().begin();
        this.blessingPUEntityManager.getTransaction().commit(); 
        this.assetList.clear();
        this.assetList.addAll(this.assetQuery.getResultList());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println("app.view.panel.inven.Inventaris.jButton3ActionPerformed()");
        if (!this.blessingPUEntityManager.getTransaction().isActive()) 
                this.blessingPUEntityManager.getTransaction().begin();        
        this.blessingPUEntityManager.remove(this.getAs().getTransaksi());
        this.blessingPUEntityManager.remove(this.getAs());
        this.blessingPUEntityManager.getTransaction().commit();
        boolean remove = this.assetList.remove(this.getAs());
                javax.swing.JOptionPane.showMessageDialog(this.getRootPane(), 
                (remove ? "Berhasil":"Gagal" )+" Menghapus\n");
                // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    public void Refresh()
    {
            this.bankList.clear();            
            this.bankList.addAll(this.bankQuery.getResultList());
    }
    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("app.view.panel.inven.Inventaris.jButton1ActionPerformed()");
        Asset asset = (Asset) this.inputPanel1.getTarget();
        Saldo saldo = new Saldo();
        saldo.setBankId((Bank) this.jComboBox1.getSelectedItem());
        asset.setTransaksi(saldo);
        this.persist(asset);
        this.assetList.add(asset);
        this.jDialog1.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public void persist(Object object) {
        if (!this.blessingPUEntityManager.getTransaction().isActive())         
            blessingPUEntityManager.getTransaction().begin();
        try {
            blessingPUEntityManager.persist(object);
            blessingPUEntityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            blessingPUEntityManager.getTransaction().rollback();
        } finally {
//            blessingPUEntityManager.close();
            System.out.println(object+"=persisted");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<app.table.Asset> assetList;
    private javax.persistence.Query assetQuery;
    private java.util.List<app.table.Bank> bankList;
    private javax.persistence.Query bankQuery;
    private javax.persistence.EntityManager blessingPUEntityManager;
    private app.utils.inputPanel inputPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
                private final DecimalFormat Rp = new DecimalFormat("#,##0");

    private void update() {
        System.out.println("app.view.panel.mobil.panelMobil.UpdatePDP()");
        BigInteger total = new BigInteger("0");
        for (Asset asset : assetList) {
            total = total.add(asset.getJumlah());
        }
        this.jTextField1.setText(Rp.format(total));
    }
        public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(panelJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new Inventaris());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public List<Asset> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<Asset> assetList) {
        this.assetList = assetList;
    }
        
}