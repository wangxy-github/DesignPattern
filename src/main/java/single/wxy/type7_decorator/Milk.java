package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:31 PM
 * @ClassName: Milk
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(1.5f);
    }
}
