package ru.job4j.condition;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3to1Then3() {
        int result = Max.max(3,1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4to4Then4() {
        int result = Max.max(4,4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(4,0,-1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxNeg10() {
        int result = Max.max(-10,-100,-53,-11);
        assertThat(result, is(-10));
    }

}