package single.wxy.type2_factory.simpleFactory;

/**
 * @author wxy
 * @date: 2023/5/19 11:22 PM
 * @ClassName: CheessPizza
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("GreekPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("GreekPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("GreekPizza cut");
    }

    @Override
    public void box() {
        System.out.println("GreekPizza box");
    }
}
