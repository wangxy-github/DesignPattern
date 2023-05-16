package single.mei.typeX9_Memento;

import java.util.Stack;

/**
 * @author wxy
 * @date: 2023/5/17 12:45 AM
 * @ClassName: SnapshotHolder
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
