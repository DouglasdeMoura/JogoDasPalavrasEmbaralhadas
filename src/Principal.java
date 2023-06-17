import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        BancoDePalavras bancoDePalavras = new BancoDePalavras("palavras.txt");
        FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
        MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo();
        Embaralhador embaralhador = fabricaEmbaralhadores.create();

        String targetWord = bancoDePalavras.getRandomWord();
        String scrambledWord = embaralhador.shuffle(targetWord);
        int score = 0;

        System.out.println("Bem-vindo ao jogo de palavras!");
        System.out.println("A palavra embaralhada é: " + scrambledWord);

        Scanner scanner = new Scanner(System.in);
        while (!mecanicaDoJogo.isGameOver()) {
            System.out.print("Digite a palavra correta: ");
            String userInput = scanner.nextLine();

            if (mecanicaDoJogo.isCorrectWord(userInput, targetWord)) {
                score += mecanicaDoJogo.calculateScore(userInput);
                System.out.println("Parabéns! Você acertou a palavra.");
                System.out.println("Pontuação atual: " + score);
                System.out.println();

                targetWord = bancoDePalavras.getRandomWord();
                scrambledWord = embaralhador.shuffle(targetWord);

                System.out.println("Nova palavra embaralhada: " + scrambledWord);
            } else {
                System.out.println("Palavra incorreta. Fim de jogo!");
                System.out.println("Pontuação final: " + score);
                mecanicaDoJogo.setGameOver(true);
            }
        }

        scanner.close();
    }
}
