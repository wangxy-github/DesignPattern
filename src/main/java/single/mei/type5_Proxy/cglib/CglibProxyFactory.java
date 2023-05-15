package single.mei.type5_Proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author wxy
 * @date: 2023/5/16 1:59 AM
 * @ClassName: CglibProxyFactory
 */
public class CglibProxyFactory {

    public static Object getProxy(Object object) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(object.getClass().getClassLoader());
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(new PhoneProxyByCGLIB());
        return enhancer.create();
    }

}
