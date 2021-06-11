package com.orkhanmammadov.game.board;

import java.util.ArrayList;

public class SquareTetromino extends Tetromino{

    public SquareTetromino(Point point, Color color) {
        super(new ColoredPoint[]{new ColoredPoint(color, new Point(0, 0)),
                new ColoredPoint(color, new Point(0, 1)),
                new ColoredPoint(color, new Point(1, 0)),
                new ColoredPoint(color, new Point(1, 1))});
    }

    public SquareTetromino(ColoredPoint[] points) {
        super(points);
    }

    @Override
    public boolean allowsRotate() {
        return false;
    }
}
