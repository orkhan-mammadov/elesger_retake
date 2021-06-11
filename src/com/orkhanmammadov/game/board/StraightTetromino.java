package com.orkhanmammadov.game.board;

public class StraightTetromino extends Tetromino{

    public StraightTetromino(Point point, Color color) {
        super(new ColoredPoint[]{new ColoredPoint(color, new Point(0, 0)),
                new ColoredPoint(color, new Point(0, 1)),
                new ColoredPoint(color, new Point(0, 2)),
                new ColoredPoint(color, new Point(0, 3))});
    }

    public StraightTetromino(ColoredPoint[] points) {
        super(points);
    }

    @Override
    public boolean allowsRotate() {
        return true;
    }
}
