package job4j.stream;

import com.google.common.collect.Streams;
import java.util.*;
import java.util.stream.Collectors;

public class FlatMapIterator {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return Streams.stream(it).flatMap(iterator -> Streams.stream(iterator)).collect(Collectors.toList());
    }

}