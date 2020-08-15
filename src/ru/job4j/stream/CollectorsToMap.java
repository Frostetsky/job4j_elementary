package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John",80));
        students.add(new Student("Mack",70));
        students.add(new Student("Mike",30));
        students.add(new Student("Nika",45));
        Map<String,Integer> mapstudents = students.stream()
                                                  .distinct()
                                                  .collect(Collectors.toMap(
                                                          Student::getSurname,
                                                          Student::getScore
                                                  ));
    }
}
