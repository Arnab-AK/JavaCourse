public class Section5MethodsInJava {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        calculateScore(true, 800, 5, 100);
//        calculateScore(gameOver, score, levelCompleted, bonus);
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;
//        calculateScore(true, 10000, 8, 200);
//        calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The next highsScore is " + calculateScore(gameOver, score, levelCompleted, bonus));
    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        int finalScore = score;
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}