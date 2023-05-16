package single.wxy.mei;

import org.junit.jupiter.api.Test;
import single.mei.typeX2_Observer.ConcreteObserverOne;
import single.mei.typeX2_Observer.ConcreteObserverTwo;
import single.mei.typeX2_Observer.ConcreteSubject;

/**
 * @author wxy
 * @date: 2023/5/16 8:06 PM
 * @ClassName: TX2Observer
 */
public class TX2ObserverTest {

    @Test
    void test1() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers("test");
    }
}
