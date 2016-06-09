package com.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/3/27.
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before Main");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Main");
    }

    @Test
    public void main() throws Exception {
        Main.main(new String[]{});
        try {
            assertEquals("expected msg","expected","expected");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}