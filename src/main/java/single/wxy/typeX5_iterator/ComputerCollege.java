package single.wxy.typeX5_iterator;

import java.util.Iterator;

/**
 * @author wxy
 * @date: 2023/5/21 2:47 PM
 * @ClassName: ComputerCollege
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0 ;// 保存当前数组的对象个数


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java", "Java");
        addDepartment("C++", "C++");
        addDepartment("Go", "Go");
    }

    @Override
    public String getName() {
        return "ComputerCollege";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
