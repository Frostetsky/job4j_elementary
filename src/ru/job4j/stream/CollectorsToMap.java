package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsToMap {

    public static final List<Student> students = new ArrayList<>(Arrays.asList(new Student("John",80),
                                                                               new Student("Mack",70),
                                                                               new Student("Mike",30),
                                                                               new Student("Nika",45)));

    Map<String,Integer> collect(List<Student> students) {
        Map<String,Integer> mapstudents = students.stream()
                                                  .distinct()
                                                  .collect(Collectors.toMap(
                                                           Student::getSurname,
                                                           Student::getScore,
                                                           (o1,o2) -> o1
                                                  ));
        return mapstudents;
    }
}
