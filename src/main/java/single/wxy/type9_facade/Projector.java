package single.wxy.type9_facade;

/**
 * @author wxy
 * @date: 2023/5/20 9:26 PM
 * @ClassName: Projector
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector ");
    }
}
