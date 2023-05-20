package single.wxy.type8_composite;

/**
 * @author wxy
 * @date: 2023/5/20 8:05 PM
 * @ClassName: Department
 */
public class Department extends OrganizationComponent{

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    // add , remove 就不用写了，因为他是叶子节点

    @Override
    protected void print() {
        System.out.println(getName());
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
