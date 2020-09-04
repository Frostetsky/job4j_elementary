package job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SchoolTest {

    private final School school = new School();
    private final List<Student> students = new ArrayList<>(Arrays.asList(new Student("Nikita",90),
                                                                         new Student("Maksim",80),
                                                                         new Student("Vadim",50),
                                                                         new Student("Dmitriy",70),
                                                                         new Student("Anna",40),
                                                                         new Student("Vladislav",100),
                                                                         new Student("Polina",60)));

    @Test
    public void whenStudentFrom10A() {
        List<Student> result = school.collect(students, student -> student.getScore() >= 70
                                                                && student.getScore() <= 100);
        List<Student> expected = new ArrayList<>(Arrays.asList(new Student("Nikita",90),
                                                               new Student("Maksim",80),
                                                               new Student("Dmitriy",70),
                                                               new Student("Vladislav",100)));
        assertThat(expected, is(result));
    }

    @Test
    public void whenStudentFrom10B() {
        List<Student> result = school.collect(students, student -> student.getScore() >= 50
                                                                && student.getScore() < 70);
        List<Student> expected = new ArrayList<>(Arrays.asList(new Student("Vadim",50),
                                                               new Student("Polina",60)));
        assertThat(expected, is(result));
    }

    @Test
    public void whenStudentFrom10C() {
        List<Student> result = school.collect(students, student -> student.getScore() > 0
                                                                && student.getScore() < 50);
        List<Student> expected = new ArrayList<>(Arrays.asList(new Student("Anna",40)));

        assertThat(expected, is(result));
    }
}