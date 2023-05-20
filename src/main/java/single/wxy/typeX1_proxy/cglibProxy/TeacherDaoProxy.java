package single.wxy.typeX1_proxy.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wxy
 * @date: 2023/5/20 11:13 PM
 * @ClassName: TeacherDaoProxy
 */
public class TeacherDaoProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglibProxy : teach before ... ");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cglibProxy : teach after ... ");
        return result;
    }
}
