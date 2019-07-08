package com.randy.lambda;

import java.nio.file.FileAlreadyExistsException;

/**
 * Author: randy
 * Date: 2019/6/18 18:52
 */
public class LambdaA {
    void fun2(FunctionalLambdaB fla) {
        System.out.println("LambdaA#fun2: " + fla.fun());
    }

    static void fun1(String s) {
        System.out.println("LambdaA#fun1: " + s);
    }
}
