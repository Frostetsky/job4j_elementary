package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int differenceX = x2 - x1;
        int differenceY = y2 - y1;
        double expX = Math.pow(differenceX,2);
        double expY = Math.pow(differenceY,2);
        double rsl = Math.sqrt(expX + expY);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 1, 3, 3);
        double result3 = Point.distance(0,0,0,0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (1, 1) to (3, 3) " + result2);
        System.out.println("result (0, 0) to (0, 0) " + result3);
    }
}