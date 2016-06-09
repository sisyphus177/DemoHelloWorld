package com.demo.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class ReflectImplTest {
    @Test
    public void printer() throws Exception {
        new ReflectImpl1().printer();
        new ReflectImpl2().printer();
    }

}