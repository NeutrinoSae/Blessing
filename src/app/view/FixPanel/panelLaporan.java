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
import static app.utils.ExcelConverter.ExcelConverter;
import app.utils.Printer;
import static app.utils.Printer.PrintLaporan;
import com.joobar.csvbless.CSVUtil;
import com.joobar.csvbless.WriteStep;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.beans.Beans;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javaslang.Tuple;
import javax.persistence.RollbackException;
import javax.persistence.TemporalType;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SEED
 */
public class panelLaporan extends JPanel {

    public panelLaporan() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        this.Refresh();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Laporan l order by l.tanggal asc");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        saveButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog3 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        refreshButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        refreshButton2 = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        FormListener formListener = new FormListener();

        saveButton.setText("Save");
        saveButton.addActionListener(formListener);

        newButton.setText("New");
        newButton.addActionListener(formListener);

        deleteButton.setText("Delete");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);

        jDialog1.setTitle("INFORMASI ");
        jDialog1.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Total Pemasukan");
        jPanel1.add(jLabel1);

        jTextField1.setEditable(false);
        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);

        jLabel2.setText("Total Pengeluaran");
        jPanel1.add(jLabel2);

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField1");
        jPanel1.add(jTextField2);

        jLabel3.setText("Saldo Terakhir");
        jPanel1.add(jLabel3);

        jTextField3.setEditable(false);
        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3);

        jLabel4.setText("Total Transaksi");
        jPanel1.add(jLabel4);

        jTextField4.setEditable(false);
        jPanel1.add(jTextField4);

        jLabel5.setText("Total Transaksi Pemasukan");
        jPanel1.add(jLabel5);

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5);

        jLabel6.setText("Total Transaksi Pengeluaran");
        jPanel1.add(jLabel6);

        jTextField6.setEditable(false);
        jPanel1.add(jTextField6);

        jDialog1.getContentPane().add(jPanel1);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDialog1.getContentPane().add(jScrollPane1);

        jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser1.setApproveButtonText("Print Laporan/All data");
        jFileChooser1.setApproveButtonToolTipText("");
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jFileChooser1.addActionListener(formListener);

        jDialog3.setSize(450, 250);
        jDialog3.getContentPane().setLayout(new java.awt.GridLayout(0, 2));

        jLabel8.setText("Tanggal Awal");
        jDialog3.getContentPane().add(jLabel8);

        jDateChooser2.setDate(new Date());
        jDialog3.getContentPane().add(jDateChooser2);

        jLabel9.setText("Tanggal Akhir");
        jDialog3.getContentPane().add(jLabel9);

        jDateChooser3.setDate(new Date());
        jDialog3.getContentPane().add(jDateChooser3);

        jLabel11.setText("Status");
        jDialog3.getContentPane().add(jLabel11);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "CLOSE", "SEMUA" }));
        jDialog3.getContentPane().add(jComboBox1);

        jButton5.setText("Filter");
        jButton5.addActionListener(formListener);
        jDialog3.getContentPane().add(jButton5);

        jButton6.setText("Tutup");
        jButton6.addActionListener(formListener);
        jDialog3.getContentPane().add(jButton6);

        jLabel10.setText("jLabel10");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPEN", "CLOSE" }));

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel7.setText("Laporan Transaksi Bulan ini");
        jPanel3.add(jLabel7);

        jButton3.setText("Tampilkan Informasi");
        jButton3.addActionListener(formListener);
        jPanel3.add(jButton3);

        jButton2.setText("Print");
        jButton2.addActionListener(formListener);
        jPanel3.add(jButton2);

        jButton1.setText("Tampilkan Bulan");
        jButton1.addActionListener(formListener);
        jPanel3.add(jButton1);

        jMonthChooser1.setDayChooser(null);
        jMonthChooser1.setMonth(10);
        jMonthChooser1.setMonth(new java.util.Date().getMonth());
        jMonthChooser1.setPreferredSize(new java.awt.Dimension(120, 40));
        jMonthChooser1.setYearChooser(jYearChooser1);
        jMonthChooser1.addPropertyChangeListener(formListener);
        jPanel3.add(jMonthChooser1);

        jYearChooser1.setPreferredSize(new java.awt.Dimension(70, 40));
        jYearChooser1.setYear(Calendar.getInstance().get(Calendar.YEAR));
        jYearChooser1.addPropertyChangeListener(formListener);
        jPanel3.add(jYearChooser1);

        refreshButton.setText("Tampilkan Bulan ini");
        refreshButton.addActionListener(formListener);
        jPanel3.add(refreshButton);

        jButton4.setText("Tampilkan Semua laporan");
        jButton4.addActionListener(formListener);
        jPanel3.add(jButton4);

        refreshButton2.setText("Filter Tanggal");
        refreshButton2.addActionListener(formListener);
        jPanel3.add(refreshButton2);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        //masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        //masterTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setGridColor(new java.awt.Color(0, 0, 0));
        masterTable.setRowHeight(25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Ref");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tanggal}"));
        columnBinding.setColumnName("Tanggal");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${keterangan}"));
        columnBinding.setColumnName("Keterangan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pemasukan}"));
        columnBinding.setColumnName("Pemasukan");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pengeluaran}"));
        columnBinding.setColumnName("Pengeluaran");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldo}"));
        columnBinding.setColumnName("Saldo");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${jenis}"));
        columnBinding.setColumnName("tipe");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${transaksi.bankId.namaBank}"));
        columnBinding.setColumnName("Tujuan");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipe}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setMaxWidth(75);
        }
        masterTable.getColumnModel().getColumn(8).setCellEditor(new javax.swing.DefaultCellEditor(jComboBox2));

        jPanel2.add(masterScrollPane, java.awt.BorderLayout.CENTER);

        add(jPanel2);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.beans.PropertyChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton3) {
                panelLaporan.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                panelLaporan.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                panelLaporan.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                panelLaporan.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                panelLaporan.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton2) {
                panelLaporan.this.refreshButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                panelLaporan.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                panelLaporan.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                panelLaporan.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jFileChooser1) {
                panelLaporan.this.jFileChooser1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                panelLaporan.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton6) {
                panelLaporan.this.jButton6ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                panelLaporan.this.masterTableMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }

        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            if (evt.getSource() == jMonthChooser1) {
                panelLaporan.this.jMonthChooser1PropertyChange(evt);
            }
            else if (evt.getSource() == jYearChooser1) {
                panelLaporan.this.jYearChooser1PropertyChange(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
            Date today = new Date();
            System.out.println("today = " + today);
            Date startMonth = new Date(today.getYear(), today.getMonth(), 0);
            System.out.println("startMonth = " + startMonth);
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONDAY, today.getMonth());
            cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
            cal.set(Calendar.HOUR_OF_DAY, 23);
            Date endMonth = cal.getTime();        
            System.out.println("endMonth = " + endMonth);            
            query = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal BETWEEN :startDate AND :endDate order by l.tanggal asc")
                .setParameter("startDate", startMonth, TemporalType.DATE)
                .setParameter("endDate", endMonth, TemporalType.DATE);  
            java.util.List<app.table.Laporan> data = query.getResultList();
            app.table.Util.RefreshLaporan();
            java.math.BigInteger saldo = new java.math.BigInteger("0");               
            BigInteger temp = BigInteger.ZERO;
            BigInteger temp1 = BigInteger.ZERO;  
            List<Laporan> rangkuman = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal < :endDate")
                .setParameter("endDate", startMonth, TemporalType.DATE)  
                .getResultList();
            for (Laporan laporan : rangkuman) {
                    temp = temp.add(laporan.getPemasukan());
                    temp1 = temp1.add(laporan.getPengeluaran());
            }
            Laporan Pengeluaran = new Pengeluaran();
            Laporan Pemasukan = new Pemasukan();
            Pengeluaran.setJumlah(temp1);
            Pemasukan.setJumlah(temp);
            Pemasukan.setKeterangan("R. Pemasukan bulan sebelumnya");
            Pengeluaran.setKeterangan("R. Pengeluaran bulan sebelumnya");
            Saldo saldo1 = new Saldo();
            Bank bank = new Bank();
            saldo1.setBankId(bank);
            Pemasukan.setTransaksi(saldo1);
            Pengeluaran.setTransaksi(saldo1);
            list.clear();
            this.list.add(Pemasukan);
            this.list.add(Pengeluaran);        
            list.addAll(data);
            for (Laporan laporan : list) {
            saldo = saldo.subtract(laporan.getPengeluaran());
            saldo = saldo.add(laporan.getPemasukan());
            laporan.setSaldo(saldo);
            if (laporan.getSaldo() == null) {
                System.out.println("null di + "+laporan.toString());
            }
        }

    }//GEN-LAST:event_refreshButtonActionPerformed
