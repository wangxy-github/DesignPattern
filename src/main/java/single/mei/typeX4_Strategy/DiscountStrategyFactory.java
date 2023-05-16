package single.mei.typeX4_Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxy
 * @date: 2023/5/16 8:54 PM
 * @ClassName: DiscountStrategyFactory
 */
public class DiscountStrategyFactory {

    private static final Map<String, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put("normal", new NormalDiscountStrategy());
        strategies.put("vip", new VipDiscountStrategy());
        strategies.put("svip", new SVipDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(String typeStr) {
        return strategies.get(typeStr);
    }
}
