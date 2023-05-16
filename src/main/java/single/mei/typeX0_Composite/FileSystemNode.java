package single.mei.typeX0_Composite;

/**
 * @author wxy
 * @date: 2023/5/16 5:34 PM
 * @ClassName: FileSystemNode
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
