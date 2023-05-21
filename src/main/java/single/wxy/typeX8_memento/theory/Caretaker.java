package single.wxy.typeX8_memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/21 5:08 PM
 * @ClassName: Caretaker
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取到第index 个Originator 的备忘录对象(即保存状态)
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
