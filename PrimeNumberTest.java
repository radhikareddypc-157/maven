import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void testPrime() {
        assertTrue(PrimeNumber.isPrime(7));
        assertFalse(PrimeNumber.isPrime(8));
    }
}