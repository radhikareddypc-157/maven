import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSeriesTest {
    @Test
    public void testFibonacci() {
        assertEquals("0 1 1 2 3 5 8",
                FibonacciSeries.generate(7));
    }
}