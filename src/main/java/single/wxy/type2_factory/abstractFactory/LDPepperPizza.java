package single.wxy.type2_factory.abstractFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:44 PM
 * @ClassName: BJCheesePizza
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("LDPepperPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("LDPepperPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("LDPepperPizza cut");
    }

    @Override
    public void box() {
        System.out.println("LDPepperPizza box");
    }
}
