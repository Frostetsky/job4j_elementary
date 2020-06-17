package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    private static int matches = 11;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1 = 0;
        int player2 = 0;
        while (true) {
            System.out.println("Ходит игрок №1. Введите кол-во спичек от 1 до 3.");
            String mathcesplayer1 = scanner.next();
            player1 = Integer.parseInt(mathcesplayer1);
            if (player1 < 1 || player1 > 3) { System.out.println("Игрок №1 сжулничал. Техническая победа игроку №2"); break; }
            matches -= player1;
            System.out.println("Количество оставшихся спичек " + matches);
            if (matches <= 0) { System.out.println("Игрок №1 победил"); break; }
            System.out.println("Ходит игрок №2. Введите кол-во спичек от 1 до 3.");
            String mathcesplayer2 = scanner.next();
            player2 = Integer.parseInt(mathcesplayer2);
            if (player2 < 1 || player2 > 3) { System.out.println("Игрок №2 сжулничал. Техническая победа игроку №1"); break; }
            matches -= player2;
            System.out.println("Количество оставшихся спичек " + matches);
            if (matches <= 0) { System.out.println("Игрок №2 победил"); break; }
        }
    }
}
