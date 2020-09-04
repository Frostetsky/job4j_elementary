package job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] example = new int[5];
        for (int index = 0; index < example.length; index++) {
            example[index] = index * 2 + 3;
        }
        for (int i = 0; i < example.length; i++) {
            System.out.println(example[i]);
        }
    }
}
