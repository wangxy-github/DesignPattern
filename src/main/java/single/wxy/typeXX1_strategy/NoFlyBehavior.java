package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:31 PM
 * @ClassName: NoFlyBehavior
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 不会飞翔");
    }
}
