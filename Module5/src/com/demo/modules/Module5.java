package com.demo.modules;

import com.demo.annotation.Demo;
import com.demo.annotation.DemoTesterInterface;

import java.lang.reflect.Method;

/**
 * Created by raist on 2016/4/11.
 *
 */
public class Module5 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {

        Class c = Class.forName("com.demo.annotation.DemoTesterChild");
        Method m = c.getMethod("printHello",String.class);
        Demo demoAnnotation;
        if(c.isAnnotationPresent(Demo.class)){
            demoAnnotation = (Demo)c.getAnnotation(Demo.class);
            System.out.println(demoAnnotation);
            System.out.println("["+demoAnnotation.Author()+"]["+demoAnnotation.Description()+"]["+demoAnnotation.Type()+"]");
        }
        if(m.isAnnotationPresent(Demo.class)){
            demoAnnotation = m.getAnnotation(Demo.class);
            System.out.println(demoAnnotation);
            System.out.println("["+demoAnnotation.Author()+"]["+demoAnnotation.Description()+"]["+demoAnnotation.Type()+"]");
        }
        DemoTesterInterface demoTesterInst = (DemoTesterInterface)c.newInstance();
        demoTesterInst.printHello("World");

    }
}
