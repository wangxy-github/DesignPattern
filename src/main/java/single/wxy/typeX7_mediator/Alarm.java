package single.wxy.typeX7_mediator;

/**
 * @author wxy
 * @date: 2023/5/21 4:20 PM
 * @ClassName: Alarm
 */
public class Alarm extends Colleague{
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
}
