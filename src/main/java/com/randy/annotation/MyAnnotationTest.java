package com.randy.annotation;

/**
 * Author: randy
 * Date: 2019/6/15 15:00
 */
@MyAnnotation(color = "red")
public class MyAnnotationTest {
    @MyAnnotation(color = "blue",brightness = 100)
    public void myColor(){

    }
}
