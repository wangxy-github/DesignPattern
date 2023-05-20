package single.wxy.type7_decorator;

/**
 * @author wxy
 * @date: 2023/5/20 7:23 PM
 * @ClassName: Drink
 */
public abstract class Drink {

    public String des;

    private float price = 0.0f;


    public abstract float cost();


    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
