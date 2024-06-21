public class Section6Sum3And5Challenge {

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMathces = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)){
                countOfMatches++;
                sumOfMathces += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (countOfMatches == 5){
                break;
            }
        }
        System.out.println("Sum = " + sumOfMathces);
    }
}
