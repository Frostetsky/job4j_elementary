package ru.job4j.converter;

/**
 * Class Converter решение задачи блока "Базовый синтакс".
 * @author Никита Нестеренко.
 * @since 01.06.2020.
 */

public class Converter {

    /**
     * Конвертация из Рубля в Евро.
     * @param value - значение в рублях.
     * @return rtd - результат.
     */

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Конвертация из Рубля в Доллары.
     * @param value - значение в рублях.
     * @return rtd - результат.
     */

    public static int rubleToDollar(int value) {
        int rtd = value / 60;
        return rtd;
    }

    /**
     * Ручное тестирование (без использования Junit).
     * Вывод подтверждения правильной конвертации в консоль.
     * @param args
     */

    public static void main(String[] args) {
        int in = 180;
        int expected = 3;
        int out = rubleToDollar(180);
        boolean passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);

    }
}