package single.wxy.typeX1_proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:09 PM
 * @ClassName: ProxyFactory
 */
public class ProxyFactory {

    public static Object getProxy(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new TeacherDaoProxy(object));
    }

}
