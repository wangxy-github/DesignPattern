package single.wxy.typeX5_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/21 2:54 PM
 * @ClassName: InfoCollege
 */
public class InfoCollege implements College{
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业");
        addDepartment("网络安全专业", " 网络安全专业");
        addDepartment("服务器安全专业", " 服务器安全专业");
    }

    @Override
    public String getName() {
        return "InfoCollege";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
