package single.wxy.type6_bridge;

/**
 * @author wxy
 * @date: 2023/5/20 4:53 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        Phone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();

        Phone phone3 = new FoldedPhone(new Vivo());
        phone3.open();
        phone3.call();
        phone3.close();

        Phone phone4 = new UpRightPhone(new Vivo());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
