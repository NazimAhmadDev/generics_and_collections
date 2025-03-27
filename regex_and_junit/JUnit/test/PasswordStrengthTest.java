import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordStrength.strength("StrongPass1"));
        assertTrue(PasswordStrength.strength("Hello123"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordStrength.strength("short1"));       // Less than 8 chars
        assertFalse(PasswordStrength.strength("nouppercase1")); // No uppercase letter
        assertFalse(PasswordStrength.strength("NoDigitHere"));  // No digit
    }
}
