package dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author: randy
 * Date: 2019/10/10 14:31
 */
public class JdkProxy implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    /**
     * 增强Object
     * 在每次调用Object方法时执行
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
        Object invoke = method.invoke(object, args);
        userAspect.log();

        return invoke;
    }

}
