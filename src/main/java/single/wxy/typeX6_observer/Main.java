package single.wxy.typeX6_observer;

/**
 * @author wxy
 * @date: 2023/5/21 3:46 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        //测试
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);

        weatherData.removeObserver(currentConditions);

        //测试
        System.out.println();
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(15f, 80f, 20.2f);
    }
}
