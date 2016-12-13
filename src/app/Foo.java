/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.toedter.calendar.JDateChooser;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;
import static javaslang.API.*;
import javaslang.Tuple;
import javaslang.Tuple3;
import javaslang.collection.HashSet;
import javaslang.collection.List;
import javaslang.collection.Set;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SEED
 */
public class Foo {
    
    private String createLabelName(String str) {
        String[] r = str.split("(?=\\p{Upper})");
        return String.join(" ", Arrays.stream(r).collect(Collectors.toList()));
    }
    
    private String getName(Method method) {
        String name = method.getName();
        int n = name.length();
        String labName = null;
        String tmp = null;
        if (name.startsWith("is")) {
            tmp = name.substring(2, n);
        } else {
            tmp = name.substring(3, n);
        }
        labName = createLabelName(tmp);
        return labName;
    }
    
    public List<Tuple3<Class<?>, JLabel, JComponent>>  doFuck(Class<?> clazz) {
        Method[] methods = clazz.getMethods();
        System.out.println("methods = " + methods.length);
        
        HashSet<Class<?>> pass = HashSet.of(String.class,  Date.class);
        return List.<Method>ofAll(Arrays.stream(methods))
                .filter(meth -> pass.contains(meth.getReturnType()))
                .map(meth -> {
                    Class<?> rt = meth.getReturnType();
                    JLabel label = null;
                    JComponent comp = null;
                    
                    if (rt.equals(String.class)) {
                        comp = new JTextField();
                        label = new JLabel();
                        label.setText(getName(meth));
                        
                    } else if (rt.equals(Date.class)) {
                        comp = new JDateChooser();
                        label = new JLabel();
                        label.setText(getName(meth));
                    }
                    
                    return Tuple.of(rt, label, comp);
                });
    }
    
    public List<Tuple3<Class<?>, JLabel, JComponent>> doAnotherFuckingThing(Class<?> clazz) throws NoSuchFieldException {
        ListUrutan annotation = clazz.getAnnotation(ListUrutan.class);
        if (annotation == null) {
            throw new RuntimeException("Class " + clazz.getName() + " tidak mempunyai annotation ListUrutan");
        }
        
        String[] urutan = annotation.value();
        List<Tuple3<Class<?>, JLabel, JComponent>> result = List.empty();
        for (int i = 0; i < urutan.length; i++) {
            String str = urutan[i];
            Field field = clazz.getDeclaredField(str);
            Class<?> fieldType = field.getType();
            String labText = this.createLabelName(field.getName());
            JLabel label = new JLabel(labText);
            JComponent comp = null;
            
//            if (fieldType.equals(String.class)) {
//                comp = new JTextField();
//            } else 
            if (fieldType.equals(Date.class)) {
                comp = new JDateChooser();
            }
                else
            {
                 comp = new JTextField();
            }
            
            result = result.append(Tuple.of(fieldType, label, comp));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        (new Foo()).doFuck(app.table.Bpkbtitipan.class).forEach(tup -> {
            Class<?> tipeField = tup._1();
            JLabel label = tup._2();
            JComponent comp = tup._3();
            
            if (tipeField.equals(Date.class)) {
                JDateChooser chooser = (JDateChooser) comp;
                /// ;sdklsdjs
            }
        });
    }
}