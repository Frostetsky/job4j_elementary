package ru.job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        char[] array = origin.toCharArray();
        char[] array2 = line.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char chari : array) {
            set.add(chari);
        }
        HashSet<Character> set2 = new HashSet<>();
        for (char chari : array2) {
            set2.add(chari);
        }
        boolean result = set.containsAll(set2);
        return result;
    }
}

