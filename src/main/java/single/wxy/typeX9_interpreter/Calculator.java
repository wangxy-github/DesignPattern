package single.wxy.typeX9_interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author wxy
 * @date: 2023/5/21 7:02 PM
 * @ClassName: Calculator
 */
public class Calculator {

    // 定义表达式
    private Expression expression;

    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();// [a, +, b]

        Expression left = null;
        Expression right = null;

        //遍历我们的字符数组， 即遍历[a, +, b]
        //针对不同的情况，做处理

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }

        this.expression = stack.pop();
    }


    public int run(HashMap<String, Integer> var) {
        //最后将表达式a+b 和var = {a=10,b=20}
        //然后传递给expression 的interpreter 进行解释执行
        return this.expression.interpreter(var);
    }
}
