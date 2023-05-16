package single.mei.typeX4_Strategy;

/**
 * @author wxy
 * @date: 2023/5/16 8:53 PM
 * @ClassName: VipDiscountStrategy
 */
public class SVipDiscountStrategy implements DiscountStrategy{
    @Override
    public double calDiscount(Goods goods) {
        return goods.getPrice() * 0.7;
    }
}
