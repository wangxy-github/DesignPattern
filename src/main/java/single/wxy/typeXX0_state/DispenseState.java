package single.wxy.typeXX0_state;

/**
 * @author wxy
 * @date: 2023/5/21 7:59 PM
 * @ClassName: DispenseState
 */
public class DispenseState extends State {

    // 初始化时传入活动引用
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了, 正在分发奖品");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            System.out.println("已领完奖品");
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            activity.setState(activity.getDispensOutState());
        }
    }
}
