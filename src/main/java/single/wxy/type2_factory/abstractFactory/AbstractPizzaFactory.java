package single.wxy.type2_factory.abstractFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:56 PM
 * @ClassName: AbstractPizzaFactory
 */
public interface AbstractPizzaFactory {
    public Pizza createPizza(String orderType);
}
