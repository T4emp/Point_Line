package com.xwx;

public class Line {
    Point begin, end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2,y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public String toString() {
        return "Отрезок[начало=" + begin + ",конец=" + end + "]";
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        double Leg1 = begin.getX() - end.getX();
        double Leg2 = begin.getY() - end.getY();
        double TG = Leg2 / Leg1;
        return Math.toDegrees(Math.atan(TG));
    }

    public double distance(int x, int y) {
        return Math.abs((x - getBeginX()) * (getEndY() - getBeginY()) - (y - getBeginY()) * (getEndX() - getBeginX()))
                / Math.sqrt((getEndX() - getBeginX()) * (getEndX() - getBeginX()) + (getEndY() - getBeginY()) * (getEndY() - getBeginY()));
    }

    public double distance(Point P) {
        return distance(P.getX(), P.getY());
    }

    public boolean intersects(Line another) {
        return ccw(getBegin(), another.getBegin(), another.getEnd()) != ccw(getEnd(), another.getBegin(), another.getEnd()) &&
                ccw(getBegin(), getEnd(), another.getBegin()) != ccw(getBegin(), getEnd(), another.getEnd());
    }

    public boolean ccw(Point A, Point B, Point C) {
        return (C.getY()-A.getY()) * (B.getX()-A.getX()) > (B.getY()-A.getY()) * (C.getX()-A.getX());
    }
}