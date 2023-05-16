package single.mei.typeX5_ChainOfResponsibility.Linked;

/**
 * @author wxy
 * @date: 2023/5/16 10:16 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new FilterA());
        chain.addHandler(new FilterB());
        chain.hanlde();
    }
}
