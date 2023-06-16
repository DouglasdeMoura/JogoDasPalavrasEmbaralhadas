import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    private final List<String> words;

    public BancoDePalavras(String fileName) {
        words = new ArrayList<>();
        loadWordsFromFile(fileName);
    }

    private void loadWordsFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo de palavras", e);
        }

        if (words.isEmpty()) {
            throw new RuntimeException("Arquivo de palavras vazio");
        }
    }

    public String getRandomWord() {
        Random random = new Random();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
}