package single.mei.type6_Bridge;

import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/16 2:19 AM
 * @ClassName: TelephoneMsgSender
 */
public class TelephoneMsgSender implements MsgSender{

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        // ...
    }
}
