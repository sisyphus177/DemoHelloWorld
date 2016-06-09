package com.demo.loader;

import com.demo.impl.ReflectImpl1;
import com.demo.impl.ReflectImpl2;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class LoaderTest {
    @Test
    public void load() throws Exception {
        Loader loader = new Loader();
        assertTrue(loader.load("com.demo.impl.ReflectImpl1") instanceof ReflectImpl1);
        assertTrue(loader.load("com.demo.impl.ReflectImpl2") instanceof ReflectImpl2);
    }

}