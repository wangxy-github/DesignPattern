package single.mei.type5_Proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wxy
 * @date: 2023/5/16 1:56 AM
 * @ClassName: PhoneProxyByCGLIB
 */
public class PhoneProxyByCGLIB implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method cglib ...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after method cglib ...");
        return result;
    }
}
