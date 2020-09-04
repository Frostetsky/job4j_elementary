package job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactorialIsNegative() {
        int result = new Fact().calc(-1);
    }

}