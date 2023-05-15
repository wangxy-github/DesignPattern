package single.mei.type5_Proxy.staticProxy;

/**
 * @author wxy
 * @date: 2023/5/16 1:37 AM
 * @ClassName: SmsProxy
 */
public class SmsProxy implements SmsService{

    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("before method ...");
        smsService.send(message);
        System.out.println("after method ...");
        return null;
    }
}
