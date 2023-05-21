package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:37 PM
 * @ClassName: CanQuackBehavior
 */
public class CanQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("可以嘎嘎叫");
    }
}
