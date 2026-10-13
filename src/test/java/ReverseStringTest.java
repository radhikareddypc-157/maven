import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        assertEquals("nevaM", ReverseString.reverse("Maven"));
    }
}