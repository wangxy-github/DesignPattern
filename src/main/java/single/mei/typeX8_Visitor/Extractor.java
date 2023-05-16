package single.mei.typeX8_Visitor;

/**
 * @author wxy
 * @date: 2023/5/17 12:11 AM
 * @ClassName: Extractor
 */
public class Extractor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        // ...
        System.out.println("Extractor PDF ...");
    }

    @Override
    public void visit(PPTFile pptFile) {
        // ...
        System.out.println("Extractor PPT ...");
    }

    @Override
    public void visit(WordFile wordFile) {
        // ...
        System.out.println("Extractor Word ...");
    }
}
