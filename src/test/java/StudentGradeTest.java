import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeTest {
    @Test
    public void testGrade() {
        assertEquals("A", StudentGrade.calculate(95));
        assertEquals("B", StudentGrade.calculate(85));
        assertEquals("F", StudentGrade.calculate(40));
    }
}