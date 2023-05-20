package single.wxy.type9_facade;

/**
 * @author wxy
 * @date: 2023/5/20 9:29 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
    }
}
