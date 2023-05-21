package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:36 PM
 * @ClassName: NoQuackBehavior
 */
public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
