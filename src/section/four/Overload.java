package section.four;
public class Overload {
    public static void main(String[] args) {
       int newScore = calculateScore("Alex", 500);
       int oldScore = calculateScore(100);
       calculateScore(75);
        System.out.println("New score is " + newScore);
        System.out.println(oldScore);
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
}
