package single.wxy.typeX8_memento.theory;

/**
 * @author wxy
 * @date: 2023/5/21 5:07 PM
 * @ClassName: Memento
 */
public class Memento {
    private String state;

    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
