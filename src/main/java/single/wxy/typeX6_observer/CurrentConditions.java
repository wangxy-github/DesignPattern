package single.wxy.typeX6_observer;

/**
 * @author wxy
 * @date: 2023/5/21 3:48 PM
 * @ClassName: CurrentConditions
 */
public class CurrentConditions implements Observer{
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
