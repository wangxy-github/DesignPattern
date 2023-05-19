package single.wxy.type2_factory.abstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wxy
 * @date: 2023/5/19 11:57 PM
 * @ClassName: OrderPizza
 */
public class OrderPizza {
    AbstractPizzaFactory abstractPizzaFactory;

    public OrderPizza(AbstractPizzaFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbstractPizzaFactory factory) {
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        this.abstractPizzaFactory = factory;
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }


    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
