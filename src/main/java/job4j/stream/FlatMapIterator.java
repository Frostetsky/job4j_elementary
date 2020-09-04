package job4j.stream;

import java.util.*;

public class FlatMapIterator {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Iterator<Integer>> list = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> iterator = it.next();
            list.add(iterator);
        }
        for (Iterator<Integer> its : list) {
            while (its.hasNext()) {
            integers.add(its.next());
            }
        }
        return integers;
    }
}