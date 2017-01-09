/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.FixPanel;

import app.table.Bank;
import app.table.Laporan;
import app.table.Pemasukan;
import app.table.Pengeluaran;
import app.table.Saldo;
import app.table.Util;
import java.awt.EventQueue;
import java.beans.Beans;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SEED
 */
public class PanelBank extends JPanel {

    public List<Bank> getList() {
        return list;
    }

    public void setList(List<Bank> list) {
        this.list = list;
    }
    
    public PanelBank() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        {            
            Bank find = this.entityManager.find(app.table.Bank.class, -1);
            Bank find2 = this.entityManager.find(app.table.Bank.class, -2);
            System.out.println("find = " + find);
            System.out.println("find = " + find2);
            System.out.println("foo");
//            boolean name = find ==null;
            if ((find ==null) && (find2 == null)) {
                    System.out.println("foo 1");
                    Bank bank = new app.table.Bank(-1);
                    Bank peter = new app.table.Bank(-2);
                    bank.setNamaBank("Kas'");
                    peter.setNamaBank("Peter");
                    entityManager.persist(bank);
                    entityManager.persist(peter);
                    list.add(bank);
                    list.add(peter);
                    int row = list.size() - 1;
                    masterTable.setRowSelectionInterval(row, row);
                    masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
                    this.saveButtonActionPerformed(null);                
            }
        }

//        this.list.isEmpty()

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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blessingPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bank b order by b");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jDialog1 = new javax.swing.JDialog();
        inputPanel1 = new app.utils.inputPanel(app.table.Bank.class);
        newButton = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        deleteDetailButton = new javax.swing.JButton();
        newDetailButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        jDialog1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        inputPanel1.setLayout(new java.awt.GridLayout(0, 2));
        jDialog1.getContentPane().add(inputPanel1, java.awt.BorderLayout.CENTER);

        newButton.setText("Simpan Data Bank");
        newButton.addActionListener(formListener);
        jDialog1.getContentPane().add(newButton, java.awt.BorderLayout.PAGE_END);

