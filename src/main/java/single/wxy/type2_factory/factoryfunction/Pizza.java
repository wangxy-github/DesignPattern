package single.wxy.type2_factory.factoryfunction;

/**
 * @author wxy
 * @date: 2023/5/19 11:20 PM
 * @ClassName: Pizza
 */
public abstract class Pizza {
    String name;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public void setName(String name) {
        this.name = name;
    }
}
