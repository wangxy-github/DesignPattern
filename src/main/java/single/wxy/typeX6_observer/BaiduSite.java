package single.wxy.typeX6_observer;

/**
 * @author wxy
 * @date: 2023/5/21 3:47 PM
 * @ClassName: BaiduSite
 */
public class BaiduSite implements Observer {

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
        System.out.println("===百度网站====");
        System.out.println("***百度网站气温: " + temperature + "***");
        System.out.println("***百度网站气压: " + pressure + "***");
        System.out.println("***百度网站湿度: " + humidity + "***");
    }
}
