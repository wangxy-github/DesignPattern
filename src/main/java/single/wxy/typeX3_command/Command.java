package single.wxy.typeX3_command;

/**
 * @author wxy
 * @date: 2023/5/21 11:26 AM
 * @ClassName: Command
 */
public interface Command {
    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}
