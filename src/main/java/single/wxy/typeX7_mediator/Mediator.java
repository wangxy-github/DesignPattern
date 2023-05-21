package single.wxy.typeX7_mediator;

/**
 * @author wxy
 * @date: 2023/5/21 4:18 PM
 * @ClassName: Mediator
 */
public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();

}
