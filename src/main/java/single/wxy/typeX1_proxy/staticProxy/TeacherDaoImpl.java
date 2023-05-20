package single.wxy.typeX1_proxy.staticProxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:01 PM
 * @ClassName: TeacherDaoImpl
 */
public class TeacherDaoImpl implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("Teacher teaching student ...");
    }
}
