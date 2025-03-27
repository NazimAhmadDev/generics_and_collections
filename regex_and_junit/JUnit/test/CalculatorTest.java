import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(0, Calculator.add(-2, 2));
        assertEquals(-5, Calculator.add(-2, -3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, Calculator.sub(3, 2));
        assertEquals(-4, Calculator.sub(-2, 2));
        assertEquals(1, Calculator.sub(-2, -3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Calculator.mul(2, 3));
        assertEquals(-4, Calculator.mul(-2, 2));
        assertEquals(6, Calculator.mul(-2, -3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.div(6, 3));
        assertEquals(-1, Calculator.div(-2, 2));
        assertEquals(1, Calculator.div(-3, -3));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.div(5, 0));
    }
}
