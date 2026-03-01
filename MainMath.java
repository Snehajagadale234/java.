public class MainMath {

    // Operations Class
    static class Operations {

        public static double floorValue(double num) {
            return Math.floor(num);
        }

        public static double ceilValue(double num) {
            return Math.ceil(num);
        }

        public static long roundValue(double num) {
            return Math.round(num);
        }
    }

    // Main Method
    public static void main(String[] args) {

        double number = 10.75;

        System.out.println("Original Number : " + number);
        System.out.println("Floor Value     : " + Operations.floorValue(number));
        System.out.println("Ceil Value      : " + Operations.ceilValue(number));
        System.out.println("Round Value     : " + Operations.roundValue(number));
    }
}