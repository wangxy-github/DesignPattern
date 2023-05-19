package single.wxy.type2_factory.factoryfunction;

/**
 * @author wxy
 * @date: 2023/5/19 11:47 PM
 * @ClassName: BJOrderPizza
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
