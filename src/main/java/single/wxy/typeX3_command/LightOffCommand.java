package single.wxy.typeX3_command;

/**
 * @author wxy
 * @date: 2023/5/21 11:27 AM
 * @ClassName: LightOffCommand
 */
public class LightOffCommand implements Command {

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
