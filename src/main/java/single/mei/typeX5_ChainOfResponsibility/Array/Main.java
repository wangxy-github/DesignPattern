package single.mei.typeX5_ChainOfResponsibility.Array;

/**
 * @author wxy
 * @date: 2023/5/16 10:10 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addHandler(new FilterA());
        filterChain.addHandler(new FilterB());
        filterChain.handle();
    }
}
