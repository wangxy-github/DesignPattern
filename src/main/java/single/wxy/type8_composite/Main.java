package single.wxy.type8_composite;

/**
 * @author wxy
 * @date: 2023/5/20 8:04 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", " 中国顶级大学");

        OrganizationComponent computerCollege = new College("计算机学院", " 计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", " 信息工程学院");

        computerCollege.add(new Department("软件工程", " 软件工程不错"));
        computerCollege.add(new Department("网络工程", " 网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业"));

        infoEngineerCollege.add(new Department("通信工程", " 通信工程不好学"));
        infoEngineerCollege.add(new Department("信息工程", " 信息工程好学"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();
        System.out.println();

        infoEngineerCollege.print();
    }
}
