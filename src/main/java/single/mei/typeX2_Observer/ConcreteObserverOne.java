package single.mei.typeX2_Observer;

/**
 * @author wxy
 * @date: 2023/5/16 8:05 PM
 * @ClassName: ConcreteObserverOne
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update(String message) {
        // todo: 获取信息通知，执行自己的逻辑
        System.out.println("ConcreteObserverOne is notified");
    }
}
