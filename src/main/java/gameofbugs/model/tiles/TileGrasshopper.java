package gameofbugs.model.tiles;

import gameofbugs.model.BoardModel;
import gameofbugs.model.Color;
import gameofbugs.model.Position;

import java.util.ArrayList;
import java.util.HashSet;

public class TileGrasshopper extends TileModel {

    public TileGrasshopper(Color color, Position position) {
        super(color, position, 3);
    }

    @Override
    public HashSet<Position> getMoveOptions(BoardModel board) {
        ArrayList<Position> neighbors = position.getNeighbors();
        HashSet<Position> moveOptions = new HashSet<>();

        for(Position next : neighbors) {
            if(board.isEmpty(next))
                continue;

            Position direction = new Position(next.getX() - position.getX(), next.getY() - position.getY());
            Position finalPos = next;

            // moving to first empty hex in straight line
            while(!board.isEmpty(finalPos))
                finalPos = finalPos.add(direction);

            moveOptions.add(finalPos);
        }

        return moveOptions;
    }
}