package com.demo.annotation;

/**
 * Created by raist on 2016/4/11.
 *
 */
@Demo(Author = "Ray", Description = "Demo Annotation", Type = "INTERFACE")
public interface DemoTesterInterface {
    @Demo(Author = "Ray", Description = "Demo Annotation", Type = "ABSTRACT_METHOD")
    void printHello(String name);
}
