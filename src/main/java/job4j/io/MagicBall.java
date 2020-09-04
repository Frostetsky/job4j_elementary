package job4j.io;


import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = scanner.next();
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
