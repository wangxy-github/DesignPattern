package single.mei.typeX5_ChainOfResponsibility.Linked;

import single.mei.typeX5_ChainOfResponsibility.Array.IHandler;

/**
 * @author wxy
 * @date: 2023/5/16 10:07 PM
 * @ClassName: FilterB
 */
public class FilterB extends Handler {

    @Override
    protected boolean doHandle() {
        System.out.println("FilterB Linked ...");
        return false;
    }
}