DecimalFormat numberFormat = new DecimalFormat("IDR #,##0");
public void hitung()
{
        BigInteger pemasukan = BigInteger.ZERO, pengeluaran = pemasukan;
        long masuk = 0;
        long keluar = 0;
        long asset = 0;
         java.math.BigInteger saldo = new java.math.BigInteger("0");
        for (Laporan laporan : list) {
            pemasukan = pemasukan.add(laporan.getPemasukan());
            pengeluaran = pengeluaran.add(laporan.getPengeluaran());
            saldo = saldo.subtract(laporan.getPengeluaran());
            saldo = saldo.add(laporan.getPemasukan());
            laporan.setSaldo(saldo);
            if (laporan.isName()) {
                masuk++;  
            }
            else keluar++;
        }
        long total = masterTable.getRowCount();
        this.jTextField1.setText(numberFormat.format(pemasukan));
        this.jTextField2.setText(numberFormat.format(pengeluaran));
        this.jTextField3.setText(numberFormat.format(pemasukan.subtract(pengeluaran)));
        this.jTextField4.setText(masterTable.getRowCount() + " Transaksi");
        this.jTextField5.setText(masuk + " Transaksi");
        this.jTextField6.setText(keluar + " Transaksi");        
        Map<String, Long> collect = 
                list
                        .stream()
                        .collect(Collectors.groupingBy(l  -> l.getJenis(), Collectors.counting()));        
        collect.put("Total Transaksi", total);
        Map<String, Long> sort = new TreeMap<>(collect);
        this.jTable1.setModel(toTableModel(sort));


}
public void Refresh(){
        this.refreshButtonActionPerformed(null);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<app.table.Laporan> toRemove = new ArrayList<app.table.Laporan>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            app.table.Laporan l = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(l);
            entityManager.remove(l);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        app.table.Laporan l = new app.table.Laporan();
        entityManager.persist(l);
        list.add(l);
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
            List<app.table.Laporan> merged = new ArrayList<app.table.Laporan>(list.size());
            for (app.table.Laporan l : list) {
                merged.add(entityManager.merge(l));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

//        Refresh();
        this.hitung();
        jDialog1.setSize(800, 400);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();                    
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONDAY, bulan);
            cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));            
            cal.set(Calendar.YEAR, tahun);
            Date akhirBulan = cal.getTime();
            Date awalBulan = new Date(tahun-1900, bulan, hari);
            System.out.println("awalBulan laporan = " + awalBulan);
            System.out.println("akhirBulan laporan = " + akhirBulan);
            Laporan Pengeluaran = new Pengeluaran();
            Laporan Pemasukan = new Pemasukan();
            BigInteger temp = BigInteger.ZERO;
            BigInteger temp1 = BigInteger.ZERO;    
            List<Laporan> rangkuman = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal < :endDate")
