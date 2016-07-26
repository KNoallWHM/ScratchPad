package week2;

/**
 * Created by Superduo on 7/18/16.
 */
public class Day1FizzBuzz {

    public static void main(String[] args) {

        thisWay();
        thatWay();
    }


    public static void thatWay() {
        String returnThis = "";
        for (int count = 1; count < 100; count++) {
            returnThis = "";

            if (count % 3 == 0) {

                returnThis += "Fizz";

            }
            if (count % 5 == 0) {
                returnThis += "Buzz";
            }
            if (returnThis.isEmpty()) {
                System.out.println(count);
            } else {
                System.out.println(returnThis);
            }
        }
    }


    public static void thisWay() {
        String returnThis = "";
        for (int i = 1; i <= 100; i++) {
            returnThis = "";

            if (i % 3 == 0) {
                returnThis = "Fizz";

                // check if divisible by 3 -- print Fizz
            }
            if (i % 5 == 0) {
                returnThis = "Buzz";

                // check if divisible by 5 -- print Buzz

            }
            if (i % 15 == 0) ;
            {
                returnThis = "FizzBuzz";
            }
        }

    }

}
