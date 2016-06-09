package com.demo.modules;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/3/27.
 */
public class Module3Test {

    @Before
    public void setUp() throws Exception {
        System.out.println("before Module3Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Module3Test");
    }

    @Test
    public void module3return() throws Exception {
        System.out.println(Module3.Module3return());
    }

    @Test
    public void main() throws Exception {
        Module3.main(new String[]{});
    }
}