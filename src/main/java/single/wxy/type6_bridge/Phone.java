package single.wxy.type6_bridge;

/**
 * @author wxy
 * @date: 2023/5/20 4:54 PM
 * @ClassName: Phone
 */
public abstract class Phone {

    // 组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }

}
