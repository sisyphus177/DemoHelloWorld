package com.demo.testinterface;

import com.demo.loader.Loader;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class ReflectTestTest {
    @Test
    public void printer() throws Exception {
        Loader loader = new Loader();
        assertTrue(loader.load("com.demo.impl.ReflectImpl1") instanceof ReflectTest);
        assertTrue(loader.load("com.demo.impl.ReflectImpl2") instanceof ReflectTest);
    }

}