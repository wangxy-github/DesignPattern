package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:32 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("Coffee : " + order.getDes() + "   " + "total_cost = " + order.cost());

        order = new Chocolate(order);
        System.out.println("Coffee : " + order.getDes() + "   " + "total_cost = " + order.cost());

        order = new Chocolate(order);
        System.out.println("Coffee : " + order.getDes() + "   " + "total_cost = " + order.cost());

        order = new Milk(order);
        System.out.println("Coffee : " + order.getDes() + "   " + "total_cost = " + order.cost());

        Drink order2 = new Deaf();
        System.out.println("Coffee : " + order2.getDes() + "   " + "total_cost = " + order2.cost());

        order2 = new Soy(order2);
        System.out.println("Coffee : " + order2.getDes() + "   " + "total_cost = " + order2.cost());
    }
}
