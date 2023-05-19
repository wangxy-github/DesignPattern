package single.wxy.type2_factory.factoryfunction;

/**
 * @author wxy
 * @date: 2023/5/19 11:44 PM
 * @ClassName: BJCheesePizza
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("LDCheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("LDCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("LDCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("LDCheesePizza box");
    }
}
