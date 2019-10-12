package cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * UserDao的Cglib代理类
 * Author: randy
 * Date: 2019/10/10 14:35
 */
public class CglibProxy implements MethodInterceptor {

    /**
     *
     * @param o CGlib根据指定父类生成的代理对象
     * @param method 拦截的方法
     * @param objects 参数数组
     * @param methodProxy 方法代理对象，用于执行父类的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        UserAspect userAspect = new UserAspect();

        userAspect.check();
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        userAspect.log();

        return invokeSuper;
    }

    public Object create(Object object){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }
}
