package single.wxy.typeX7_mediator;

/**
 * @author wxy
 * @date: 2023/5/21 4:39 PM
 * @ClassName: CoffeeMachine
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void staterCoffee() {
        System.out.println("It's time to staterCoffee!");
    }

    public void finishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
