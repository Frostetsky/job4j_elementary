package job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-1);
        numbers.add(0);
        numbers.add(10);
        numbers.add(9);
        List<Integer> sortnumbers = numbers.stream()
                                           .filter(x -> x > 0)
                                           .collect(Collectors.toList());
        sortnumbers.forEach(System.out::println);
    }
}
