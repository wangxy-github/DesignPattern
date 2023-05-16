package single.mei.typeX0_Composite;

import java.io.File;

/**
 * @author wxy
 * @date: 2023/5/16 5:35 PM
 * @ClassName: FileNode
 */
public class FileNode extends FileSystemNode{

    public FileNode(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        File file = new File(path);
        if (!file.exists()) return 0;
        return file.length();
    }
}
