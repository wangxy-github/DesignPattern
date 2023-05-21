package single.wxy.typeX9_interpreter;

import java.util.HashMap;

/**
 * @author wxy
 * @date: 2023/5/21 6:59 PM
 * @ClassName: Expression
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
