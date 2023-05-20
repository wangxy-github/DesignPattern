package single.wxy.typeX1_proxy.staticProxy;

/**
 * @author wxy
 * @date: 2023/5/20 11:02 PM
 * @ClassName: TeacherDaoProxy
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("teach before ... ");
        target.teach();
        System.out.println("teach after ... ");
    }
}
