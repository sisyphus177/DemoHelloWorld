package com.demo.impl;

import com.demo.testinterface.ReflectTest;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class ReflectImpl2 implements ReflectTest {
    private static String implName="ReflectImpl";
    private static int ID=2;

    public ReflectImpl2(){
        System.out.println();
    }

    public ReflectImpl2(String implName,int ID){
        this.implName = implName;
        this.ID = ID;
        System.out.println();
    }

    @Override
    public void printer() {
        System.out.println("This is "+implName+ID);
    }

    @Override
    public void printHello(String name){
        System.out.println("Hello, "+name+".");
    }
}
