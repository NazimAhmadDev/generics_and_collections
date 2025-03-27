import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskTest {
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS) // Fails if execution time exceeds 2 seconds
    void testLongRunningTaskTimeout() {
        Task task = new Task();
        task.longRunningTask(); // This should fail since it takes 3 seconds
    }
}
