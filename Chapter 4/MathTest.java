public class MathTest {
    public static void main(String[] args) {
        // Math.sqrt() - returns the square root of the number
        double num = 37;
        double sqrtResult = Math.sqrt(num);
        System.out.println("SQRT: " + sqrtResult);

        // Math.sin() - returns the sine of the specified angle in radians
        double angle = 3.14;  // approximately 180 degrees in radians
        double sinResult = Math.sin(angle);
        System.out.println("SIN: " + sinResult);

        // Math.cos() - returns the cosine of the specified angle in radians
        double cosResult = Math.cos(angle);
        System.out.println("COS: " + cosResult);

        // Math.floor() - returns the largest integer less than or equal to the argument
        double floorResult = Math.floor(22.9);
        System.out.println("FLOOR: " + floorResult);

        // Math.ceil() - returns the smallest integer greater than or equal to the argument
        double ceilResult = Math.ceil(22.1);
        System.out.println("CEIL: " + ceilResult);

        // Math.round() - returns the closest long to the argument
        long roundResult = Math.round(22.5);
        System.out.println("ROUND: " + roundResult);

        // Math.max() - returns the larger of two values
        int maxResult = Math.max(71, 68);
        System.out.println("MAX: " + maxResult);

        // Math.min() - returns the smaller of two values
        int minResult = Math.min(71, 68);
        System.out.println("MIN: " + minResult);

        // Math.random() - returns a random number between 0.0 and 1.0, which is scaled
        double randomResult = Math.random() * 100;  
        System.out.println("RANDOM: " + randomResult);
    }
}
