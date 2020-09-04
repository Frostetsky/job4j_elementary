package job4j.oop;

public class AnotherStudent {
    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        AnotherStudent petya = new AnotherStudent();
        for (int i = 0; i < 3; i++) {
            petya.song();
            petya.music();
        }
    }
}
