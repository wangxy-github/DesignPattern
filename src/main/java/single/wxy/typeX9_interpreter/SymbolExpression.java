package single.wxy.typeX9_interpreter;

import java.util.HashMap;

/**
 * @author wxy
 * @date: 2023/5/21 6:59 PM
 * @ClassName: SymbolExpression
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为SymbolExpression 是让其子类来实现，因此interpreter 是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
