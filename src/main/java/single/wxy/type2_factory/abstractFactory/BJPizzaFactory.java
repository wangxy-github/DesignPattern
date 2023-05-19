package single.wxy.type2_factory.abstractFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:56 PM
 * @ClassName: BJPizzaFactory
 */
public class BJPizzaFactory implements AbstractPizzaFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
