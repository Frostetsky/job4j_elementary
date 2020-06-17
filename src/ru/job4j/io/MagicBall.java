package ru.job4j.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicBall {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = reader.readLine();
        switch (randomNumber()) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            default :
                System.out.println("Может быть");
                break;
        }
    }

    public static int randomNumber() {
        return (int) (Math.random() * 3);
    }
}
