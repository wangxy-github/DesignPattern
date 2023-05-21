package single.wxy.typeX4_visitor;

/**
 * @author wxy
 * @date: 2023/5/21 11:58 AM
 * @ClassName: Woman
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
