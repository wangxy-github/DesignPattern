package single.wxy.type4_builder;

/**
 * @author wxy
 * @date: 2023/5/20 2:48 PM
 * @ClassName: HouseBuilder
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
