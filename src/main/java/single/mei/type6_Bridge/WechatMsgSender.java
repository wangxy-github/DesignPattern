package single.mei.type6_Bridge;

import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/16 2:21 AM
 * @ClassName: WechatMsgSender
 */
public class WechatMsgSender implements MsgSender{

    public WechatMsgSender(List<String> wechats) {
        this.wechats = wechats;
    }

    private List<String> wechats;


    @Override
    public void send(String message) {
        // ...
    }
}
