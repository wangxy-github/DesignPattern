package single.mei.typeX8_Visitor;

/**
 * @author wxy
 * @date: 2023/5/17 12:09 AM
 * @ClassName: PdfFile
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
