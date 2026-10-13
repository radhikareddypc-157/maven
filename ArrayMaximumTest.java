import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMaximumTest {
    @Test
    public void testMaximum() {
        assertEquals(67,
                ArrayMaximum.maximum(new int[]{12, 45, 23, 67, 10}));
    }
}