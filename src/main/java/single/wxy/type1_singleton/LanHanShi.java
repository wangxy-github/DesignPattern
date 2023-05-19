package single.wxy.type1_singleton;

/**
 * @author wxy
 * @date: 2023/5/19 10:44 PM
 * @ClassName: LanHanShi
 */
public class LanHanShi {
    private static LanHanShi instance;

    public static LanHanShi getInstance() {
        if (instance == null) {
            synchronized (LanHanShi.class) {
                instance = new LanHanShi();
            }
        }
        return instance;
    }
}
