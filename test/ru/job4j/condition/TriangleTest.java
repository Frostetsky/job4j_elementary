package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void negativeLength() {
        boolean result = Triangle.exist(-1,2,5);
        assertThat(result,is(false));
    }

    @Test
    public void zeroLength() {
        boolean result = Triangle.exist(0,2,0);
        assertThat(result,is(false));
    }

    @Test
    public void normalTriangle() {
        boolean result = Triangle.exist(3,4,5);
        assertThat(result,is(true));
    }

    @Test
    public void nonexistentTriangle() {
        boolean result = Triangle.exist(1,3,5);
        assertThat(result,is(false));
    }
}