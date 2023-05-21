package single.wxy.typeX6_observer;

import java.util.ArrayList;

/**
 * @author wxy
 * @date: 2023/5/21 3:49 PM
 * @ClassName: WeatherData
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;

    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;


    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void dataChange() {
        //调用接入方的update
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息推送给接入方currentConditions
        dataChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
