import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddTest {
    @Test
    public void testEvenOdd() {
        assertEquals("Even", EvenOdd.check(8));
        assertEquals("Odd", EvenOdd.check(7));
    }
}