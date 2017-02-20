/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.FixPanel.akuntansi;

import app.table.Bank;
import app.table.Investor;
import app.table.Modal;
import app.table.Saham;
import app.table.Saldo;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.EventQueue;
import java.beans.Beans;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SEED
 */
public class panelInvestor extends JPanel {
    
    public panelInvestor() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT i FROM Investor i");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        bankQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(bankQuery.getResultList());
        newButton = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        inputPanel1 = new app.utils.inputPanel(app.table.Modal.class);
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        inputPanel2 = new app.utils.inputPanel(app.table.Prive.class);
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        inputPanel3 = new app.utils.inputPanel(app.table.Investor.class);
        jButton3 = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        inputPanel4 = new app.utils.inputPanel(app.table.pembagianLaba.class);
        jLabel3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        newDetailButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        newButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton1 = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        newDetailButton1 = new javax.swing.JButton();
        newDetailButton2 = new javax.swing.JButton();
        newDetailButton3 = new javax.swing.JButton();
        deleteDetailButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        panelBagiLaba1 = new app.view.FixPanel.akuntansi.panelBagiLaba();
        panelBayarSewa1 = new app.view.FixPanel.akuntansi.panelBayarSewa();

        FormListener formListener = new FormListener();

        newButton.setText("Investor Baru");
        newButton.addActionListener(formListener);

        jDialog1.setModal(true);

        jLabel1.setText("Bank");
        inputPanel1.add(jLabel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        inputPanel1.add(jComboBox1);

        jButton1.setText("Simpan");
        jButton1.addActionListener(formListener);
        inputPanel1.add(jButton1);

        jDialog1.getContentPane().add(inputPanel1, java.awt.BorderLayout.CENTER);

        jDialog2.setModal(true);

        jLabel2.setText("Bank");
        inputPanel2.add(jLabel2);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);

        inputPanel2.add(jComboBox2);

        jButton2.setText("Simpan");
        jButton2.addActionListener(formListener);
        inputPanel2.add(jButton2);

        jDialog2.getContentPane().add(inputPanel2, java.awt.BorderLayout.CENTER);

        jDialog3.setModal(true);

        jButton3.setText("Simpan");
        jButton3.addActionListener(formListener);
        inputPanel3.add(jButton3);

        jDialog3.getContentPane().add(inputPanel3, java.awt.BorderLayout.CENTER);

        jDialog4.setModal(true);

