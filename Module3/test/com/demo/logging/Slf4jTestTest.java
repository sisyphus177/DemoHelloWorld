package com.demo.logging;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/3/27.
 */
public class Slf4jTestTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before Slf4jTest");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Slf4jTest");
    }

    @Test
    public void demoLogBack() throws Exception {
        Slf4jTest instance1 = new Slf4jTest();
        instance1.demoLogBack();
    }

    @Test
    public void main() throws Exception {
        Slf4jTest.main(new String[]{});
    }
}