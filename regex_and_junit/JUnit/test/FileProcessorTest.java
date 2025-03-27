import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {
    private static final String TEST_FILE = "test.txt";
    private FileProcessor fileProcessor = new FileProcessor();

    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }

    @Test
    void testWriteAndRead() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Hello");
        assertEquals("Hello", fileProcessor.readFromFile(TEST_FILE));
    }

    @Test
    void testFileExists() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Test");
        assertTrue(Files.exists(Path.of(TEST_FILE)));
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nofile.txt"));
    }
}
