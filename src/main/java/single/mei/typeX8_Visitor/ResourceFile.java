package single.mei.typeX8_Visitor;

/**
 * @author wxy
 * @date: 2023/5/17 12:07 AM
 * @ClassName: ResourceFile
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);
}
