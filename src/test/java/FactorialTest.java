import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(120L, Factorial.calculate(5));
        assertEquals(1L, Factorial.calculate(0));
    }
}