package single.wxy.type2_factory.abstractFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:56 PM
 * @ClassName: BJPizzaFactory
 */
public class LDPizzaFactory implements AbstractPizzaFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
