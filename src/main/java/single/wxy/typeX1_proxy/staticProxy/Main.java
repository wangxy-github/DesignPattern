package single.wxy.typeX1_proxy.staticProxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:00 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoProxy(new TeacherDaoImpl());
        teacherDao.teach();
    }
}
