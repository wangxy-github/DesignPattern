package single.wxy.typeX5_iterator;

import java.util.Iterator;

/**
 * @author wxy
 * @date: 2023/5/21 2:50 PM
 * @ClassName: ComputerCollegeIterator
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position++];
        return department;
    }
}
