package single.mei.typeX5_ChainOfResponsibility.Linked;

/**
 * @author wxy
 * @date: 2023/5/16 10:14 PM
 * @ClassName: HandlerChain
 */
public class HandlerChain {

    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void hanlde() {
        if (head != null) {
            head.handle();
        }
    }

}
