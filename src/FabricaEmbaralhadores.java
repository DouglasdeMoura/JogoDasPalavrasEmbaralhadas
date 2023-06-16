import java.util.Random;

public class FabricaEmbaralhadores {
    public Embaralhador create() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new EmbaralhadorAleatorio();
        } else {
            return new EmbaralhadorInverso();
        }
    }
}