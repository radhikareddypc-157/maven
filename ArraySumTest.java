import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void testSum() {
        assertEquals(100,
                ArraySum.sum(new int[]{10, 20, 30, 40}));
    }
}