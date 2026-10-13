import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {
    @Test
    public void testAddition() {
        assertEquals(30, Addition.add(10, 20));
    }
}