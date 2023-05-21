package single.wxy.typeXX0_state;

/**
 * @author wxy
 * @date: 2023/5/21 7:55 PM
 * @ClassName: State
 */
public abstract class State {

    // 扣除积分- 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract void dispensePrize();
}
