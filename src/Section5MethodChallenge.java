public class Section5MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition1);

        int highScorePosition2 = calculateHighScorePosition(1000);
        displayHighScorePosition("John", highScorePosition2);

        int highScorePosition3 = calculateHighScorePosition(500);
        displayHighScorePosition("Bob", highScorePosition3);

        int highScorePosition4 = calculateHighScorePosition(100);
        displayHighScorePosition("Tom", highScorePosition4);

        int highScorePosition5 = calculateHighScorePosition(25);
        displayHighScorePosition("Mike", highScorePosition5);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition (int playersScore) {
        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position;
    }
}
