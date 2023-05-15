package single.mei.type6_Bridge;

import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/16 2:20 AM
 * @ClassName: EmailMsgSender
 */
public class EmailMsgSender implements MsgSender{

    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        // ...
    }
}
