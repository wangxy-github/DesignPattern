package single.wxy.typeX0_flyweight;

/**
 * @author wxy
 * @date: 2023/5/20 10:37 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("smith"));

        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use(new User("king"));
        System.out.println("网站的分类共=" + factory.getWebSiteCount());
    }
}
