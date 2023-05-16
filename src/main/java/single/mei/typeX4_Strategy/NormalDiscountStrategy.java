package single.mei.typeX4_Strategy;

/**
 * @author wxy
 * @date: 2023/5/16 8:52 PM
 * @ClassName: NormalDiscountStrategy
 */
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Goods goods) {
        return goods.getPrice() * 0.9;
    }
}
