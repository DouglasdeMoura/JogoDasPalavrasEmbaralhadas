import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmbaralhadorInversoTest {
    @Test
    public void testEmbaralhar() {
        EmbaralhadorInverso embaralhador = new EmbaralhadorInverso();
        String palavra = "hello";
        String embaralhada = embaralhador.shuffle(palavra);
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        Assertions.assertEquals(palavraInvertida, embaralhada);
    }
}