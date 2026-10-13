import org.junit.Test;
import static org.junit.Assert.*;

public class StringPalindromeTest {
    @Test
    public void testPalindrome() {
        assertTrue(StringPalindrome.isPalindrome("madam"));
        assertFalse(StringPalindrome.isPalindrome("hello"));
    }
}