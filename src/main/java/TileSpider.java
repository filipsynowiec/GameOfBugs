import java.util.HashSet;

public class TileSpider extends TileModel {

    public TileSpider(Color color, Position position) {
        super(color, position, 2);
    }

    @Override
    public HashSet<Position> getMoveOptions(BoardModel board) {
        return null;
    }
}
