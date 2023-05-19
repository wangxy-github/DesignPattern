package single.wxy.type1_singleton;

/**
 * @author wxy
 * @date: 2023/5/19 10:49 PM
 * @ClassName: NeiBuLei
 */
public class NeiBuLei {
    private static volatile NeiBuLei instance;

    private static class NeiBuLeiInstance {
        private static final NeiBuLei INSTANCE = new NeiBuLei();
    }

    public static synchronized NeiBuLei getInstance() {
        return NeiBuLeiInstance.INSTANCE;
    }
}
