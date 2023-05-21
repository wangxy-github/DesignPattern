package single.wxy.typeXX1_strategy;

/**
 * @author wxy
 * @date: 2023/5/21 8:28 PM
 * @ClassName: Duck
 */
public abstract class Duck {

    //属性, 策略接口
    FlyBehavior flyBehavior;
    //其它属性<->策略接口
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();//显示鸭子信息

    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly() {
        //改进
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
