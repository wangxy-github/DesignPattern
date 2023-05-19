package single.wxy.type1_singleton;

/**
 * @author wxy
 * @date: 2023/5/19 10:47 PM
 * @ClassName: ShuangJian
 */
public class ShuangJian {
    private static volatile ShuangJian instance;

    public static ShuangJian getInstance() {
        if (instance == null) {
            synchronized (ShuangJian.class) {
                if (instance == null) {
                    instance = new ShuangJian();
                }
            }
        }
        return instance;
    }
}
