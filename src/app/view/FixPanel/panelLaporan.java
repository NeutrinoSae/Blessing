/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.FixPanel;

import app.table.Laporan;
import app.table.Pemasukan;
import app.table.Pengeluaran;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.EventQueue;
import java.beans.Beans;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import javax.persistence.RollbackException;
import javax.persistence.TemporalType;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jButton4 = new javax.swing.JButton();
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

        jLabel3.setText("Profit");
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

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel7.setText("Laporan Transaksi Bulan ini");
        jPanel3.add(jLabel7);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel3.add(refreshButton);

        jButton3.setText("Tampilkan Informasi");
        jButton3.addActionListener(formListener);
        jPanel3.add(jButton3);

        jButton2.setText("Print");
        jPanel3.add(jButton2);

        jButton1.setText("Filter");
        jButton1.addActionListener(formListener);
        jPanel3.add(jButton1);

        jMonthChooser1.setDayChooser(null);
        jMonthChooser1.setMonth(10);
        jMonthChooser1.setMonth(new java.util.Date().getMonth());
        jMonthChooser1.setPreferredSize(new java.awt.Dimension(120, 40));
        jMonthChooser1.addPropertyChangeListener(formListener);
        jPanel3.add(jMonthChooser1);

        jYearChooser1.setPreferredSize(new java.awt.Dimension(70, 40));
        jYearChooser1.setYear(Calendar.getInstance().get(Calendar.YEAR));
        jYearChooser1.addPropertyChangeListener(formListener);
        jPanel3.add(jYearChooser1);

        jButton4.setText("Tampilkan Semua Laporan");
        jButton4.addActionListener(formListener);
        jPanel3.add(jButton4);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        masterScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        //masterTable.setDefaultEditor(String.class, new app.utils.TablePopupEditor());
        //masterTable.setDefaultEditor(Date.class, new JDateChooserCellEditor());
        masterTable.setDefaultRenderer(java.math.BigInteger.class, new app.utils.NominalRender());
        masterTable.setAutoCreateRowSorter(true);
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${transaksi.bankId}"));
        columnBinding.setColumnName("Tujuan");
        columnBinding.setColumnClass(app.table.Bank.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);

        jPanel2.add(masterScrollPane, java.awt.BorderLayout.CENTER);

        add(jPanel2);

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.beans.PropertyChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == refreshButton) {
                panelLaporan.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                panelLaporan.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                panelLaporan.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                panelLaporan.this.jButton4ActionPerformed(evt);
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
            
//        java.util.List<app.table.Laporan> data = query.getResultList();
        query = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal BETWEEN :startDate AND :endDate order by l.tanggal asc")
                .setParameter("startDate", startMonth, TemporalType.DATE)
                .setParameter("endDate", endMonth, TemporalType.DATE);  
//                .getResultList();
        java.util.List<app.table.Laporan> data = query.getResultList();
        java.math.BigInteger saldo = new java.math.BigInteger("0");               
        for (Laporan laporan : data) {
            entityManager.refresh(laporan);            
            saldo = saldo.subtract(laporan.getPengeluaran());
            saldo = saldo.add(laporan.getPemasukan());
            laporan.setSaldo(saldo);
            if (laporan.getSaldo() == null) {
                System.out.println("null di + "+laporan.toString());
            }
        }
        
        list.clear();
        list.addAll(data);
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

//            boolean out = laporan.getPemasukan().equals(BigInteger.ZERO);
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
//        System.out.println("collect = " + collect);
//        counting = items.stream().collect(
//                Collectors.groupingBy(Item::getName, Collectors.counting()));
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
                    
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONDAY, bulan);
            cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
            Date akhirBulan = cal.getTime();
            Date awalBulan = new Date(tahun-1900, bulan, hari);
            System.out.println("awalBulan laporan = " + awalBulan);
            System.out.println("akhirBulan laporan = " + akhirBulan);
            Laporan Pengeluaran = new Pengeluaran();
            Laporan Pemasukan = new Pemasukan();
            BigInteger temp = BigInteger.ZERO;
            BigInteger temp1 = BigInteger.ZERO;
    
            List<Laporan> rangkuman = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal BETWEEN :startDate AND :endDate")
                .setParameter("startDate", new Date(0, 0, 0), TemporalType.DATE)
                .setParameter("endDate", awalBulan, TemporalType.DATE)  
                .getResultList();
            for (Laporan laporan : rangkuman) {
                    temp = temp.add(laporan.getPemasukan());
                    temp1 = temp1.add(laporan.getPengeluaran());
            }
            Pengeluaran.setJumlah(temp1);
            Pemasukan.setJumlah(temp);
            Pemasukan.setKeterangan("R. Pengeluaran bulan sebelumnya");
            Pengeluaran.setKeterangan("R. Pengeluaran bulan sebelumnya");
            this.list.clear();
            this.list.add(Pemasukan);
            this.list.add(Pengeluaran);
            
            //tambahkan data
            List resultList = entityManager.createQuery(
                "SELECT l FROM Laporan l where l.tanggal BETWEEN :startDate AND :endDate")
                .setParameter("startDate", awalBulan, TemporalType.DATE)
                .setParameter("endDate", akhirBulan, TemporalType.DATE)  
                .getResultList();
            list.addAll(resultList);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_masterTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
