package single.wxy.type5_adapter;

/**
 * @author wxy
 * @date: 2023/5/20 4:01 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
