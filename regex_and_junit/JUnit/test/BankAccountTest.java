import org.junit.jupiter.api.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initial balance: 100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        assertTrue(account.withdraw(40.0));
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void testWithdrawFailsForInsufficientFunds() {
        assertFalse(account.withdraw(200.0));
        assertEquals(100.0, account.getBalance()); // Balance remains unchanged
    }
}
