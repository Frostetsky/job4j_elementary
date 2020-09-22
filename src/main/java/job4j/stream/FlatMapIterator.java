package job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FlatMapIterator {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return  StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false).flatMap(x -> StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(x, Spliterator.ORDERED),
                false)).collect(Collectors.toList());
    }

}