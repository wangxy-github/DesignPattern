package single.wxy.type4_builder;

/**
 * @author wxy
 * @date: 2023/5/20 2:50 PM
 * @ClassName: CommonHouse
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("HighBuilding buildBasic ...");
        house.setBasic("HighBuilding.basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighBuilding buildWalls ...");
        house.setWall("HighBuilding.wall");
    }

    @Override
    public void roofed() {
        System.out.println("HighBuilding roofed ...");
        house.setRoofed("HighBuilding.roofed");
    }
}
