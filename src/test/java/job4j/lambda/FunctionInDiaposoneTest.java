package job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunctionInDiaposoneTest {
    FunctionInDiaposone function = new FunctionInDiaposone();
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = function.diapason(1, 4, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResults() {
        List<Double> result = function.diapason(1, 5, x -> Math.pow(5,x));
        List<Double> expected = Arrays.asList(5D, 25D, 125D, 625D);
        assertThat(result, is(expected));
    }
}