//                .setParameter("startDate", new Date(0, 0, 0), TemporalType.DATE)
                .setParameter("endDate", awalBulan, TemporalType.DATE)  
                .getResultList();
            for (Laporan laporan : rangkuman) {
                    temp = temp.add(laporan.getPemasukan());
                    temp1 = temp1.add(laporan.getPengeluaran());
            }
            Pengeluaran.setJumlah(temp1);
            Pemasukan.setJumlah(temp);
            Pemasukan.setKeterangan("R. Pemasukan bulan sebelumnya");
            Pengeluaran.setKeterangan("R. Pengeluaran bulan sebelumnya");
            Saldo saldo1 = new Saldo();
            Bank bank = new Bank();
            saldo1.setBankId(bank);
            Pemasukan.setTransaksi(saldo1);
            Pengeluaran.setTransaksi(saldo1);
            this.list.clear();
            this.list.add(Pemasukan);
            this.list.add(Pengeluaran);
            List resultList = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal BETWEEN :startDate AND :endDate ORDER BY l.tanggal")
                .setParameter("startDate", awalBulan, TemporalType.DATE)
                .setParameter("endDate", akhirBulan, TemporalType.DATE)  
                .getResultList();
            list.addAll(resultList);
            java.math.BigInteger saldo = new java.math.BigInteger("0");               
            for (Laporan laporan : list) {
            saldo = saldo.subtract(laporan.getPengeluaran());
            saldo = saldo.add(laporan.getPemasukan());
            laporan.setSaldo(saldo);
            if (laporan.getSaldo() == null) {
                System.out.println("null di + "+laporan.toString());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private int tahun,bulan, hari = 1;
    private void jMonthChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooser1PropertyChange
        // TODO add your handling code here:
        bulan = this.jMonthChooser1.getMonth();
    }//GEN-LAST:event_jMonthChooser1PropertyChange

    private void jYearChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jYearChooser1PropertyChange
        // TODO add your handling code here:
        tahun = this.jYearChooser1.getYear();
    }//GEN-LAST:event_jYearChooser1PropertyChange
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        app.table.Util.RefreshLaporan();
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        List resultList = entityManager.createQuery(
                "SELECT l FROM Laporan l ORDER BY l.tanggal")
                .getResultList();
        list.clear();
        list.addAll(resultList);
        java.math.BigInteger saldo = new java.math.BigInteger("0");               
        for (Laporan laporan : list) {
            saldo = saldo.subtract(laporan.getPengeluaran());
            saldo = saldo.add(laporan.getPemasukan());
            laporan.setSaldo(saldo);
            if (laporan.getSaldo() == null) {
                System.out.println("null di + "+laporan.toString());
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_masterTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFileChooser1.showSaveDialog(jPanel1);            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        File root = jFileChooser1.getSelectedFile();
        Date p = new Date();
        final SimpleDateFormat formator = new SimpleDateFormat("dd-MM-yyyy");
        final DecimalFormat IDR = new DecimalFormat("###0");
        List a = list;
        File file = new File(root, "Laporan Utama "+formator.format(p)+".CSV");
        System.out.println("file = " + file);
        WriteStep dataList = CSVUtil.of(file)
                .type(app.table.Laporan.class)
                .properties(
                        Tuple.of("Ref", "id", null),
                        Tuple.of("Tanggal", "tanggal", d -> formator.format(d)),
                        Tuple.of("Keterangan", "keterangan", d -> d),
                        Tuple.of("Pemasukan", "pemasukan", d -> IDR.format(d) ),
                        Tuple.of("Pengeluaran", "pengeluaran", d -> IDR.format(d) ),
                        Tuple.of("Saldo", "saldo", d -> IDR.format(d) ),
                        Tuple.of("Jenis", "jenis", d -> d ),
                        Tuple.of("Bank", "transaksi.bankId.namaBank", d -> d==null? "":d)
                ).dataList(a);
        try {
                 List<File> cvs = new java.util.LinkedList<>();
                 cvs.add(file);
                 dataList.write();            
                 ExcelConverter(cvs, new File(root, "Laporan Utama "+formator.format(p)+".xls"));
                } catch (Exception e) {
                    e.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(null, "Gagal Print, Karena tidak bisa di akses\n"+e);
                }
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, 
                                "Berhasil Print apakah ingin di buka"                             
                                + "\nPath = "+ file);
         Desktop desktop = Desktop.getDesktop();
         if(!Desktop.isDesktopSupported())
                            javax.swing.JOptionPane.showMessageDialog(null
                                    , "Gagal Print, system tidak mendukung\n");

        if (confirm ==0) {
            if (file.exists()) {
                     try {  desktop.open( new File(root, "Laporan Utama "+formator.format(p)+".xls"));
                     } 
                     catch (Exception ex) {
                                         javax.swing.JOptionPane.showMessageDialog(null, "Gagal Print, Karena tidak bisa di akses\n"+ex);
                            }    
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void refreshButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton2ActionPerformed

        jDialog3.setLocationRelativeTo(null);
        jDialog3.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        String cari = jComboBox1.getSelectedItem().toString();
        String cari1 = "AND l.tipe = '"+cari+"'";
            if (cari.equals("SEMUA")) {
            cari1 = "";
        }
            System.out.println("cari = " + cari);
            Date awal = jDateChooser2.getDate();
            Date akhir = jDateChooser3.getDate();
            query = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal BETWEEN :startDate AND :endDate "+cari1+"order by l.tanggal asc")
                .setParameter("startDate", awal, TemporalType.DATE)
                .setParameter("endDate", akhir, TemporalType.DATE)
//                    .setParameter("cari1", cari)
                    ;  
            java.util.List<app.table.Laporan> data = query.getResultList();
            app.table.Util.RefreshLaporan();
            java.math.BigInteger saldo = new java.math.BigInteger("0");               
            BigInteger temp = BigInteger.ZERO;
            BigInteger temp1 = BigInteger.ZERO;  
            List<Laporan> rangkuman = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal < :endDate")
                .setParameter("endDate", awal, TemporalType.DATE)  
                .getResultList();
            for (Laporan laporan : rangkuman) {
                    temp = temp.add(laporan.getPemasukan());
                    temp1 = temp1.add(laporan.getPengeluaran());
            }
            Laporan Pengeluaran = new Pengeluaran();
            Laporan Pemasukan = new Pemasukan();
            Pengeluaran.setJumlah(temp1);
            Pemasukan.setJumlah(temp);
            Pemasukan.setKeterangan("R. Pemasukan bulan sebelumnya");
            Pengeluaran.setKeterangan("R. Pengeluaran bulan sebelumnya");
            Saldo saldo1 = new Saldo();
            Bank bank = new Bank();
            saldo1.setBankId(bank);
            Pemasukan.setTransaksi(saldo1);
            Pengeluaran.setTransaksi(saldo1);
            list.clear();
            this.list.add(Pemasukan);
            this.list.add(Pengeluaran);        
            list.addAll(data);
            for (Laporan laporan : list) {
            saldo = saldo.subtract(laporan.getPengeluaran());
            saldo = saldo.add(laporan.getPemasukan());
            laporan.setSaldo(saldo);
            if (laporan.getSaldo() == null) {
                System.out.println("null di + "+laporan.toString());
            }
        }
        jDialog3.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDialog3.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private java.util.List<app.table.Laporan> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.persistence.Query query;
    javax.swing.JButton refreshButton;
    private javax.swing.JButton refreshButton2;
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
            java.util.logging.Logger.getLogger(panelLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelLaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new panelLaporan());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    public static TableModel toTableModel(Map<?,?> map) {
        DefaultTableModel model = new DefaultTableModel(
            new Object[] { "Transaksi", "Jumlah" }, 0
        );
        for (Map.Entry<?,?> entry : map.entrySet()) {
            model.addRow(new Object[] { entry.getKey(), entry.getValue() });
        }
        return model;
    }

}
