package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenArea5n99() {
        Triangle triangle1 = new Triangle(new Point(-1, 3), new Point(-2, -1), new Point(2, 3));
        double out = triangle1.area();
        double expected = 6;
        Assert.assertEquals(expected, out, 1e-05);
    }

    @Test
    public void whenAreaNegative1() {
        Triangle triangle2 = new Triangle(new Point(0, 0), new Point(0, 0), new Point(1,0));
        double out = triangle2.area();
        double expected = -1;
        Assert.assertEquals(expected, out, 1e-05);
    }
}