package com.orkhanmammadov.game.board;

public class SkewTetromino extends Tetromino{

    public SkewTetromino(Point point, Color color){
            super(new ColoredPoint[]{new ColoredPoint(color, new Point(0, 0)),
                    new ColoredPoint(color, new Point(1, 0)),
                    new ColoredPoint(color, new Point(1, 1)),
                    new ColoredPoint(color, new Point(2, 1))});

    }
    public SkewTetromino(ColoredPoint[] points) {
        super(points);
    }

    @Override
    public boolean allowsRotate() {
        return true;
    }
}
