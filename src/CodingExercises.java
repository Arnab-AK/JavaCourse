public class CodingExercises {

    // Coding Exercise 1
    public class PositiveNegativeZero {
        public static void checkNumber (int number) {
            if (number > 0) {
                System.out.println("positive");
            } else if (number < 0) {
                System.out.println("negative");
            } else if (number == 0) {
                System.out.println("zero");
            }
        }
    }

    // Coding Exercise 2
    public class SpeedConverter {
        // write code here

        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            } else {
                return Math.round(kilometersPerHour / 1.609);
            }
        }

        public static void printConversion(double kilometersPerHour) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            if (milesPerHour == -1) {
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            }
        }
    }

    // Coding Exercise 3
    public class MegaBytesConverter {
        // write code here

        public static void printMegaBytesAndKiloBytes(int kiloBytes) {
            int megaBytes = kiloBytes / 1024;
            int remKilobytes = kiloBytes % 1024;

            if (kiloBytes > 0) {
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKilobytes + " KB");
            } else if (kiloBytes < 0) {
                System.out.println("Invalid Value");
            } else if (kiloBytes == 0) {
                System.out.println("0 KB = 0 MB and 0 KB");
            }
        }
    }

    // Coding Exercise 4
    public class BarkingDog {
        // write code here

        public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                if (barking == true && (hourOfDay > 22 || hourOfDay < 8)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // Coding Exercise 5
    public class LeapYear {
        // write code here
        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                if ((year % 4) == 0) {
                    if ((year % 100) == 0) {
                        if ((year % 400) == 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // Coding Exercise 6
    public class DecimalComparator {
        // write code here
        public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
            int roundedNum1 = (int) (a * 1000);
            int roundedNum2 = (int) (b * 1000);

            return roundedNum1 == roundedNum2;
        }
    }

    // Coding Exercise 7
    public class EqualSumChecker {
        // write code here
        public static boolean hasEqualSum (int a, int b, int c) {
            if ((a + b) == c ) {
                return true;
            } else {
                return false;
            }
        }
    }

    // Coding Exercise 8
    public class TeenNumberChecker {
        // write code here
        public static boolean hasTeen (int a, int b, int c) {
            return isTeen(a) || isTeen(b) || isTeen(c);
        }

        public static boolean isTeen(int number) {
            return number > 12 && number < 20;
        }
    }

    // Coding Exercise 9
    public class AreaCalculator {
        // write code here

        public static double area (double radius) {

            if (radius < 0) {
                return -1.0;
            } else {
                return 3.14159 * (radius * radius);
            }

        }

        public static double area (double x, double y) {

            if (x < 0 || y < 0) {
                return -1.0;
            } else {
                return x * y;
            }
        }
    }

    // Coding Exercise 10
    public class MinutesToYearsDaysCalculator {
        // write code here

        public static void printYearsAndDays(long minutes) {
            if (minutes < 0 ){
                System.out.println("Invalid Value");
            } else {
                long years = minutes / (60 * 24 * 365);
                long remainingMinutes = minutes % (60 * 24 * 365);
                long days = remainingMinutes / (60 * 24);
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }

    // Coding Exercise 11
    public class IntEqualityPrinter {
        // write code here

        public static void printEqual(int x, int y, int z){
            if (x < 0 || y < 0 || z < 0){
                System.out.println("Invalid Value");
            } else if (x == y && y == z){
                System.out.println("All numbers are equal");
            } else if (x != y && y != z && x != z){
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

    // Coding Exercise 12
    public class PlayingCat {
        // write code here

        public static boolean isCatPlaying (boolean summer, int temperature){
            if (summer) {
                return temperature >= 25 && temperature <= 45;
            } else {
                return temperature >= 25 && temperature <= 35;
            }
        }
    }

    // Coding Exercise 13
    public class NumberInWord {
        // write code here

        public static void printNumberInWord (int number) {
            // String theNumber = switch (number) {
            //     case 0 -> {yield "ZERO";}
            //     case 1 -> {yield "ONE";}
            //     case 2 -> {yield "TWO";}
            //     case 3 -> {yield "THREE";}
            //     case 4 -> {yield "FOUR";}
            //     case 5 -> {yield "FIVE";}
            //     case 6 -> {yield "SIX";}
            //     case 7 -> {yield "SEVEN";}
            //     case 8 -> {yield "EIGHT";}
            //     case 9 -> {yield "NINE";}
            //     default -> {yield "OTHER";}
            // };
            // System.out.println(theNumber);
            String numberInWord;
            switch (number) {
                case 0 -> numberInWord = "ZERO";
                case 1 -> numberInWord = "ONE";
                case 2 -> numberInWord = "TWO";
                case 3 -> numberInWord = "THREE";
                case 4 -> numberInWord = "FOUR";
                case 5 -> numberInWord = "FIVE";
                case 6 -> numberInWord = "SIX";
                case 7 -> numberInWord = "SEVEN";
                case 8 -> numberInWord = "EIGHT";
                case 9 -> numberInWord = "NINE";
                default -> numberInWord = "OTHER";
            }
            System.out.println(numberInWord);
        }
    }

    // Coding Exercise 14
    public class NumberOfDaysInMonth {
        // write code here

        public static int getDaysInMonth(int month, int year) {

            if (year < 1 || year > 9_999) {
                return -1;
            }

            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
                case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
                case 4, 6, 9, 11 -> 30; // return 30 for the following months
                default -> -1; // return -1 if the month parameter is not between 1 and 12.
            };
        }

        public static boolean isLeapYear(int year) {

            if (year < 1 || year > 9_999) {
                return false;
            }

            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    return true;
                } else {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
    }
}
