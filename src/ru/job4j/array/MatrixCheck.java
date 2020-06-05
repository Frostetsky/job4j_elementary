package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char temp = 'X';

        for (int i = row; i < board.length; i++) {
            if (temp != board[row][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}