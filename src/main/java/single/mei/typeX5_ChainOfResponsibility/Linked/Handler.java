package single.mei.typeX5_ChainOfResponsibility.Linked;

/**
 * @author wxy
 * @date: 2023/5/16 10:12 PM
 * @ClassName: Handler
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler handler) {
        successor = handler;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
