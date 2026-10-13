import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleInterestTest {
    @Test
    public void testInterest() {
        assertEquals(100.0,
                SimpleInterest.calculate(1000, 5, 2), 0.001);
    }
}