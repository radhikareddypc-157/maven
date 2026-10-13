import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCountTest {
    @Test
    public void testVowels() {
        assertEquals(3, VowelCount.count("Hello World"));
        assertEquals(0, VowelCount.count("rhythm"));
    }
}