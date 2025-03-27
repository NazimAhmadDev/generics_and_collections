import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivideCalculatorTest {

    @Test
    void testDivideByZero() {
        DivideCalculator calculator = new DivideCalculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}