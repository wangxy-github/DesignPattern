package single.mei.typeX1_Flyweight;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxy
 * @date: 2023/5/16 7:43 PM
 * @ClassName: ChessBoard
 */
public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(2), 1, 0));
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        // ...
    }
}
