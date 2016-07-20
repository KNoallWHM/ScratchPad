package week2.day2;

/**
 * Created by Superduo on 7/19/16.
 */
public class Day2FixSwithStatement {

    private static char branch = 'M'; // C - CSE, E - ECE, M - Mech
    private static int year = 2;

    public static void main(String[] args) {


        switchit();
    }

    public static void switchit() {
        switch (year) {
            case 1:
                System.out.println("English, Math, Drawing");
                break;
            case 2:
                switch (branch) // LINE C
                {
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch) // LINE D
                {
                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;

        }


    }
}
