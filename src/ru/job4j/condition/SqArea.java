package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h; // h - height
        h = (double) p/(2*(k+1));
        double L; // L - length
        L = h*k;
        double square = L * h;
        return square;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6,2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}