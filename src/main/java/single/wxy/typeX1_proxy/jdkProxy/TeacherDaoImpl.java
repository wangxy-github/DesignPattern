package single.wxy.typeX1_proxy.jdkProxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:05 PM
 * @ClassName: TeacherDaoImpl
 */
public class TeacherDaoImpl implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("Teacher teaching ...");
    }
}
