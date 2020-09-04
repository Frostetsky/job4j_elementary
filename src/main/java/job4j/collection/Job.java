package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Job implements Comparable<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }

    public static void main(String[] args) {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        ArrayList<Job> set = new ArrayList<>();
        set.add(new Job("Task", 2));
        set.add(new Job("Task", 3));
        set.add(new Job("Task", 1));
        set.add(new Job("NewTask",0));
        Collections.sort(set,cmpNamePriority);
        System.out.println(set);
    }
}


