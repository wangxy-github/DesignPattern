package single.wxy.typeX3_command;

/**
 * @author wxy
 * @date: 2023/5/21 11:33 AM
 * @ClassName: TVOffCommand
 */
public class TVOffCommand implements Command{

    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
