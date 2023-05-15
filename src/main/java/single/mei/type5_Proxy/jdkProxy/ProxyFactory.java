package single.mei.type5_Proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author wxy
 * @date: 2023/5/16 1:42 AM
 * @ClassName: ProxyFactory
 */
public class ProxyFactory {
    public static Object getProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new EmailProxyByJDK(obj));
    }
}
