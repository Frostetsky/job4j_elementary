package job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first < second ? second : first;
    }

    public static int max(int first, int second, int third) { return max(max(first, second), third); }

    public static int max(int first, int second, int third, int fourth) { return max(max(first, second, third), fourth); }

    public static void main(String[] args) {

    }
}
