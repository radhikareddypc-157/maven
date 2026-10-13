import org.junit.Test;
import static org.junit.Assert.*;

public class NumberPalindromeTest {
    @Test
    public void testPalindrome() {
        assertTrue(NumberPalindrome.isPalindrome(121));
        assertFalse(NumberPalindrome.isPalindrome(123));
    }
}