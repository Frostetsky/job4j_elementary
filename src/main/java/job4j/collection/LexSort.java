package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftsplit = left.split("\\.");
        String[] rightsplit = right.split("\\.");
        return Integer.compare(Integer.parseInt(leftsplit[0]), Integer.parseInt(rightsplit[0]));
    }
}
