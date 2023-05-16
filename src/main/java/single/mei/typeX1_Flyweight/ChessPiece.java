package single.mei.typeX1_Flyweight;

/**
 * @author wxy
 * @date: 2023/5/16 7:42 PM
 * @ClassName: ChessPiece
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int positionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
