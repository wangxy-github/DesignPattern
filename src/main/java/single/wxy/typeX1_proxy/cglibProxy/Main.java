package single.wxy.typeX1_proxy.cglibProxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:12 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        TeacherDaoImpl teacherDao = (TeacherDaoImpl) ProxyFactory.getProxy((new TeacherDaoImpl()).getClass());
        teacherDao.teach();
    }
}
