package single.wxy.type5_adapter;

/**
 * @author wxy
 * @date: 2023/5/20 4:03 PM
 * @ClassName: VoltageAdapter
 */
public class VoltageAdapter implements IVoltage5V{

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV / 44 ; //转成5v
        return dstV;
    }
}
