/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.FixPanel.akuntansi;

import app.table.BagiLaba;
import app.table.Bank;
import app.table.BayarSewaMasuk;
import app.table.Bayarhutang;
import app.table.Bayarjasa;
import app.table.Bayarrental;
import app.table.Bayarsewa;
import app.table.KeuanganMobil;
import app.table.Laba;
import app.table.Laporan;
import app.table.Laporanlaba;
import app.table.Saldo;
import app.view.ShowRoom;
import java.awt.EventQueue;
import java.beans.Beans;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.swing.DefaultCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SEED
 */
public class panelBagiLaba extends JPanel {
    String Value = "25";
    public panelBagiLaba() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }
    public panelBagiLaba(String value) {
        Value = value;
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }
    public void Refresh()
    {
        this.refreshButtonActionPerformed(null);
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BagiLaba b");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        idLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        newButton = new javax.swing.JButton();
        keteranganField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField(0);
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        bankQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bank b");
        bankList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bankQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        FormListener formListener = new FormListener();

        idLabel.setText("Id:");

        keteranganLabel.setText("Keterangan:");

        newButton.setText("New");
        newButton.addActionListener(formListener);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.keterangan}"), keteranganField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), keteranganField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), idField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), idField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "READY", "OPEN", "CLOSE", "SELESAI" }));

        deleteButton.setText("Delete");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);

        jDialog1.setSize(1000, 700);
        jDialog1.setTitle("Data Baru");
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setModalityType(null);
        jDialog1.setType(java.awt.Window.Type.POPUP);
        jDialog1.getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setText("Pembagian Laporan KE");
        jDialog1.getContentPane().add(jLabel1);

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField2.setValue(0l);
        jDialog1.getContentPane().add(jFormattedTextField2);

        jLabel3.setText("KETERANGAN");
        jDialog1.getContentPane().add(jLabel3);
        jDialog1.getContentPane().add(jTextField2);

        jLabel4.setText("TANGGAL PEMBAGIAN LABA");
        jDialog1.getContentPane().add(jLabel4);

        jDateChooser1.setDate(new java.util.Date());
        jDialog1.getContentPane().add(jDateChooser1);

        jLabel5.setText("TANGGAL AWAL PENGELUARAN");
        jDialog1.getContentPane().add(jLabel5);

        jDateChooser2.setDate(new java.util.Date());
        jDialog1.getContentPane().add(jDateChooser2);

        jLabel6.setText("TANGGAL AKHIR PENGELUARAN");
        jDialog1.getContentPane().add(jLabel6);

        jDateChooser3.setDate(new java.util.Date());
        jDialog1.getContentPane().add(jDateChooser3);

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDialog1.getContentPane().add(jLabel11);

        jLabel7.setText("JUMLAH MODAL DI TAHAN");
        jDialog1.getContentPane().add(jLabel7);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jDialog1.getContentPane().add(jFormattedTextField1);

        jLabel10.setText("TANGGAL MODAL DI TAHAN");
        jDialog1.getContentPane().add(jLabel10);

        jDateChooser4.setDate(new java.util.Date());
        jDialog1.getContentPane().add(jDateChooser4);

        jLabel8.setText("KETERANGAN MODAL DI TAHAN");
        jDialog1.getContentPane().add(jLabel8);
        jDialog1.getContentPane().add(jTextField3);

        jLabel9.setText("BANK TUJUAN MODAL DI TAHAN");
        jDialog1.getContentPane().add(jLabel9);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${bankList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);

        jDialog1.getContentPane().add(jComboBox2);

        jButton4.setText("SIMPAN");
        jButton4.addActionListener(formListener);
        jDialog1.getContentPane().add(jButton4);

        setLayout(new java.awt.BorderLayout());

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel1.add(refreshButton);

        saveButton.setText("Simpan");
        saveButton.addActionListener(formListener);
        jPanel1.add(saveButton);

        saveButton1.setText("CLOSE TO SELESAI");
        saveButton1.addActionListener(formListener);
        jPanel1.add(saveButton1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setAutoCreateRowSorter(true);
        masterTable.setRowHeight(25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("REF");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profit}"));
        columnBinding.setColumnName("Profit");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${m.statusMobil}"));
        columnBinding.setColumnName("Penjualan Mobil");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${b.laba}"));
        columnBinding.setColumnName("JASA Cabut Berkas");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${h.LABA}"));
        columnBinding.setColumnName("JASA Peminjaman");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${r.LABA}"));
        columnBinding.setColumnName("JASA Rental");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setMinWidth(75);
            masterTable.getColumnModel().getColumn(0).setMaxWidth(75);
            masterTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jComboBox1));
        }
        masterTable.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(jComboBox1));
        masterTable.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(jComboBox1));
        masterTable.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(jComboBox1));

        add(masterScrollPane, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == refreshButton) {
                panelBagiLaba.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                panelBagiLaba.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton1) {
                panelBagiLaba.this.saveButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                panelBagiLaba.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                panelBagiLaba.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                panelBagiLaba.this.jButton4ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
        ((app.view.FixPanel.PanelBank)ShowRoom.jPanel5).Reset();
        bankList.clear();
        bankList.addAll(bankQuery.getResultList());
    }//GEN-LAST:event_refreshButtonActionPerformed

    public List<Bank> getBankList() {
        return bankList;
    }

    public void setBankList(List<Bank> bankList) {
        this.bankList = bankList;
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.BagiLaba> toRemove = new ArrayList<app.table.BagiLaba>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.BagiLaba b = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(b);
            entityManager.remove(b);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        app.table.BagiLaba b = new app.table.BagiLaba();
        entityManager.persist(b);
        list.add(b);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<app.table.BagiLaba> merged = new ArrayList<app.table.BagiLaba>(list.size());
            for (app.table.BagiLaba b : list) {
                merged.add(entityManager.merge(b));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

        java.util.List<app.table.BagiLaba> temp = new LinkedList<>();
    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        temp = new LinkedList<>();
        java.util.List<app.table.Laba> lap = new LinkedList<>();
        for (BagiLaba a : list) {
             if (a.getM() != null) {
                 if (a.getM().getStatusMobil().equals("CLOSE")) {
                     temp.add(a);                     
                 }
            }
            else if ( a.getH() != null)
            {
                if (a.getH().getLABA().equals("CLOSE")) {
                    temp.add(a);        
                }
            }
            else if ( a.getR() != null)
            {
                if (a.getR().getLABA().equals("CLOSE")) {
                temp.add(a);        
                }
            }
            else if ( a.getB() != null)
            {                
                if (a.getB().getLaba().equals("CLOSE")) {
                    temp.add(a);        
                }

            }
        }
        System.out.println("temp = " + temp.size());
        BigInteger b = BigInteger.ZERO;
        for (BagiLaba a : temp) {
             if (a.getM() != null) {
                List<KeuanganMobil> bayarjasaList = a.getM().getKeuanganMobil2();
                    for (KeuanganMobil laporan : bayarjasaList) {
                            b =b.add(laporan.getPemasukan());
                            b =b.subtract(laporan.getPengeluaran());
                    }

            }
            else if ( a.getH() != null)
            {
                List<Bayarhutang> bayarjasaList = a.getH().getBayarhutangs();
                    for (Bayarhutang laporan : bayarjasaList) {
                            b =b.add(laporan.getPemasukan());
                            b =b.subtract(laporan.getPengeluaran());
                    }
            }
            else if ( a.getR() != null)
            {
                List<Bayarrental> bayarjasaList = a.getR().getBayarrentalList();
                    for (Bayarrental laporan : bayarjasaList) {
                            b =b.add(laporan.getPemasukan());
                            b =b.subtract(laporan.getPengeluaran());
                    }

            }
            else if ( a.getB() != null)
            {                
                List<Bayarjasa> bayarjasaList = a.getB().getBayarjasaList();
                    for (Bayarjasa laporan : bayarjasaList) {
                            b =b.add(laporan.getPemasukan());
                            b =b.subtract(laporan.getPengeluaran());
                    }
            }
        }
//        Laporanlaba laporanlaba = new Laporanlaba();
//        for (BagiLaba bagiLaba : temp) {
//            Laba l = new Laba();
//            l.setKeterangan(bagiLaba.getKeterangan());
//            l.setJumlah(bagiLaba.getProfit());
//            lap.add(l);
//            l.setLaporanlabaRef(laporanlaba);
//            entityManager.persist(l);
//        }
//        entityManager.persist(laporanlaba);
        System.out.println("b = " + b);
        b = b.divide(new BigInteger("100"))
                .multiply(new BigInteger(Value));
        jFormattedTextField1.setValue(b.longValue());
//        jDialog1.setSize(300, 300);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButton1ActionPerformed
    public List getMonthList(Class kelas,Date awal,Date Akhir)
    {
        String que = "SELECT en FROM " + kelas.getSimpleName() + " en "
                + "where en.tanggal BETWEEN :startDate AND :endDate"
                ;
       TypedQuery createQuery = entityManager.createQuery(que, kelas)
                .setParameter("startDate", awal, TemporalType.TIMESTAMP)
                .setParameter("endDate", Akhir, TemporalType.TIMESTAMP)  
                ;
        return createQuery.getResultList();
    }
        private BigInteger sumAll(List<? extends Laporan> laporanList)
    {
        BigInteger temp = new BigInteger("0");
        for (Laporan list : laporanList) {
            temp = temp.add(list.getJumlah());
        }
        return temp;
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("app.view.panel.inven.Inventaris.jButton1ActionPerformed()");
        this.jDialog1.hide();
        Laporanlaba laporanlaba = new Laporanlaba();
        Long foo = (Long) jFormattedTextField2.getValue();
        Integer correctButComplicated = Integer.valueOf(foo.intValue());
        laporanlaba.setKeterangan(jTextField2.getText());
        laporanlaba.setKe(correctButComplicated);
        laporanlaba.setTanggal(jDateChooser1.getDate());
        Date Awal = jDateChooser2.getDate();
        Date Akhir = jDateChooser3.getDate();
        for (BagiLaba bagiLaba : temp) {
            Laba l = new Laba();
            l.setKeterangan(bagiLaba.getKeterangan());
            l.setJumlah(bagiLaba.getProfit());
            l.setLaporanlabaRef(laporanlaba);
            entityManager.persist(l);
        }
         java.util.List<Class> KelasList = new LinkedList<>();
        KelasList.add(app.table.Pengeluaran.class);
        KelasList.add(app.table.Pegawaigaji.class);
        KelasList.add(app.table.Asset.class);
        KelasList.add(app.table.BayarPihutangBunga.class);
        Map nama = new LinkedHashMap();
        nama.put(app.table.Pengeluaran.class, "Operasional");
        nama.put(app.table.Asset.class, "Asset");
        nama.put(app.table.Pegawaigaji.class, "Gaji Pegawai");
        nama.put(app.table.BayarPihutangBunga.class, "Bunga Bank");
        final SimpleDateFormat ff = new SimpleDateFormat("dd-MM-yyyy");
        for (Class class1 : KelasList) {
            Laba l = new Laba();
            l.setKeterangan("Pengeluaran "+ nama.get(class1) + " "+ff.format(Awal)+"->"+ff.format(Akhir));
            l.setPengeluaran( sumAll(getMonthList(class1, Awal, Akhir)));
            l.setLaporanlabaRef(laporanlaba);
            entityManager.persist(l);
        }                

        BayarSewaMasuk asset = new BayarSewaMasuk();
        long v = (long) jFormattedTextField1.getValue();
        BigInteger ml = BigInteger.valueOf(v);
        asset.setPemasukan(ml);
        asset.setKeterangan(jTextField3.getText());
        asset.setTanggal(jDateChooser4.getDate());
        Saldo saldo = new Saldo();
        saldo.setBankId((Bank) this.jComboBox2.getSelectedItem());
        asset.setTransaksi(saldo);
        asset.setLaporanlaba(laporanlaba);
        laporanlaba.setModalTahan(asset);
        entityManager.persist(laporanlaba);
        entityManager.persist(asset);
                
        for (BagiLaba a : list) {
             if (a.getM() != null) {
                 if (a.getM().getStatusMobil().equals("CLOSE")) {
                     a.getM().setStatusMobil("SELESAI");
                 }
            }
            else if ( a.getH() != null)
            {
                if (a.getH().getLABA().equals("CLOSE")) {
                    a.getH().setLABA("SELESAI");               
                }
            }
            else if ( a.getR() != null)
            {
                if (a.getR().getLABA().equals("CLOSE")) {
                a.getR().setLABA("SELESAI");      
                }
            }
            else if ( a.getB() != null)
            {                
                if (a.getB().getLaba().equals("CLOSE")) {
                    a.getB().setLaba("SELESAI");
                }

            }
        }
        saveButtonActionPerformed(evt);
        //        Util.RefreshLaporan();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<app.table.Bank> bankList;
    private javax.persistence.Query bankQuery;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel keteranganLabel;
    private java.util.List<app.table.BagiLaba> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
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
            java.util.logging.Logger.getLogger(panelBagiLaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelBagiLaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelBagiLaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelBagiLaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new panelBagiLaba("30"));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    public static void BagiLaba(String Value)
    {
            EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("STATUS KEUNTUNGAN /"+Value+" %MODAL DI TAHAN");
                frame.setContentPane(new panelBagiLaba(Value));
                
//                frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
