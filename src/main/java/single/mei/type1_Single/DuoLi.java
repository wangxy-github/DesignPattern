package single.mei.type1_Single;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author wxy
 * @date: 2023/5/15 11:43 PM
 * @ClassName: DuoLi
 */
public class DuoLi {
    private long no;
    private String name;

    private static final int COUNT = 3;
    private static final Map<Long, DuoLi> duoLiInstances = new HashMap<>();

    static {
        duoLiInstances.put(1L, new DuoLi(1L, "no1"));
        duoLiInstances.put(2L, new DuoLi(2L, "no2"));
        duoLiInstances.put(3L, new DuoLi(3L, "no3"));
    }

    private DuoLi(long no, String name) {
        this.no = no;
        this.name = name;
    }

    public static DuoLi getInstance(long no) {
        return duoLiInstances.get(no);
    }

    public static DuoLi getRandomInstance() {
        Random random = new Random();
        long no = (long) random.nextInt(COUNT) + 1;
        return duoLiInstances.get(no);
    }
}
