package Proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lga
 * @date 2021-03-11 11:34
 * @desc
 */
public class JDKProxy implements InvocationHandler {
    private Object target;

    public JDKProxy() {
    }

    public JDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before"+method.getName());
        Object invoke = method.invoke(target, args);
        System.out.println("after"+method.getName());
        return invoke;
    }
}
