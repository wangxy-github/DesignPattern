package single.wxy.typeX1_proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author wxy
 * @date: 2023/5/20 11:16 PM
 * @ClassName: ProxyFactory
 */
public class ProxyFactory {
    public static Object getProxy(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new TeacherDaoProxy());
        return enhancer.create();
    }

}
