package com.randy.note.aspectj;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 一个切面类
 *
 * Author: randy
 * Date: 2019/10/12 20:58
 */
public class MyAspect {
    /**
     * 前置通知
     */
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println("目标方法："+joinPoint.getSignature().getName());
        System.out.println("类型:"+joinPoint.getKind());
    }

    /**
     * 后置通知
     *
     * @param joinPoint
     */
    public void after(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }

    /**
     * 无异常后置通知（在发生异常时不执行）
     */
    public void afterReturning(){
        System.out.println("无异常后置通知");
    }

    /**
     * 环绕通知
     *
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知-开始");

        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("环绕通知-结束");

        return proceed;
    }

    /**
     * 异常通知
     */
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable){
        System.out.println("异常通知");
        System.out.println(throwable.getMessage());
    }

}
