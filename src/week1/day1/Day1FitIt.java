package week1.day1;

/**
 * Created by katiebunnell on 7/11/16.
 */
public class Day1FitIt {

    private static int x = 12;
    private static int y = 28;
    private static double z = 3.3;

    public static void main(String[] args) {
        System.out.println("The answer to(x * y) / z is"+calculate() + ".");

    }

    private static double calculate() {
       // double d=(x * y) / z;
        return (x * y) / z;
    }
}
