package job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(10);
        Battery battery2 = new Battery(100);
        battery1.exchange(battery2);
        System.out.println(battery1.load);
        System.out.println(battery2.load);
    }
}