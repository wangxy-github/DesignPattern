package single.mei.typeX8_Visitor;

/**
 * @author wxy
 * @date: 2023/5/17 12:12 AM
 * @ClassName: Compressor
 */
public class Compressor implements Visitor{
    @Override
    public void visit(PdfFile pdfFile) {
        // ...
        System.out.println("Compressor PDF ...");
    }

    @Override
    public void visit(PPTFile pptFile) {
        // ...
        System.out.println("Compressor PPT ...");
    }

    @Override
    public void visit(WordFile wordFile) {
        // ...
        System.out.println("Compressor Word ...");
    }
}
