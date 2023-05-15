package single.mei.type5_Proxy.staticProxy;

/**
 * @author wxy
 * @date: 2023/5/16 1:39 AM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService = new SmsProxy(new SmsServiceImpl());
        smsService.send("hello world");
    }
}
