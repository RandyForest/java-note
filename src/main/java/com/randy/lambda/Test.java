package com.randy.lambda;

/**
 * Author: randy
 * Date: 2019/6/18 18:54
 * <p>
 * lambda 表达式
 */
public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        new LambdaA().fun2(() -> {
            return 1;
        });
    }

    private static void test2() {

        /*
         * 接口 对象 = 类::方法;
         *
         * 方法必须是静态方法
         */
        FunctionalLambdaA fla = LambdaA::fun1;

        fla.fun("test2");
    }

    private static void test1() {

        /*
         * 接口 对象 = (参数) -> {方法体}
         *
         * 接口要是函数式接口
         * 参数不用写数据类型
         */
        FunctionalLambdaA fla = (s) -> {
            System.out.println("Test#test1: " + s);
        };

        fla.fun("test1");
    }
}
