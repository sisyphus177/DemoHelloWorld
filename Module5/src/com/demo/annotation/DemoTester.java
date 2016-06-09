package com.demo.annotation;

/**
 * Created by raist on 2016/4/11.
 *
 */
@Demo(Author = "Raistlin", Description = "Demo Annotation", Type = "CLASS")
public class DemoTester implements DemoTesterInterface{

    @Demo(Author = "Raistlin", Description = "Demo Annotation", Type = "METHOD")
    public void printHello(String name){
        System.out.println("Hello, "+name+".");
    }

}
