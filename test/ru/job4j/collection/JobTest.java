package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        ArrayList<Job> list = new ArrayList<>();
        Job job1 = new Job("Task", 2);
        Job job2 = new Job("Task", 3);
        Job job3 = new Job("Task", 1);
        Job job4 = new Job("NewTask", 0);
        list.add(job1);
        list.add(job2);
        list.add(job3);
        list.add(job4);
        Collections.sort(list,cmpNamePriority);
        Iterator<Job> iterator = list.iterator();
        assertThat(iterator.next(), is(job4));
        assertThat(iterator.next(), is(job3));
        assertThat(iterator.next(), is(job1));
        assertThat(iterator.next(), is(job2));
    }

    @Test
    public void whenComparatorByNameAsc() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                        new Job("Second", 1),
                        new Job("First", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Second", 1),
                new Job("First", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAsc() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("Second", 1),
                new Job("First",0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Second", 1),
                new Job("First",0)
        );
        assertThat(rsl, lessThan(0));
    }
}