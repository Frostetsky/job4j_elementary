package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first < second ? second : first;
        return result < third ? third : result;
    }

    public static void main(String[] args) {

    }
}