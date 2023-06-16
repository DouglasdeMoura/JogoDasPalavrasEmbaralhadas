import java.util.Random;

public class EmbaralhadorAleatorio implements Embaralhador {
    @Override
    public String shuffle(String palavra) {
        char[] letras = palavra.toCharArray();
        Random random = new Random();

        for (int i = 0; i < letras.length; i++) {
            int j = random.nextInt(letras.length);
            char temp = letras[i];
            letras[i] = letras[j];
            letras[j] = temp;
        }

        return new String(letras);
    }
}
