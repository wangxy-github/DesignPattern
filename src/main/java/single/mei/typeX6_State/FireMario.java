package single.mei.typeX6_State;

/**
 * @author wxy
 * @date: 2023/5/16 10:47 PM
 * @ClassName: SmallMario
 */
public class FireMario implements IMario{

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing ...
    }

    @Override
    public void obtainCape() {
        // do nothing ...
    }

    @Override
    public void obtainFireFlower() {
        // do nothing ...
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
