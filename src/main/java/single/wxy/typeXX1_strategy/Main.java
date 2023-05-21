package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:32 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.quack();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.swim();
        toyDuck.quack();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.swim();
        pekingDuck.quack();

        pekingDuck.setFlyBehavior(new GoodFlyBehavior());
        pekingDuck.fly();
    }
}
