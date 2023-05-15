package single.mei.type5_Proxy.cglib;

/**
 * @author wxy
 * @date: 2023/5/16 2:01 AM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        PhoneAdvice phoneAdvice = (PhoneAdvice) CglibProxyFactory.getProxy(new PhoneAdvice());
        phoneAdvice.send("hello cglib proxy");
    }
}
