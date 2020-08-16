package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.stream.CollectorsToMap.students;

public class CollectorsToMapTest {

    @Test
    public void whenListToMap() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("John",80);
        expected.put("Mack",70);
        expected.put("Mike",30);
        expected.put("Nika",45);
        Map<String,Integer> result = new CollectorsToMap().collect(students);
        assertThat(expected, is(result));
    }

    @Test
    public void whenListToMapWithDuplicates() {
        List<Student> otherstu = new ArrayList<>(Arrays.asList(new Student("John",80),
                                                               new Student("John",60),
                                                               new Student("Mike",30)));
        Map<String,Integer> expected = new HashMap<>();
        expected.put("John",80);
        expected.put("Mike",30);
        Map<String,Integer> result = new CollectorsToMap().collect(otherstu);
        assertThat(expected, is(result));
    }
}