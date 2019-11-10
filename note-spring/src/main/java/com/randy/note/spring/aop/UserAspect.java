package com.randy.note.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 用户切面类
 * <p>
 * Author: randy
 * Date: 2019/10/10 13:24
 */
public class UserAspect implements MethodInterceptor {
    private void check() {
        System.out.println("检查权限");
    }

    private void log() {
        System.out.println("记录日志");
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        check();
        Object proceed = invocation.proceed();
        log();

        return proceed;
    }
}
