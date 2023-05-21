package single.wxy.typeX4_visitor;

/**
 * @author wxy
 * @date: 2023/5/21 11:58 AM
 * @ClassName: Man
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
