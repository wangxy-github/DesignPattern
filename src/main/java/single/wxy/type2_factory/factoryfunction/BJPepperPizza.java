package single.wxy.type2_factory.factoryfunction;

/**
 * @author wxy
 * @date: 2023/5/19 11:44 PM
 * @ClassName: BJCheesePizza
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("BJPepperPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("BJPepperPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("BJPepperPizza cut");
    }

    @Override
    public void box() {
        System.out.println("BJPepperPizza box");
    }
}
