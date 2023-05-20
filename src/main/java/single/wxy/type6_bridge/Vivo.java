package single.wxy.type6_bridge;

/**
 * @author wxy
 * @date: 2023/5/20 4:56 PM
 * @ClassName: Vivo
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo open ...");
    }

    @Override
    public void close() {
        System.out.println("Vivo close ...");
    }

    @Override
    public void call() {
        System.out.println("Vivo call ...");
    }
}
