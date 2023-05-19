package single.wxy.type1_singleton;

/**
 * @author wxy
 * @date: 2023/5/19 10:42 PM
 * @ClassName: SingletonWithStaticEHanShi
 */
public class SingletonWithStaticEHanShi {

    private static SingletonWithStaticEHanShi instance;

    static {
        instance = new SingletonWithStaticEHanShi();
    }

    public SingletonWithStaticEHanShi() {
    }

    public static SingletonWithStaticEHanShi getInstance() {
        return instance;
    }
}
