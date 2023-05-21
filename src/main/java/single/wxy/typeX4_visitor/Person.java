package single.wxy.typeX4_visitor;

/**
 * @author wxy
 * @date: 2023/5/21 11:56 AM
 * @ClassName: Person
 */
public abstract class Person {
    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
