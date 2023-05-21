package single.wxy.typeX9_interpreter;

import java.util.HashMap;

/**
 * @author wxy
 * @date: 2023/5/21 7:03 PM
 * @ClassName: SubExpression
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和right 表达式相减后的结果
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }

}
