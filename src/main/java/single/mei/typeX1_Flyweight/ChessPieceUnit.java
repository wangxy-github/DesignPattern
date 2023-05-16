package single.mei.typeX1_Flyweight;

/**
 * @author wxy
 * @date: 2023/5/16 7:37 PM
 * @ClassName: ChessPieceUnit
 */
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK;
    }
}
