package single.mei.typeX5_ChainOfResponsibility.Array;

/**
 * @author wxy
 * @date: 2023/5/16 10:07 PM
 * @ClassName: FilterA
 */
public class FilterA implements IHandler{
    @Override
    public boolean handle() {
        System.out.println("FilterA ...");
        // ...
        return false;
    }
}
