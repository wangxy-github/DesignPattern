package single.mei.type5_Proxy.cglib;

/**
 * @author wxy
 * @date: 2023/5/16 1:54 AM
 * @ClassName: PhoneService
 */
public class PhoneAdvice {

    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
