package single.wxy.type2_factory.factoryfunction;

/**
 * @author wxy
 * @date: 2023/5/19 11:44 PM
 * @ClassName: BJCheesePizza
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("BJCheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("BJCheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("BJCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("BJCheesePizza box");
    }
}
