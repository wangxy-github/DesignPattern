package single.wxy.typeXX0_state;

/**
 * @author wxy
 * @date: 2023/5/21 8:06 PM
 * @ClassName: Main
 */
public class Main {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();
            // 第二步抽奖
            activity.raffle();
        }
    }
}
