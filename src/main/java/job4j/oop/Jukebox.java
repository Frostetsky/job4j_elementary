package job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже........");
        }
        else if (position == 2) {
            System.out.println("Спокойной ночи.........");
        }
        else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        new Jukebox().music(1);
        new Jukebox().music(2);
        new Jukebox().music(13);
    }
}
