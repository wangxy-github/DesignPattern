package single.wxy.type9_facade;

/**
 * @author wxy
 * @date: 2023/5/20 9:26 PM
 * @ClassName: Screen
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
