package com.demo.loader;

/**
 * Created by raist on 2016/4/9.
 *
 */
public class Loader {
    public Object load(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(classname);
        return c.newInstance();
    }
}
