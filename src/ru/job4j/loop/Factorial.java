package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n == 0) return 1;
        else if (n < 0) { System.out.println("Факториала от отрицательного числа не существует"); return n; }
        else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }
}