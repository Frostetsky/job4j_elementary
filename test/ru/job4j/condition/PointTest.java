package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double expected1 = 0.0;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected1,out,1e-02);
        x1 = 1;
        y1 = 1;
        x2 = 3;
        y2 = 3;
        expected1 = 2.828427;
        out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected1,out,1e-05);
    }
}