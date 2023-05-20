package single.wxy.type9_facade;

/**
 * @author wxy
 * @date: 2023/5/20 9:27 PM
 * @ClassName: Stereo
 */
public class Stereo {

    private static Stereo instance = new Stereo();
    public static Stereo getInstance() {
        return instance;
    }
    public void on() {
        System.out.println(" Stereo on ");
    }
    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }

}
