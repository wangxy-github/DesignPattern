package single.wxy.typeX9_interpreter;

import java.util.HashMap;

/**
 * @author wxy
 * @date: 2023/5/21 6:59 PM
 * @ClassName: VarExpression
 */
public class VarExpression extends Expression {
    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
