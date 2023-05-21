package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:33 PM
 * @ClassName: PekingDuck
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new CanQuackBehavior();
        // 默认可以游泳
    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }

}
