package single.wxy.typeX4_visitor;

/**
 * @author wxy
 * @date: 2023/5/21 11:54 AM
 * @ClassName: Action
 */
public abstract class Action{
    //得到男性的测评
    public abstract void getManResult(Man man);

    //得到女的测评
    public abstract void getWomanResult(Woman woman);
}
