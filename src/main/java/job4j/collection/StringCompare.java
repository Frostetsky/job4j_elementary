package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < minLength(left,right); i++) {
            char symvol1 = left.charAt(i);
            char symvol2 = right.charAt(i);
            if (symvol1 != symvol2) {
                return symvol1 - symvol2;
            }
        }
        return left.length() - right.length();
    }

    public int minLength(String left, String right) {
        return Math.min(left.length(),right.length());
    }
}
