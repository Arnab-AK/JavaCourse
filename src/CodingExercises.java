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

}
