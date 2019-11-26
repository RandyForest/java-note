package com.randy.note.spring.aspectjanno;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 一个切面类
 * 使用注解方式
 *
 * Author: randy
 * Date: 2019/10/12 20:58
 */
@Component
@Aspect
public class MyAspect {
    /**
     * 配置切入点
     */
    @Pointcut("execution(* com.randy.note.spring.aspectjanno.*.*(..))")
    private void pointcut(){}

    /**
     * 前置通知
     *
     * @param joinPoint 连接点
     */
    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println("目标方法："+joinPoint.getSignature().getName());
        System.out.println("类型:"+joinPoint.getKind());
    }

    /**
     * 后置通知
     *
     * @param joinPoint 连接点
     */
    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }

    /**
     * 无异常后置通知（在发生异常时不执行）
     */
    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("无异常后置通知");
    }

    /**
     * 环绕通知
     *
     * @param proceedingJoinPoint Spring提供的便捷处理代理的类
     * @return 代理后的对象
     * @throws Throwable 代理失败
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知-开始");

        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("环绕通知-结束");

        return proceed;
    }

    /**
     * 异常通知
     *
     * @param joinPoint 连接点
     * @param throwable 抛出的异常
     */
    @AfterThrowing(value = "pointcut()",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable){
        System.out.println("异常通知");
        System.out.println(throwable.getMessage());
    }

}
