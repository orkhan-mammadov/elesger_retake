package com.orkhanmammadov.game.board;

import java.util.Objects;

public class ColoredPoint {

    final private Color color;
    private Point point;

    public ColoredPoint(Color color, Point point) {
        this.color = color;
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColoredPoint that = (ColoredPoint) o;
        return color == that.color && point.equals(that.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, point);
    }

    public ColoredPoint offsetXY(){
        return new ColoredPoint(getColor(), point.offsetXY(getX(), getY()));
    }

    public Color getColor() {
        return color;
    }

    public int getX(){
        return point.getX();
    }

    public int getY(){
        return point.getY();
    }

    @Override
    public String toString() {
        return getColor()+" "+getX()+" "+getY();
    }
}
