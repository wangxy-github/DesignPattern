package single.mei.type5_Proxy.staticProxy;

/**
 * @author wxy
 * @date: 2023/5/16 1:37 AM
 * @ClassName: SmsServiceImpl
 */
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println(message);
        return message;
    }
}
