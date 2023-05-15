package single.mei.type6_Bridge;

/**
 * @author wxy
 * @date: 2023/5/16 2:24 AM
 * @ClassName: NormalNotification
 */
public class NormalNotification extends Notification{
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
