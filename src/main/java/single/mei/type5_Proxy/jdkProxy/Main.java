package single.mei.type5_Proxy.jdkProxy;

import single.mei.type5_Proxy.staticProxy.SmsService;
import single.mei.type5_Proxy.staticProxy.SmsServiceImpl;

/**
 * @author wxy
 * @date: 2023/5/16 1:44 AM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        EmailService emailService = (EmailService) ProxyFactory.getProxy(new EmailServiceImpl());
        emailService.send("hello proxy");
    }
}
