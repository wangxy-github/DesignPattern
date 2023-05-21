package single.wxy.typeX4_visitor;

/**
 * @author wxy
 * @date: 2023/5/21 11:55 AM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);

        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
