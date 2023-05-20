package single.wxy.type4_builder;

/**
 * @author wxy
 * @date: 2023/5/20 2:50 PM
 * @ClassName: CommonHouse
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("CommonHouse buildBasic ...");
        house.setBasic("CommonHouse.basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse buildWalls ...");
        house.setWall("CommonHouse.wall");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse roofed ...");
        house.setRoofed("CommonHouse.roofed");
    }
}
