package single.mei.typeX8_Visitor;

/**
 * @author wxy
 * @date: 2023/5/17 12:08 AM
 * @ClassName: Visitor
 */
public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(PPTFile pptFile);

    void visit(WordFile wordFile);
}
