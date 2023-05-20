package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:31 PM
 * @ClassName: Milk
 */
public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        setDes("Soy");
        setPrice(1.0f);
    }
}
