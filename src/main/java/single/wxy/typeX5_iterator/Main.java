package single.wxy.typeX5_iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/21 2:45 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
