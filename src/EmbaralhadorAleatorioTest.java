import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmbaralhadorAleatorioTest {
    @Test
    public void testEmbaralhar() {
        EmbaralhadorAleatorio embaralhador = new EmbaralhadorAleatorio();
        String palavra = "hello";
        String embaralhada = embaralhador.shuffle(palavra);
        Assertions.assertNotEquals(palavra, embaralhada);
        Assertions.assertEquals(palavra.length(), embaralhada.length());
        for (char c : palavra.toCharArray()) {
            Assertions.assertTrue(embaralhada.contains(Character.toString(c)));
        }
    }
}
