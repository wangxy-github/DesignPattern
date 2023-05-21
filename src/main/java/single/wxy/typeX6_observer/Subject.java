package single.wxy.typeX6_observer;

/**
 * @author wxy
 * @date: 2023/5/21 3:46 PM
 * @ClassName: Subject
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

