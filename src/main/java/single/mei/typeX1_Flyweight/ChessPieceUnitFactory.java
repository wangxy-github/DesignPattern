package single.mei.typeX1_Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxy
 * @date: 2023/5/16 7:39 PM
 * @ClassName: ChessPieceUnitFactory
 */
public class ChessPieceUnitFactory {

    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<>();

    static {
        pieces.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.RED));

        // ...
    }

    public static ChessPieceUnit getChessPiece (int chessPieceId) {
        return pieces.get(chessPieceId);
    }

}
