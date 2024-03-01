import java.lang.System;

public class Section4Part2 {
    public static void main(String[] args) {
        System.out.println("Hello, Tim!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore <= 100) { // ==, !=, >, >=, <, <=
            System.out.println("You got the high score!");
        }
        int secondTopScore = 96;
        if ((topScore > secondTopScore) && (topScore < 100)){ // &&,
            System.out.println("Greater then second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the condition are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == false) { // !isCar ~ isCar == false
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        // String isDomesticThis = makeOfCar == "Volkswagen" ? "Yes" : "No";
        // System.out.println(isDomesticThis);

        if (isDomestic) {
            System.out.println("This car is domestic to the country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        /*
        // Challenge 1

        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b) * 100.00d;
        System.out.println(c);

        // double d = c * 100.00d;
        // System.out.println(d);

        double e = c % 40.00d;
        System.out.println(e);

        // if (e == 0.00) {
        //    boolean x = true;
        //    System.out.println(x);
        //} else {
        //    boolean x = false;
        //    System.out.println(x);
        //}

        boolean isRemainder = (e == 0) ? true : false;
        System.out.println(isRemainder);
        if (isRemainder != true) {
            System.out.println("Got some remainder");
        }
        */
    }
}
