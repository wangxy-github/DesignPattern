package single.wxy.type6_bridge;

/**
 * @author wxy
 * @date: 2023/5/20 4:56 PM
 * @ClassName: UpRightPhone
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }


    public void open() {
        super.open();
        System.out.println(" 直立样式手机");
    }
    public void close() {
        super.close();
        System.out.println(" 直立样式手机");
    }
    public void call() {
        super.call();
        System.out.println(" 直立样式手机");
    }
}
