package single.mei.type1_Single;

/**
 * @author wxy
 * @date: 2023/5/15 11:16 PM
 * @ClassName: NeiBuLei
 */
public class NeiBuLei {
    private static class SingletonHolder {
        private static final NeiBuLei instance = new NeiBuLei();
    }

    public static NeiBuLei getInstance() {
        return SingletonHolder.instance;
    }
}
