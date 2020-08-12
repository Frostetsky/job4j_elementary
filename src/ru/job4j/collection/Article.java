package ru.job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String[] array = origin.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        String[] array2 = line.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,array);
        for (int i = 0; i < array2.length; i++) {
            if (!set.contains(array2[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}

