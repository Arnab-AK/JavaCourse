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

}
