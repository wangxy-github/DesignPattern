package single.wxy.type6_bridge;

/**
 * @author wxy
 * @date: 2023/5/20 4:57 PM
 * @ClassName: XiaoMi
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi open ...");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi close ...");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi call ...");
    }
}
