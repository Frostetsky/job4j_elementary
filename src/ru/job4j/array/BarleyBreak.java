package ru.job4j.array;

import java.util.Arrays;

public class BarleyBreak {
    public static void main(String[] args) {
        int count = 1;
        int[][] testArray = new int[3][3];
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                testArray[i][j] = count++;
            }
        }

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                System.out.print(testArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
