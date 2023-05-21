package single.wxy.typeX3_command;

/**
 * @author wxy
 * @date: 2023/5/21 11:30 AM
 * @ClassName: LightOnCommand
 */
public class LightOnCommand implements Command {

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
