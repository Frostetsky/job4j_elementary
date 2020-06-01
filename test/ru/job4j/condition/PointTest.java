package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void ZeroDistance() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double expected = 0.0;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,out,1e-02);
    }

    @Test
    public void NormalDistance() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double expected = 2.828427;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,out,1e-05);
    }
}