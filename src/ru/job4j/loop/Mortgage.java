package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double x = 0;
        while (amount > salary) {
           x = amount * percent - salary + amount;
           amount = (int) x;
           year++;
        }
        return year;
    }
}