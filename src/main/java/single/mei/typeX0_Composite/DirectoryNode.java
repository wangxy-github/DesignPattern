package single.mei.typeX0_Composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/16 5:37 PM
 * @ClassName: DirectoryNode
 */
public class DirectoryNode extends FileSystemNode {

    private List<FileSystemNode> subNodes = new ArrayList<>();

    public DirectoryNode(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    @Override
    public long countSizeOfFiles() {
        long sizeOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeOfFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        while (i < size) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
            i++;
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
