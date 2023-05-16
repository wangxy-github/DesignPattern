package single.mei.typeX5_ChainOfResponsibility.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/16 10:08 PM
 * @ClassName: FilterChain
 */
public class FilterChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            handler.handle();
        }
    }

}
