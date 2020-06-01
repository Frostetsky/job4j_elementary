package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rtd = value / 60;
        return rtd;
    }

    public static void main(String[] args) {
     //   int euro = Converter.rubleToEuro(140);
     //   int dollars = Converter.rubleToDollar(180);
     //   System.out.println("140 rubles are " + euro + " euro.");
     //   System.out.println("120 rubles are " + dollars + " dollars.");
        int in = 180;
        int expected = 3;
        int out = rubleToDollar(180);
        boolean passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}