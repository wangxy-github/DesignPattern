package single.wxy.type4_prototype;

/**
 * @author wxy
 * @date: 2023/5/20 2:48 PM
 * @ClassName: House
 */
public class House {

    private String basic;
    private String wall;
    private String roofed;

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
