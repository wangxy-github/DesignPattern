package single.wxy.type2_factory.factoryfunction;

/**
 * @author wxy
 * @date: 2023/5/19 11:47 PM
 * @ClassName: BJOrderPizza
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
