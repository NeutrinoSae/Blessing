/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.utils;

import app.Foo;
import app.table.Bank;
import app.table.Laporan;
import app.table.Saldo;
import com.toedter.calendar.JDateChooser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaslang.Tuple3;
import javaslang.Tuple4;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.apache.commons.beanutils.BeanUtils;
import org.jdesktop.beansbinding.BindingGroup;

/**
 *
 * @author SEED
 */
public class inputPanel extends javax.swing.JPanel {

    /**
     * Creates new form inputPanel
     */
    public inputPanel() {
        initComponents();
    }
        javaslang.collection.List<Tuple4<Class<?>, JLabel, JComponent,String>> doFuck = null;
    private Class clazz;

             Class<?> theClass = null;
             
    public Object getTarget() {
             System.out.println("clazz = " + clazz.getName());
             try    {
             target = clazz.newInstance();
             }
             catch (Exception ex) {
            
        }
             if (target instanceof app.table.Laporan) {
                 
//                 ((app.table.Laporan)target).setTransaksi(new Saldo());
//                 Saldo transaksi = ((app.table.Laporan)target).getTransaksi();
//                 Bank find = this.blessingPUEntityManager.find(app.table.Bank.class, 1);
//                 System.out.println("find = " + find);
////                 transaksi.setBankId(find);
//                 Bank bankId = transaksi.getBankId();
//                 System.out.print("bankId = " + bankId);
//                 System.out.println(";Bank default KAS, Transaksai =" + transaksi); 
        }
             doFuck.forEach(new Consumer<Tuple4<Class<?>, JLabel, JComponent, String>>() {
                @Override
                public void accept(Tuple4<Class<?>, JLabel, JComponent, String> a) {
                    Object Value = null;
                    
                    if(a._3 instanceof JFormattedTextField)
                    {
                            Value = ((JFormattedTextField)a._3).getValue();        
                    }
                    else if (a._3 instanceof javax.swing.JTextField) {
                        Value = ((JTextField)a._3).getText();
                    }
                    else if (a._3 instanceof JDateChooser)
                    {
                            Value = ((JDateChooser)a._3).getDate();                        
                    }
                    try {
                        BeanUtils.setProperty(target,a._4,Value);
                    } catch (IllegalAccessException | InvocationTargetException ex) {
                        Logger.getLogger(inputPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });            
       return target;
    }
//    List<javax.swing.JComponent> compList = java.util.Collections.emptyList();
//    List<javax.swing.JLabel> labelList = java.util.Collections.emptyList();
    
    public inputPanel(Object kelas) 
    {
        this.initComponents();
        this.clazz = (Class) kelas;
       Constructor cons;
        try {
            cons = clazz.getConstructor();
            target = cons.newInstance();            
            System.out.println("Target = " + target.toString());
            System.out.println("Acces = " + this.getClass().getName());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            Logger.getLogger(inputPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        Foo list = new Foo();
        try {
            doFuck = (new Foo()).doAnotherFuckingThing((Class) kelas);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(inputPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        doFuck.forEach( tup -> {
             Class<?> tipeField = tup._1();
            JLabel label = tup._2();
            JComponent comp = tup._3();            
            add(label);
            add(comp);
            
            
        }); 
    }
    public inputPanel(BindingGroup bG, JTable table, Object kelas)
    {
        this.initComponents();
    }
    public void binding()
    {
    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        blessingPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blessingPU").createEntityManager();
        loginQuery = java.beans.Beans.isDesignTime() ? null : blessingPUEntityManager.createQuery("SELECT l FROM Login l");
        loginList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loginQuery.getResultList();

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, loginList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kelas}"));
        columnBinding.setColumnName("Kelas");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomorhp}"));
        columnBinding.setColumnName("Nomorhp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${alamat}"));
        columnBinding.setColumnName("Alamat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pass}"));
        columnBinding.setColumnName("Pass");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nama}"));
        columnBinding.setColumnName("Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        setLayout(new java.awt.GridLayout(0, 2));

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
private Object target;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager blessingPUEntityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<app.table.Login> loginList;
    private javax.persistence.Query loginQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void persist(Object object) {
        blessingPUEntityManager.getTransaction().begin();
        try {
            blessingPUEntityManager.persist(object);
            blessingPUEntityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            blessingPUEntityManager.getTransaction().rollback();
        } finally {
            blessingPUEntityManager.close();
        }
    }
}
