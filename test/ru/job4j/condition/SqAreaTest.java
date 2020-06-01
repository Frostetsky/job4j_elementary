package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test(expected = ArithmeticException.class)
    public void square() {
        double rsl1 = SqArea.square(4,-1);
        double rsl2 = SqArea.square(2,0);
        double rsl3 = SqArea.square(-5,2);
        double rsl4 = SqArea.square(0,3);
        int p = 4;
        int k = 1;
        int expected = 1;
        double rsl5 = SqArea.square(4,1);
        Assert.assertEquals(expected,rsl5,1e-5);
    }
}