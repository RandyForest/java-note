package com.randy.note.base.annotation;

/**
 * Author: randy
 * Date: 2019/6/15 15:00
 */
@MyAnnotation(color = "red")
class MyAnnotationTest {
    @MyAnnotation(color = "blue", brightness = 100)
    void myColor() {
    }
}
