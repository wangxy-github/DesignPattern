package single.wxy.type2_factory.abstractFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:58 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new BJPizzaFactory());
    }
}
