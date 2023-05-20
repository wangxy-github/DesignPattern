package single.wxy.type5_adapter;

/**
 * @author wxy
 * @date: 2023/5/20 4:02 PM
 * @ClassName: Voltage220V
 */
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
