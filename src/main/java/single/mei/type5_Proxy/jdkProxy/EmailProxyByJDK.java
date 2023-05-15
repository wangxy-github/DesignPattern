package single.mei.type5_Proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wxy
 * @date: 2023/5/16 1:40 AM
 * @ClassName: SmsProxyByJDK
 */
public class EmailProxyByJDK implements InvocationHandler {

    private final Object target;

    public EmailProxyByJDK(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method ...");
        Object result = method.invoke(target, args);
        System.out.println("after method ...");
        return result;
    }
}
