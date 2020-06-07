package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index1 = 0; index1 < array.length; index1++) {
                for (int index2 = 0; index2 < array.length; index2++) {
                    if (array[index2] == null) {
                        int point2 = index2;
                        swap(array, index1, point2);
                    }
                }
        }
        return array;
    }


    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static void swap(String[] array, int point1, int point2) {
        String tmp = array[point1];
        array[point1] = array[point2];
        array[point2] = tmp;
    }
}