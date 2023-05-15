package single.mei.type1_Single;

/**
 * @author wxy
 * @date: 2023/5/15 11:12 PM
 * @ClassName: LanHanShiTwo
 */
public class LanHanShiTwo {
    private static volatile LanHanShiTwo instance;

    private LanHanShiTwo() {}

    public static LanHanShiTwo getInstance() {
        if (instance == null) {
            synchronized (LanHanShiTwo.class) {
                if (instance == null) {
                    instance = new LanHanShiTwo();
                }
            }
        }
        return instance;
    }
}
