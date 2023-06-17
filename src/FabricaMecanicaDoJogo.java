public class FabricaMecanicaDoJogo implements MecanicaDoJogo {
    private boolean gameOver;
    private int score;

    @Override
    public boolean isGameOver() {
        return gameOver;
    }

    @Override
    public boolean isCorrectWord(String userInput, String targetWord) {
        return userInput.equalsIgnoreCase(targetWord);
    }

    @Override
    public boolean canTryAgain() {
        return !gameOver;
    }

    @Override
    public int calculateScore(String userInput) {
        int wordLength = userInput.length();
        score += wordLength * 10;
        return score;
    }

    @Override
    public void setGameOver(boolean b) {
        gameOver = b;
    }
}
