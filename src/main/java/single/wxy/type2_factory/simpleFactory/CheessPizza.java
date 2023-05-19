package single.wxy.type2_factory.simpleFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:22 PM
 * @ClassName: CheessPizza
 */
public class CheessPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("CheessPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheessPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheessPizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheessPizza box");
    }
}
