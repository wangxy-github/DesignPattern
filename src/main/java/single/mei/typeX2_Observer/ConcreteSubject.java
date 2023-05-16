package single.mei.typeX2_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/16 8:04 PM
 * @ClassName: ConcreteSubject
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
