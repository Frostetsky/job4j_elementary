package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Подсчёт функции в диапозоне.
 * 1. f(X) = A * X + B
 * 2. f(X) = X^2
 * 3. f(X) = A^X
 * Интервал диапозона [ a ; b )
 */
public class FunctionInDiaposone {

    List<Double> diapason(int start, int end, UnaryOperator<Double> func) {
        List<Double> functionvalues = new ArrayList<>();
        for (double x = start; x < end; x++) {
            functionvalues.add(func.apply(x));
        }
        return functionvalues;
    }
}
