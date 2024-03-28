public class Section5MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches){
//        return ((heightFeet * 12) + heightInches) * 2.54;
        return convertToCentimeters((heightFeet * 12) + heightInches);
    }
}
