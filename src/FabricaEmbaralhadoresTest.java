import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FabricaEmbaralhadoresTest {
    @Test
    public void testCriarEmbaralhador() {
        FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
        Embaralhador embaralhador = fabrica.create();
        Assertions.assertTrue(embaralhador instanceof EmbaralhadorAleatorio || embaralhador instanceof EmbaralhadorInverso);
    }
}