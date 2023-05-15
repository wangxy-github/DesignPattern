package single.mei.type6_Bridge;

/**
 * @author wxy
 * @date: 2023/5/16 2:22 AM
 * @ClassName: Notification
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
