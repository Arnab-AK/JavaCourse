public class Section5MethodOverloading {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//
//        calculateScore(75);
//        calculateScore();

        System.out.println("New score is " + calculateScore("Tim",500));
        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous",score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
