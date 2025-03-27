import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    @Test
    void testValidDateFormatting() {
        assertEquals("25-03-2024", DateFormatter.formatDate("2024-03-25"));
        assertEquals("01-01-2020", DateFormatter.formatDate("2020-01-01"));
    }

    @Test
    void testInvalidDateFormatting() {
        assertEquals("Invalid Date", DateFormatter.formatDate("2024-13-01")); // Invalid month
        assertEquals("Invalid Date", DateFormatter.formatDate("abc-def-ghi")); // Non-numeric date
    }
}
