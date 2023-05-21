package single.wxy.typeX3_command;

/**
 * @author wxy
 * @date: 2023/5/21 11:33 AM
 * @ClassName: TVOffCommand
 */
public class TVOnCommand implements Command{

    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
