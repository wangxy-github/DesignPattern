package single.wxy.typeX3_command;

/**
 * @author wxy
 * @date: 2023/5/21 11:26 AM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下灯的关按钮-----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();

        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--------按下电视机的开按钮-----------");
        remoteController.onButtonWasPushed(1);
        System.out.println("--------按下电视机的关按钮-----------");
        remoteController.offButtonWasPushed(1);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();
    }
}
