package single.wxy.typeX1_proxy.jdkProxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:10 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        ITeacherDao teacherDao = (ITeacherDao) ProxyFactory.getProxy(new TeacherDaoImpl());
        teacherDao.teach();
    }
}
