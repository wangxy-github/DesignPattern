package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:34 PM
 * @ClassName: WildDuck
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new CanQuackBehavior();
        // 默认可以游泳
    }

    @Override
    public void display() {
        System.out.println(" 这是野鸭");
    }
}
