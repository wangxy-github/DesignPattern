package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:30 PM
 * @ClassName: Chocolate
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate");
        setPrice(2.0f);
    }

}
