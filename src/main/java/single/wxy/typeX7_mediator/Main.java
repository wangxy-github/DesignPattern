package single.wxy.typeX7_mediator;

/**
 * @author wxy
 * @date: 2023/5/21 4:29 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine 对象，并且加入到ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建Curtains , 并且加入到ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tV = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
