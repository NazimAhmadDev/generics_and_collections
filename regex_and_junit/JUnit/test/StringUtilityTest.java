import org.junit.jupiter.api.Test;

class StringUtilityTest {
    @Test
    public void TestReverse() {
        assertEquals("noon", StringUtility.reverse("noon"));
        assertEquals("cba", StringUtility.reverse("abc"));
        assertEquals("123abc", StringUtility.reverse("cba321"));
    }


    @Test
    public void TestPalindrome() {
        assertTrue(StringUtility.isPalindrome("noon"));
        assertFalse(StringUtility.isPalindrome("abc"));

    }

    @Test
    public void TestUpperCase() {
        assertEquals("ABC", StringUtility.UpperCase("abc"));
        assertEquals("NAME", StringUtility.UpperCase("name"));
        assertEquals("CODE", StringUtility.UpperCase("code"));
    }

}