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
             try    {
             target = clazz.newInstance();
             }
             catch (Exception ex) {
            
        }
             if (target instanceof app.table.Laporan) {
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
                        System.err.println("Error = "+ a._4);
//                        Logger.getLogger(inputPanel.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.println("Target = " + target.getClass().getSimpleName());
            setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input data->"+ target.getClass().getSimpleName(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blessingPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blessingPU").createEntityManager();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT DATA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        setLayout(new java.awt.GridLayout(0, 1));
    }// </editor-fold>//GEN-END:initComponents
private Object target;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager blessingPUEntityManager;
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
