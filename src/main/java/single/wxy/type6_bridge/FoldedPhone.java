package single.wxy.type6_bridge;

/**
 * @author wxy
 * @date: 2023/5/20 4:55 PM
 * @ClassName: FoldedPhone
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 折叠样式手机");
    }
    public void close() {
        super.close();
        System.out.println(" 折叠样式手机");
    }
    public void call() {
        super.call();
        System.out.println(" 折叠样式手机");
    }
}
