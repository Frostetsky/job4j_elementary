package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - i - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - i - 1);
            data[i] = min;
        }
        return data;
    }
}