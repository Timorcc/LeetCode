package Proxy.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * @author lga
 * @date 2021-03-11 11:37
 * @desc
 */
public class JDKProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new JDKProxy(target));
    }
}
