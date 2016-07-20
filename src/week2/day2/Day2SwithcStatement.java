package week2.day2;

import toolbox.Switches;

/**
 * Created by Superduo on 7/19/16.
 */
public class Day2SwithcStatement {

    private static int monthInt = 8;
    private static String monthString = "july";

    public static void main(String[] args) {
        System.out.println("The " + monthInt + " month is " + intSwitchMonth(monthInt) + ".");
        System.out.println(monthString + " is the " + StringSwitchMonth(monthString) + " month of the year.");
    }

    public static String intSwitchMonth(int month) {

        switch (month) {
            case 1: monthString = "jan";
                break;
            case 2: monthString = "feb";
                break;
            case 3: monthString = "march";
                break;
            case 4: monthString = "april";
                break;
            case 5: monthString = "may";
                break;
            case 6: monthString = "june";
                break;
            case 7: monthString = "july";
                break;
            case 8: monthString = "aug";
                break;
            case 9: monthString = "sept";
                break;
            case 10: monthString = "oct";
                break;
            case 11: monthString = "nov";
                break;
            case 12: monthString = "dec";
                break;
            default: monthString = "invalid month";
                break;

        }                return monthString;

    }


    private static int StringSwitchMonth(String month) {
            int monthnumber = 0;
                    if (month == null) {
                        return monthnumber;
                    }
        switch (month) {
            case "Jan":
                monthnumber = 1;
                break;
            case "feb":
                monthnumber = 2;
                break;
            case "march":
                monthnumber = 3;
                break;
            case "april":
                monthnumber = 4;
                break;
            case "may":
                monthnumber = 5;
                break;
            case "june":
                monthnumber = 6;
                break;
            case "july":
                monthnumber = 7;
                break;
            case "aug":
                monthnumber = 8;
                break;
            case "sept":
                monthnumber = 9;
                break;
            case "oct":
                monthnumber = 10;
                break;
            case "nov":
                monthnumber = 11;
                break;
            case "dec":
                monthnumber =11;
                break;
        }return monthnumber;
    }


}




//    private static void main(String[] args) {
//        Switches switches = new Switches();
//        switches.stringSwitch("monday");
//    }
//}

    // This method is an example of a very simple case
//    public void intSwitch(int month) {
//
//        switch (month) {
//
//            case 1:
//                System.out.println("Jan");
//                break;
//            case 2:
//                System.out.println("Feb");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("Sept");
//                break;
//            case 10:
//                System.out.println("Oct");
//                break;
//            case 11:
//                System.out.println("Nov");
//                break;
//            case 12:
//                System.out.println("Dec");
//                break;
//
//        }
//
//    }