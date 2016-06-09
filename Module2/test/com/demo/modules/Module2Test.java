package com.demo.modules;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/3/27.
 */
public class Module2Test {

    @Before
    public void setUp() throws Exception {
        System.out.println("before Module2Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Module2Test");
    }

    @Test
    public void module2return() throws Exception {
        System.out.println(Module2.Module2return());
    }

    @Test
    public void main() throws Exception {
        Module2.main(new String[]{});
    }
}