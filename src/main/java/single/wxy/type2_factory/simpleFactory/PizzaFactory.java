package single.wxy.type2_factory.simpleFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:23 PM
 * @ClassName: PizzaFactory
 */
public class PizzaFactory {
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheessPizza();
            pizza.setName(" 奶酪披萨");
        }
        return pizza;
    }
}
