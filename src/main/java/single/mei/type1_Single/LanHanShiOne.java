package single.mei.type1_Single;

/**
 * @author wxy
 * @date: 2023/5/15 11:09 PM
 * @ClassName: LanHanShiOne
 */
public class LanHanShiOne {

    private static LanHanShiOne instance;

    private LanHanShiOne() {}

    public static synchronized LanHanShiOne getInstance() {
        if (instance == null) {
            instance = new LanHanShiOne();
        }
        return instance;
    }
}
