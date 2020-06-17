package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int index2 = 0;
        for (int index1 = 0; index1 < array.length; index1++) {
            if (array[index1] != null) {
                swap(array, index2, index1);
                index2++;
            }
        }
        return array;
    }

    public static void main(String[]args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static void swap(String[] array,int point1, int point2) {
        String tmp = array[point1];
        array[point1] = array[point2];
        array[point2] = tmp;
    }
}
