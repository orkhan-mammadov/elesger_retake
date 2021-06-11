package com.orkhanmammadov.game.board;

public class TTetromino extends Tetromino{

    public TTetromino(Point point, Color color){
        super(new ColoredPoint[]{new ColoredPoint(color, new Point(0, 1)),
                new ColoredPoint(color, new Point(1, 1)),
                new ColoredPoint(color, new Point(2, 1)),
                new ColoredPoint(color, new Point(1, 0))});

    }

    public TTetromino(ColoredPoint[] points) {
        super(points);
    }

    @Override
    public boolean allowsRotate() {
        return true;
    }
}
