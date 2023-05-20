package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:25 PM
 * @ClassName: Coffee
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
