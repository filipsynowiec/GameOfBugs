import java.util.HashSet;

public class TileAnt extends TileModel {

    public TileAnt(Color color, Position position) {
        super(color, position, 3);
    }

    @Override
    public HashSet<Position> getMoveOptions(BoardModel board) {
        return null;
    }
}
