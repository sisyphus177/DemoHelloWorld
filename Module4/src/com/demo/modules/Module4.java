package com.demo.modules;

import com.demo.impl.ReflectImpl1;
import com.demo.impl.ReflectImpl2;
import com.demo.loader.Loader;
import com.demo.testinterface.ReflectTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class Module4 {

    public Module4(){
        System.out.println("Module4 constructor");
    }

    public static void printClassInfo(Object obj) throws NoSuchMethodException {
        System.out.println("----------------Print Class Info--------------------");
        Class c = obj.getClass();
        System.out.println(c.getName());

        //Field[] fields = c.getFields();
        Field[] fields = c.getDeclaredFields();
        System.out.print("|---- "+"Fields:");
        for(int i=0;i<fields.length;i++){
            System.out.print(fields[i].getType().getName()+" "+fields[i].getName());
            if(i<fields.length-1){
                System.out.print(";");
            }
        }
        System.out.println();

        Constructor[] constructor = c.getConstructors();
        //Constructor[] constructor = c.getDeclaredConstructors();
        for(Constructor m:constructor){
            System.out.print("|---- "+m.getName()+"(");
            Class[] params = m.getParameterTypes();
            String str = "";
            for(int i=0;i<params.length;i++){
                str+=params[i].getName();
                if(i<params.length-1){
                    str+=",";
                }
            }
            System.out.print(str);
            System.out.println(")");
        }

        Method[] methods = c.getMethods();
        //Method[] methods = c.getDeclaredMethods();
        for(Method m:methods){
            System.out.print("|---- "+m.getReturnType().getName()+" "+m.getName()+"(");
            Class[] params = m.getParameterTypes();
            String str = "";
            for(int i=0;i<params.length;i++){
                str+=params[i].getName();
                if(i<params.length-1){
                    str+=",";
                }
            }
            System.out.print(str);
            System.out.println(")");
        }


    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Module4.class;
        Module4 m1 = new Module4();
        Class c2 = m1.getClass();
        Module4 m2 = (Module4) c2.newInstance();
        Class c3 = Class.forName("com.demo.modules.Module4");
        Module4 m3 = (Module4) c3.newInstance();

        System.out.println("1)"+(c1==c2));
        System.out.println("2)"+(c2==m3.getClass()));
        System.out.println("3)"+(m2 instanceof Module4));

        Class c4 = Class.forName("com.demo.impl.ReflectImpl1");
        ReflectTest test1 = (ReflectTest)c4.newInstance();
        System.out.println("4)"+(test1 instanceof ReflectImpl1));
        test1.printer();
        test1.printHello("world");

        Loader ldr = new Loader();
        ReflectTest test2 = (ReflectTest)ldr.load("com.demo.impl.ReflectImpl2");
        System.out.println("5)"+(test2 instanceof ReflectImpl2));
        test2.printer();
        test2.printHello("world");

        printClassInfo(test1);

        //printClassInfo(new String());

        //Method method1 = Class.forName("com.demo.impl.ReflectImpl1").getMethod("printer");
        Method method1 = Class.forName("com.demo.impl.ReflectImpl1").getDeclaredMethod("printer");
        method1.invoke(test1);

        //Method method2 = Class.forName("com.demo.impl.ReflectImpl1").getMethod("printHello",String.class);
        Method method2 = Class.forName("com.demo.impl.ReflectImpl1").getDeclaredMethod("printHello",String.class);
        method2.invoke(test1,"world");
    }
}
