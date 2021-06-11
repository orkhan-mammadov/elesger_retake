package com.orkhanmammadov.game.board;

public class LTetromino extends Tetromino{

    public LTetromino(Point point, Color color){
            super(new ColoredPoint[]{new ColoredPoint(color, new Point(0, 2)),
                    new ColoredPoint(color, new Point(0, 1)),
                    new ColoredPoint(color, new Point(0, 0)),
                    new ColoredPoint(color, new Point(1, 0))});

    }
    public LTetromino(ColoredPoint[] points) {
        super(points);
    }

    @Override
    public boolean allowsRotate() {
        return true;
    }
}
