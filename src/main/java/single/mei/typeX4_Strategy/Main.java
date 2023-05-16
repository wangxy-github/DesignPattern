package single.mei.typeX4_Strategy;

/**
 * @author wxy
 * @date: 2023/5/16 8:56 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        String typeStr = "normal";
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(typeStr);
        double newPrice = discountStrategy.calDiscount(new Goods("xx", 100));
        System.out.println(newPrice);
    }
}
