package com.randy.annotation;

import com.randy.note_interface.ClassA;
import com.randy.note_interface.InterfaceA;

import java.lang.reflect.Method;

/**
 * Author: randy
 * Date: 2019/6/15 14:27
 */
public class Note_Annotation {

    public static void main(String[] args) throws NoSuchMethodException {
        printMyAnnotationTestAnnotation();
        printMyAnnotationTestMyColorAnnotation();
    }


    // 获取方法 MyAnnotationTest#myColor 中注解 MyAnnotation 的值
    private static void printMyAnnotationTestMyColorAnnotation() throws NoSuchMethodException {
        Method myColor = MyAnnotationTest.class.getMethod("myColor");
        MyAnnotation annotation = myColor.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.color());
        System.out.println(annotation.brightness());

    }

    // 获取类 MyAnnotationTest 中注解 MyAnnotation 的值
    private static void printMyAnnotationTestAnnotation() {
        MyAnnotation annotation = MyAnnotationTest.class.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.color());
        System.out.println(annotation.brightness());
    }
}
