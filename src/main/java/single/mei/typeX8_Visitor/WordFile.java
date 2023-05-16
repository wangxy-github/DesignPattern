package single.mei.typeX8_Visitor;

/**
 * @author wxy
 * @date: 2023/5/17 12:10 AM
 * @ClassName: PPTFile
 */
public class WordFile extends ResourceFile{
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
