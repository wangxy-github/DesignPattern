package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:33 PM
 * @ClassName: ToyDuck
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}
