package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:28 PM
 * @ClassName: Decorator
 */
public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + "  cost=" + super.getPrice() + " && " + drink.getDes();
    }
}
