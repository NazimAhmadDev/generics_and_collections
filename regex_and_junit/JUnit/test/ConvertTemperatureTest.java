import org.junit.jupiter.api.Test;

public class ConvertTemperatureTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, ConvertTemprature.convertToFahrenheit((0)), 0.01);
        assertEquals(98.6, ConvertTemprature.convertToFahrenheit((37)), 0.01);
        assertEquals(212.0, ConvertTemprature.convertToFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, ConvertTemprature.convertToCelsius(32), 0.01);
        assertEquals(37.0, ConvertTemprature.convertToCelsius(98.6), 0.01);
        assertEquals(100.0, ConvertTemprature.convertToCelsius(212), 0.01);
    }
}
