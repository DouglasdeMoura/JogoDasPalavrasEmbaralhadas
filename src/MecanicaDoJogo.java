public interface MecanicaDoJogo {
    boolean isGameOver();
    boolean isCorrectWord(String userInput, String targetWord);
    boolean canTryAgain();
    int calculateScore(String userInput);
}