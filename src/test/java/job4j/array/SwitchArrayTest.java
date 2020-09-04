package job4j.array;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {1, 0, 19, 7, 4, 6};
        int[] expect = {1, 4, 19, 7, 0, 6};
        int[] rsl = SwitchArray.swap(input,1,4);
        assertThat(rsl,is(expect));
    }
}