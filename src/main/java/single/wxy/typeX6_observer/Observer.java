package single.wxy.typeX6_observer;

/**
 * @author wxy
 * @date: 2023/5/21 3:45 PM
 * @ClassName: Observer
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
