package single.wxy.typeX5_iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/21 2:52 PM
 * @ClassName: InfoColleageIterator
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList; // 信息工程学院是以List 方式存放系
    int index = -1;//索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
