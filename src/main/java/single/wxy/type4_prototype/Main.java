package single.wxy.type4_prototype;

/**
 * @author wxy
 * @date: 2023/5/20 2:51 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouse();
        HouseDirector director = new HouseDirector(houseBuilder);
        House commonHouse = director.constructHouse();
        System.out.println(commonHouse);

        houseBuilder = new HighBuilding();
        director = new HouseDirector(houseBuilder);
        House highHouse = director.constructHouse();
        System.out.println(highHouse);
    }
}
