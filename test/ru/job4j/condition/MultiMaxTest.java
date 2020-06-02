package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = new MultiMax().max(10,-6,-13);
        assertThat(result,is(10));
    }

    @Test
    public void whenThirdMax() {
        int result = new MultiMax().max(-5,-2,-1);
        assertThat(result,is(-1));
    }
}