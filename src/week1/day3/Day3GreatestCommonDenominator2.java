package week1.day3;

/**
 * Created by Kev on 7/13/16.
 */
public class Day3GreatestCommonDenominator2 {
    // long[] with values
    private static long[] longs = {500, 25000, 20, 100, 1000000, 800, 10};


    // main method

    public static void main(String[] args) {
        long result = gcd(longs);
        System.out.println("Result" + result);
    }

    // gcd method
    private static long gcd(long[] k) {
        // loops through the long[]

        long result = k[0];
        for (int i = 0; i < k.length; i++) {
            System.out.println("The number is: " + k[i]);
            // plugs values into the other gcd method

            result = Day3GreatestCommonDenomenator.gcd(result, k[i]);

        }
        // returns the greatest common denominator
        return result;
    }
}