        jDialog2.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog2.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        detailTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        detailTable.setAutoCreateRowSorter(true);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.saldoList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldoId}"));
        columnBinding.setColumnName("REF");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laporan.keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laporan.tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laporan.pemasukan}"));
        columnBinding.setColumnName("Pemasukan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laporan.pengeluaran}"));
        columnBinding.setColumnName("Pengeluaran");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laporan.dtype}"));
        columnBinding.setColumnName("Sumber");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bankId.namaBank}"));
        columnBinding.setColumnName("Tujuan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);

        jDialog2.getContentPane().add(detailScrollPane);

        deleteDetailButton.setText("Hapus Transaksi");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteDetailButton.addActionListener(formListener);

        newDetailButton.setText("Baru Transaksi");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.addActionListener(formListener);

        jButton2.setText("Tambah Pemasukan");
        jButton2.addActionListener(formListener);

        jButton3.setText("Tambah Pengeluaran");

        setLayout(new java.awt.BorderLayout());

        masterTable.setAutoCreateRowSorter(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bankId}"));
        columnBinding.setColumnName("Ref");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${namaBank}"));
        columnBinding.setColumnName("Nama Bank");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nama}"));
        columnBinding.setColumnName("Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${alamat}"));
        columnBinding.setColumnName("Alamat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomorHp}"));
        columnBinding.setColumnName("Nomor Hp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomorKtp}"));
        columnBinding.setColumnName("Nomor Ktp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${norek}"));
        columnBinding.setColumnName("Norek");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalDebit}"));
        columnBinding.setColumnName("Total Pemasukan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalKredit}"));
        columnBinding.setColumnName("Total Pengeluaran");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalSaldo}"));
        columnBinding.setColumnName("Saldo Terakhir");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        add(masterScrollPane, java.awt.BorderLayout.CENTER);

        jButton1.setText("Tambah Bank");
        jButton1.addActionListener(formListener);
        jPanel1.add(jButton1);

        jButton4.setText("Daftar Transaksi");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, deleteButton, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jButton4, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jButton4.addActionListener(formListener);
        jPanel1.add(jButton4);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel1.add(refreshButton);

        deleteButton.setText("Hapus Bank");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jPanel1.add(deleteButton);

        saveButton.setText("Simpan");
        saveButton.addActionListener(formListener);
        jPanel1.add(saveButton);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton1) {
                PanelBank.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                PanelBank.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                PanelBank.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                PanelBank.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                PanelBank.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                PanelBank.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteDetailButton) {
                PanelBank.this.deleteDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton) {
                PanelBank.this.newDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                PanelBank.this.jButton2ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    private void deleteDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Bank b = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Saldo> ss = b.getSaldoList();
        int[] selected = detailTable.getSelectedRows();
        List<app.table.Saldo> toRemove = new ArrayList<app.table.Saldo>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<app.table.Saldo> iter = ss.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            app.table.Saldo s = iter.next();
            toRemove.add(s);
            entityManager.remove(s);
        }
        ss.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_deleteDetailButtonActionPerformed

    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Bank b = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Saldo> ss = b.getSaldoList();
        if (ss == null) {
            ss = new LinkedList<app.table.Saldo>();
            b.setSaldoList((List) ss);
        }
        app.table.Saldo s = new app.table.Saldo();
        entityManager.persist(s);
        s.setBankId(b);
        ss.add(s);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ss.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newDetailButtonActionPerformed
    public void Reset()
    {
        Util.RefreshLaporan();    
        this.refreshButtonActionPerformed(null);
    }
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.List<Bank> data = query.getResultList();
        data.stream().map((entity) -> {
            entityManager.refresh(entity);
            return entity;
        }).map((entity) -> (Bank) entity).forEachOrdered((Bank b) -> {
            java.math.BigInteger TPem = new java.math.BigInteger("0");
            java.math.BigInteger TPer = new java.math.BigInteger("0");
            List<Saldo> SL = b.getSaldoList();
            for (Saldo trans : SL) {
                 java.math.BigInteger pem = new java.math.BigInteger("0");
                 java.math.BigInteger per = new java.math.BigInteger("0");
                pem = trans.getLaporan() ==null?BigInteger.ZERO:trans.getLaporan().getPemasukan() ;
                per = trans.getLaporan() ==null?BigInteger.ZERO:trans.getLaporan().getPengeluaran();
                TPem = TPem.add(pem);
                TPer =TPer.add(per);
            }
            b.setTotalDebit(TPem);
            b.setTotalKredit(TPer);
            b.setTotalSaldo(TPem.subtract(TPer));
        });
        list.clear();
        list.addAll(data);

    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.Bank> toRemove = new ArrayList<app.table.Bank>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.Bank b = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            if (b.getBankId() == -2  ) {
                 javax.swing.JOptionPane.showMessageDialog(null,  "Gagal menghapus\n");
                break;                
            }
            if (b.getBankId() == -1  ) {
                 javax.swing.JOptionPane.showMessageDialog(null,  "Gagal menghapus\n");
                break;                
            }
            toRemove.add(b);
            entityManager.remove(b);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        app.table.Bank b = (app.table.Bank) this.inputPanel1.getTarget();
        entityManager.persist(b);
        Saldo trans = new Saldo();
        Saldo trans1 = new Saldo();
        entityManager.persist(trans);
        entityManager.persist(trans1);
        trans.setBankId(b);
        trans1.setBankId(b);
        Pemasukan p1 = new Pemasukan();
        Pengeluaran p2 = new Pengeluaran();
        p1.setTransaksi(trans);
        p2.setTransaksi(trans1);
        trans.setLaporan(p1);
        trans1.setLaporan(p2);
        p1.setJumlah(b.getTotalDebit());
        p2.setJumlah(b.getTotalKredit());
        entityManager.persist(p1);
        entityManager.persist(p2);
        list.add(b);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        this.jDialog1.hide();
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<app.table.Bank> merged = new ArrayList<app.table.Bank>(list.size());
            for (app.table.Bank b : list) {
                merged.add(entityManager.merge(b));
            }
            list.clear();
            list.addAll(merged);
        }
        this.Reset();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        this.jDialog1.setSize(400, 500);
        this.jDialog1.setSize(400, 600);
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            jDialog2.setSize(700,500);
            jDialog2.setLocationRelativeTo(null);
            jDialog2.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDetailButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private app.utils.inputPanel inputPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel1;
    private java.util.List<app.table.Bank> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newDetailButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
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
            java.util.logging.Logger.getLogger(PanelBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new PanelBank());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public void persist(Object object) {
        boolean active = entityManager.getTransaction().isActive();
        if (!active) {
                entityManager.getTransaction().begin();            
        }
        try {
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }
    
}
