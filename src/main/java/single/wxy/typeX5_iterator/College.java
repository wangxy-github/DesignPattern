package single.wxy.typeX5_iterator;

import java.util.Iterator;

/**
 * @author wxy
 * @date: 2023/5/21 2:45 PM
 * @ClassName: College
 */
public interface College {
    public String getName();
    //增加系的方法
    public void addDepartment(String name, String desc);
    //返回一个迭代器,遍历
    public Iterator createIterator();
}
