package single.wxy.typeX7_mediator;

/**
 * @author wxy
 * @date: 2023/5/21 4:18 PM
 * @ClassName: Colleague
 */
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);

}
