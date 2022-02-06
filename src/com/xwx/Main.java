package com.xwx;

public class Main {

    public static void main(String[] args) {
        Main.TestPoint();
        Main.TestLine();
    }

    public static void TestPoint() {
        Point p1 = new Point(1, 2);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);

        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());

        p1.setXY(5, 6);
        System.out.println(p1);
        System.out.println("X is: " + p1.getXY()[0]);
        System.out.println("Y is: " + p1.getXY()[1]);

        p2.setXY(10, 11);
        System.out.printf("Расстояние: %.2f%n", p1.distance(10, 11));
        System.out.printf("Расстояние: %.2f%n", p1.distance(p2));
        System.out.printf("Расстояние: %.2f%n", p1.distance(p1));
        System.out.printf("Расстояние: %.2f%n", p1.distance());
    }

    public static void TestLine() {
        //Задание
        Line l1 = new Line(0, 0, 3, 3);

        System.out.println(l1.getGradient());
        System.out.println(l1.distance(0, 3));
        System.out.println(l1.intersects(new Line(30, 10, 10, 30)));

        //Проверка классов
        Line l2 = new Line(5, 6, 3, 5);

        l2.setBeginX(3);
        l2.setBeginY(10);
        System.out.println("X: " + l2.getBeginX());
        System.out.println("Y: " + l2.getBeginY());

        l2.setEndX(6);
        l2.setEndY(8);
        System.out.println("X: " + l2.getEndX() + ", Y: " + l2.getEndY());

        l2.setBeginXY(5, 7);
        System.out.println("X: " + l2.getBeginXY()[0]);
        System.out.println("Y: " + l2.getBeginXY()[1]);

        System.out.println(l1.getLength());

        l2.setEndXY(9, 9);
        System.out.println("X: " + l2.getEndXY()[0]);
        System.out.println("Y: " + l2.getEndXY()[1]);
    }
}