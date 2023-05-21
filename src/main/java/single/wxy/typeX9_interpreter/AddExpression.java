package single.wxy.typeX9_interpreter;

import java.util.HashMap;

/**
 * @author wxy
 * @date: 2023/5/21 7:02 PM
 * @ClassName: AddExpression
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    //var 仍然是{a=10,b=20}..
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) ： 返回left 表达式对应的值a = 10
        //super.right.interpreter(var): 返回right 表达式对应值b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
