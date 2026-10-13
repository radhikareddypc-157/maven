import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseNumberTest {
    @Test
    public void testReverse() {
        assertEquals(4321, ReverseNumber.reverse(1234));
        assertEquals(21, ReverseNumber.reverse(120));
    }
}