package single.mei.type6_Bridge;

/**
 * @author wxy
 * @date: 2023/5/16 2:22 AM
 * @ClassName: SevereNotification
 */
public class SevereNotification extends Notification{

    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
