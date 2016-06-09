package com.demo.impl;

import com.demo.testinterface.ReflectTest;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class ReflectImpl1 implements ReflectTest {
    private static String implName="ReflectImpl";
    private static int ID=1;

    public ReflectImpl1(){
        System.out.println();
    }

    public ReflectImpl1(String implName,int ID){
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
