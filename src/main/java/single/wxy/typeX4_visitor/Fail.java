package single.wxy.typeX4_visitor;

/**
 * @author wxy
 * @date: 2023/5/21 11:55 AM
 * @ClassName: Fail
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手失败!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手失败!");
    }

}
