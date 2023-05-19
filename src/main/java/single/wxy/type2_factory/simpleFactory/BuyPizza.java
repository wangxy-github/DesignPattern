package single.wxy.type2_factory.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wxy
 * @date: 2023/5/19 11:26 PM
 * @ClassName: BuyPizza
 */
public class BuyPizza {

    PizzaFactory pizzaFactory;
    Pizza pizza = null;

    public BuyPizza() {
        setPizzaFactory();
    }

    public void setPizzaFactory() {
        String pizzaType = ""; //用户输入的
        pizzaType = getType();

        pizza = PizzaFactory.createPizza(pizzaType);

        if(pizza != null) { //订购成功
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println(" 订购披萨失败");
        }
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
