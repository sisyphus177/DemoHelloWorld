package com.demo.modules;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/3/27.
 */
public class Module1Test {

    @Before
    public void setUp() throws Exception {
        System.out.println("before Module1Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Module1Test");
    }

    @Test
    public void module1return() throws Exception {
        System.out.println(Module1.Module1return());
    }

    @Test
    public void main() throws Exception {
        Module1.main(new String[]{});
    }
}