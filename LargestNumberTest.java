import org.junit.Test;
import static org.junit.Assert.*;

public class LargestNumberTest {
    @Test
    public void testLargest() {
        assertEquals(25, LargestNumber.largest(10, 25, 15));
    }
}