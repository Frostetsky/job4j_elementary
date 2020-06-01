package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int p = 4;
        int k = 1;
        int expected = 1;
        double rsl = SqArea.square(4,1);
        Assert.assertEquals(expected,rsl,1e-5);
    }

    @Test(expected = ArithmeticException.class)
    public void negativeCoefficient() {
        double rsl = SqArea.square(4,-1);
    }

    @Test(expected = ArithmeticException.class)
    public void zeroCoefficient() {
        double rsl = SqArea.square(2,0);
    }

    @Test(expected = ArithmeticException.class)
    public void negativePerimeter() {
        double rsl = SqArea.square(-5,2);
    }

    @Test(expected = ArithmeticException.class)
    public void zeroPerimeter() {
        double rsl = SqArea.square(0,3);
    }
}