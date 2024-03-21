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
}
