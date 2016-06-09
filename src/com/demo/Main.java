package com.demo;

import com.demo.logging.Slf4jTest;
import com.demo.modules.Module1;
import com.demo.modules.Module2;
import com.demo.modules.Module3;

public class Main {
    //Test
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Module1.main(new String[]{});
        Module2.main(new String[]{});
        Module3.main(new String[]{});
        System.out.println(Module1.Module1return());
        System.out.println(Module2.Module2return());
        System.out.println(Module3.Module3return());

        Slf4jTest slf4jtest = new Slf4jTest();
        slf4jtest.demoLogBack();

        Slf4jTest.main(new String[]{});

//        String a = "a b c";
//        for(String str : a.split("[,\\s]+")){
//            System.out.println(str);
//        }
    }
}
