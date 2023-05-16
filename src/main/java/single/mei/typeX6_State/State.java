package single.mei.typeX6_State;

/**
 * @author wxy
 * @date: 2023/5/16 10:43 PM
 * @ClassName: State
 */
public enum State {
    SMALL(0),
    SUPER(1),
    CAPE(2),
    FIRE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
