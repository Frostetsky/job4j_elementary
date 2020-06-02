package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first >= third) {
            result = first;
        }
        else if (second >= first && second >= third) {
            result = second;
        }
        else {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(10,10,1));
    }
}