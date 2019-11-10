package com.randy.note.base.lambda;

/**
 * Author: randy
 * Date: 2019/6/18 18:52
 */
class LambdaA {
    void fun2(FunctionalLambdaB fla) {
        System.out.println("LambdaA#fun2: " + fla.fun());
    }

    static void fun1(String s) {
        System.out.println("LambdaA#fun1: " + s);
    }
}
