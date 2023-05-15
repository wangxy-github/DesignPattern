package single.mei.type1_Single;

/**
 * @author wxy
 * @date: 2023/5/15 11:00 PM
 * @ClassName: EHanShiOne
 * 单例模式-饿汉式
 */
public class EHanShiOne {
    private static final EHanShiOne instance = new EHanShiOne();

    private EHanShiOne() {}

    public static EHanShiOne getInstance() {
        return instance;
    }
}
