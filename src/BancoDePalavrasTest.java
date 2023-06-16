import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

public class BancoDePalavrasTest {
    private BancoDePalavras bancoDePalavras;

    @BeforeEach
    public void setup() {
        bancoDePalavras = new BancoDePalavras("palavras.txt");
    }

    @Test
    public void testGetRandomWord() {
        String randomWord = bancoDePalavras.getRandomWord();
        Assertions.assertNotNull(randomWord);
        Assertions.assertFalse(randomWord.isEmpty());
    }

    @Test
    public void testFileNotFound() {
        Assertions.assertThrows(Exception.class, () -> new BancoDePalavras("nonexistent.txt"));
    }

    @Test
    public void testEmptyFile() throws Exception {
        File emptyFile = File.createTempFile("empty", "txt");
        Assertions.assertThrows(Exception.class, () -> new BancoDePalavras(emptyFile.getAbsolutePath()));
    }
}