import static org.junit.Assert.*;
import org.junit.Test;

public class MathematicalOperationTest {
    
    @Test
    public void testAddition() {
        assertEquals("2 + 3 = 5", MathematicalOperation.findOperation(2, 3, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals("7 - 2 = 5", MathematicalOperation.findOperation(7, 2, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals("3 * 4 = 12", MathematicalOperation.findOperation(3, 4, 12));
    }

    @Test
    public void testDivision() {
        assertEquals("10 / 2 = 5", MathematicalOperation.findOperation(10, 2, 5));
    }

    @Test
    public void testNone() {
        assertEquals("None", MathematicalOperation.findOperation(5, 2, 7));
    }
}
