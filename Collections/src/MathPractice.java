//Jonathan Ocampo
//03/21/22
//Creating amath practice class to try methods from the Math Class

public class MathPractice {
    public static void main(String[] args) {
        // Attributes
        double x = 24;
        double y = 59;

        // Return the maximum number of the two
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // Return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        // Return 28 power of 4
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // Return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        // Return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        // Return the log of x + 1
        System.out.println("log1p of x is: " + Math.log1p(x));

        // Return a power of 2
        System.out.println("exp of a is: " + Math.exp(x));

        // Return (a power of 2) - 1
        System.out.println("expm1 of a is: " + Math.expm1(x));
    }
}
