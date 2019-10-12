package dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用户的JDK代理类
 *
 * Author: randy
 * Date: 2019/10/10 13:26
 */
public class UserProxy implements InvocationHandler {
    private UserDao userDao;

    /**
     * 增强UserDao
     * UserDao在执行每个方法时调用此方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        UserAspect userAspect = new UserAspect();
        userAspect.check();
        Object invoke = method.invoke(userDao, args);
        userAspect.log();

        return invoke;
    }

    public Object createUserDaoProxy(UserDao userDao){
        this.userDao=userDao;

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        return Proxy.newProxyInstance(classLoader,interfaces,this);
    }

}
