package single.mei.type6_Bridge;

/**
 * @author wxy
 * @date: 2023/5/16 2:23 AM
 * @ClassName: UrgencyNotification
 */
public class UrgencyNotification extends Notification{

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
