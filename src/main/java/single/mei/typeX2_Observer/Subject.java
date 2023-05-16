package single.mei.typeX2_Observer;

/**
 * @author wxy
 * @date: 2023/5/16 8:02 PM
 * @ClassName: Subject
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