        jLabel3.setText("Bank");
        inputPanel4.add(jLabel3);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox4);
        bindingGroup.addBinding(jComboBoxBinding);

        inputPanel4.add(jComboBox4);

        jButton4.setText("Simpan");
        jButton4.addActionListener(formListener);
        inputPanel4.add(jButton4);

        jDialog4.getContentPane().add(inputPanel4, java.awt.BorderLayout.CENTER);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);

        newDetailButton.setText("New");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.addActionListener(formListener);

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        newButton1.setText("Investor Baru");
        newButton1.addActionListener(formListener);
        jPanel2.add(newButton1);

        deleteButton.setText("Hapus Investor");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jPanel2.add(deleteButton);

        refreshButton1.setText("Refresh");
        refreshButton1.addActionListener(formListener);
        jPanel2.add(refreshButton1);

        saveButton1.setText("Simpan");
        saveButton1.addActionListener(formListener);
        jPanel2.add(saveButton1);

        jPanel3.add(jPanel2);

        masterTable.setCellSelectionEnabled(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Ref");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nama}"));
        columnBinding.setColumnName("Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${alamat}"));
        columnBinding.setColumnName("Alamat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kontak}"));
        columnBinding.setColumnName("Kontak");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${modal}"));
        columnBinding.setColumnName("Total Modal");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prive}"));
        columnBinding.setColumnName("Total Prive");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jumlahPembagaian}"));
        columnBinding.setColumnName("Total Pembagian Laba");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${per}"));
        columnBinding.setColumnName("Persentase Modal");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${select}"), masterTable, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        masterScrollPane.setViewportView(masterTable);
        masterTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel3.add(masterScrollPane);

        newDetailButton1.setText("Modal/Pemasukan");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton1.addActionListener(formListener);
        jPanel1.add(newDetailButton1);

        newDetailButton2.setText("Prive/Pengeluaran");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton2.addActionListener(formListener);
        jPanel1.add(newDetailButton2);

        newDetailButton3.setText("Pembagian Laba");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton3.addActionListener(formListener);
        jPanel1.add(newDetailButton3);

        deleteDetailButton.setText("Hapus");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteDetailButton.addActionListener(formListener);
        jPanel1.add(deleteDetailButton);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel1.add(refreshButton);

        saveButton.setText("Simpan");
        saveButton.addActionListener(formListener);
        jPanel1.add(saveButton);

        jPanel3.add(jPanel1);

        masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(java.math.BigInteger.class, new app.utils.TablePopupEditor());
        detailTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        detailTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        detailTable.setAutoCreateRowSorter(true);
        detailTable.setCellSelectionEnabled(true);
        detailTable.setRowHeight(25);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sahamList}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${modal.jumlah}"));
        columnBinding.setColumnName("Modal");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prive.jumlah}"));
        columnBinding.setColumnName("Prive");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${laba.jumlah}"));
        columnBinding.setColumnName("Pembagian Laba");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${b}"));
        columnBinding.setColumnName("Sumber/Tujuan");
        columnBinding.setColumnClass(app.table.Bank.class);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);
        detailTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (detailTable.getColumnModel().getColumnCount() > 0) {
            detailTable.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(jComboBox3));
        }

        jPanel3.add(detailScrollPane);

        jTabbedPane1.addTab("INVESTOR", jPanel3);
        jTabbedPane1.addTab("MOBIL DAN JASA STATUS", panelBagiLaba1);
        jTabbedPane1.addTab("BAYAR RUKO", panelBayarSewa1);

        add(jTabbedPane1);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == newButton1) {
                panelInvestor.this.newButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                panelInvestor.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton1) {
                panelInvestor.this.refreshButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton1) {
                panelInvestor.this.saveButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton1) {
                panelInvestor.this.newDetailButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton2) {
                panelInvestor.this.newDetailButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton3) {
                panelInvestor.this.newDetailButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == deleteDetailButton) {
                panelInvestor.this.deleteDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                panelInvestor.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                panelInvestor.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                panelInvestor.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                panelInvestor.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                panelInvestor.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                panelInvestor.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                panelInvestor.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton) {
                panelInvestor.this.newDetailButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents
    public void Refresh ()
    {
        this.bankList.clear();
        this.bankList.addAll(bankQuery.getResultList());
        this.refreshButtonActionPerformed(null);
        this.panelBagiLaba1.Refresh();
        this.panelBayarSewa1.Refresh();
    }
    
    private void deleteDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Investor i = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Saham> ss = i.getSahamList();
        int[] selected = detailTable.getSelectedRows();
        List<app.table.Saham> toRemove = new ArrayList<app.table.Saham>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<app.table.Saham> iter = ss.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            app.table.Saham s = iter.next();
            toRemove.add(s);
            entityManager.remove(s);
        }
        ss.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_deleteDetailButtonActionPerformed
    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        app.table.Investor i = list.get(masterTable.convertRowIndexToModel(index));
        Collection<app.table.Saham> ss = i.getSahamList();
        if (ss == null) {
            ss = new LinkedList<app.table.Saham>();
            i.setSahamList((List) ss);
        }
        System.out.println("ss = " + ss);
        app.table.Saham s = new app.table.Saham();
        if (evt.getSource() == jButton1) {
                app.table.Modal m = (app.table.Modal) inputPanel1.getTarget();
                app.table.Saldo s1 = new Saldo();
                s1.setBankId((Bank) jComboBox1.getSelectedItem());
                m.setTransaksi(s1);
                s.setModal(m);
            }
            else if (evt.getSource() == jButton2) {
                app.table.Prive p = (app.table.Prive) inputPanel2.getTarget();
                app.table.Saldo s1 = new Saldo();
                s1.setBankId((Bank) jComboBox2.getSelectedItem());
                p.setTransaksi(s1);
                s.setPrive(p);
            }
            else if (evt.getSource() == jButton4) {
                app.table.pembagianLaba p = (app.table.pembagianLaba) inputPanel4.getTarget();
                app.table.Saldo s1 = new Saldo();
                s1.setBankId((Bank) jComboBox4.getSelectedItem());
                p.setTransaksi(s1);
                s.setLaba(p);
            }
        entityManager.persist(s);
        ss.add(s);
        s.setInvestorId(i);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ss.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newDetailButtonActionPerformed
    public void Hitung()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        app.table.Investor temp = new Investor();
        BigInteger total3 = BigInteger.ZERO;
        BigInteger total4 = BigInteger.ZERO;
        BigInteger total5 = BigInteger.ZERO;
        BigInteger total6 = BigInteger.ZERO;
        java.util.List<app.table.Investor> data = query.getResultList();
        for (Investor entity : data) {                   
            List<Saham> sahamList = entity.getSahamList();
                BigInteger total1 = BigInteger.ZERO;
                BigInteger total2 = BigInteger.ZERO;
            for (Saham saham : sahamList) {
                    total1 = total1.add(saham.getModal() == null? BigInteger.ZERO : saham.getModal().getJumlah());
                    total2 = total2.add(saham.getPrive()== null? BigInteger.ZERO : saham.getPrive().getJumlah());                    
                    total6 = total6.add(saham.getLaba() == null? BigInteger.ZERO : saham.getLaba().getJumlah());
            }
                entity.setPrive(total2);
                entity.setModal(total1.subtract(total2));
                total5 = total5.add(entity.getPrive());
                total3 = total3.add(entity.getModal());
        }
        System.out.println("total6 = " + total6);
        float t = total3.floatValue();
        for (Investor investor : data) {
            float p = investor.getModal().floatValue();
            investor.setPer(df.format((p/t)*100)+"%");
        }
        temp.setModal(total3);
        temp.setPrive(total5);
        temp.setLaba(total6);
        temp.setjumlahPembagaian(total6);
        System.out.println("temp.get = " + temp.getjumlahPembagaian());
        temp.setPer("100%");
        list.add(temp);
    }
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        java.util.List Res = this.bankQuery.getResultList();
        this.bankList.clear();
        this.bankList.addAll(Res);
        list.clear();
        list.addAll(data);
        Hitung();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.Investor> toRemove = new ArrayList<app.table.Investor>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.Investor i = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(i);
            entityManager.remove(i);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        app.table.Investor i = (app.table.Investor) inputPanel3.getTarget();
        entityManager.persist(i);
        list.add(i);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        jDialog3.hide();
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            this.refreshButtonActionPerformed(evt);
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<app.table.Investor> merged = new ArrayList<app.table.Investor>(list.size());
            for (app.table.Investor i : list) {
                merged.add(entityManager.merge(i));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
        refreshButtonActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButton1ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        saveButtonActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void newDetailButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton1ActionPerformed
        
        this.jDialog1.setSize(400, 400);        
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.show();
    }//GEN-LAST:event_newDetailButton1ActionPerformed

    private void newDetailButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton2ActionPerformed
        this.jDialog2.setSize(400, 400);        
        this.jDialog2.setLocationRelativeTo(null);
        this.jDialog2.show();

    }//GEN-LAST:event_newDetailButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        jDialog2.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.newButtonActionPerformed(evt);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void newButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton1ActionPerformed
        this.jDialog3.setSize(400, 400);        
        this.jDialog3.setLocationRelativeTo(null);
        this.jDialog3.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_newButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.newDetailButtonActionPerformed(evt);
        jDialog1.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newDetailButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButton3ActionPerformed
        this.jDialog4.setSize(400, 400);        
        this.jDialog4.setLocationRelativeTo(null);
        this.jDialog4.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_newDetailButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        newDetailButtonActionPerformed(evt);
        jDialog4.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<app.table.Bank> bankList;
    private javax.persistence.Query bankQuery;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDetailButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private app.utils.inputPanel inputPanel1;
    private app.utils.inputPanel inputPanel2;
    private app.utils.inputPanel inputPanel3;
    private app.utils.inputPanel inputPanel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.util.List<app.table.Investor> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newButton1;
    private javax.swing.JButton newDetailButton;
    private javax.swing.JButton newDetailButton1;
    private javax.swing.JButton newDetailButton2;
    private javax.swing.JButton newDetailButton3;
    private app.view.FixPanel.akuntansi.panelBagiLaba panelBagiLaba1;
    private app.view.FixPanel.akuntansi.panelBayarSewa panelBayarSewa1;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
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
            java.util.logging.Logger.getLogger(panelInvestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelInvestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelInvestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelInvestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new panelInvestor());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
