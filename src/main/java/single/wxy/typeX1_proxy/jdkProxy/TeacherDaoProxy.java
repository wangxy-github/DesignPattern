package single.wxy.typeX1_proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wxy
 * @date: 2023/5/20 11:06 PM
 * @ClassName: TeacherDaoProxy
 */
public class TeacherDaoProxy implements InvocationHandler {

    private Object target;

    public TeacherDaoProxy(Object obj) {
        this.target = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdkProxy : teach before ... ");
        Object result = method.invoke(target, args);
        System.out.println("jdkProxy : teach after ... ");
        return result;
    }
}
