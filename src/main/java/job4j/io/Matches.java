package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    private static int matches = 11;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFirst = true;
        int player = 0;
        do {
            if (matches <= player) { System.out.println("Возьми оставшиеся спички"); }
            System.out.println("Ходит игрок № " + (isFirst ? "1" : "2") + "." + " Введите кол-во спичек от 1 до 3.");
            String mathcesplayer = scanner.next();
            player = Integer.parseInt(mathcesplayer);
            if (player < 1 || player > 3) { System.out.println("Игрок № " + (isFirst ? "1" : "2") + "сжулничал. "
                                                + "Техническая победа игроку № " + (isFirst ? "1" : "2")); break; }
            matches -= player;
            System.out.println("Количество оставшихся спичек " + matches);
            if (matches <= 0) { System.out.println("Игрок № " + (isFirst ? "1" : "2") + " победил"); break; }
            isFirst = !isFirst;
        } while (matches > 0);
    }
}
