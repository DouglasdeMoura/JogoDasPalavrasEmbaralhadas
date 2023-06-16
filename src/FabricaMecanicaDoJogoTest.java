import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FabricaMecanicaDoJogoTest {
    private FabricaMecanicaDoJogo mecanicaDoJogo;

    @BeforeEach
    public void setUp() {
        mecanicaDoJogo = new FabricaMecanicaDoJogo();
    }

    @Test
    public void testIsGameOver_NotGameOver() {
        Assertions.assertFalse(mecanicaDoJogo.isGameOver());
    }

    @Test
    public void testIsCorrectWord_CorrectWord() {
        String userInput = "hello";
        String targetWord = "Hello";
        Assertions.assertTrue(mecanicaDoJogo.isCorrectWord(userInput, targetWord));
    }

    @Test
    public void testIsCorrectWord_IncorrectWord() {
        String userInput = "world";
        String targetWord = "Hello";
        Assertions.assertFalse(mecanicaDoJogo.isCorrectWord(userInput, targetWord));
    }

    @Test
    public void testCanTryAgain_NotGameOver() {
        Assertions.assertTrue(mecanicaDoJogo.canTryAgain());
    }

    @Test
    public void testCalculateScore() {
        String userInput = "Java";
        int expectedScore = userInput.length() * 10;
        int calculatedScore = mecanicaDoJogo.calculateScore(userInput);
        Assertions.assertEquals(expectedScore, calculatedScore);
    }
}
