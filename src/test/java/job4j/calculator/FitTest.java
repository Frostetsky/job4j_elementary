package job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 182;
        int expected = 90;
        double out = Fit.manWeight(182);
        Assert.assertEquals(expected,out,9);
    }

    @Test
    public void womanWeight() {
        int in = 175;
        int expcted = 70;
        double out = Fit.womanWeight(175);
        Assert.assertEquals(expcted,out,7.5);
    }
}