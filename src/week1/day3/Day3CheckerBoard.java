package week1.day3;

/**
 * Created by Superduo on 7/14/16.
 */

public class Day3CheckerBoard {
//    public static void main(String[] args) {
//        int size = 9;    // size of the board
//        //for (int i = 1; i <= 5; i++) {
////        for (int row = 10; row <= 9; row++) {
////            //
////            System.out.println("*  *  *  *");
////        }
//        for (int col = 0; col <= 9; col++) {
////                if ((row % 2) == 0) {
//            System.out.println(" *  *  *  *");
//
//
//            for (int ize = 0; ize <= 9; ize++) ;
//            //if ((row % 2) == 0) {
//            System.out.println("*  *  *  *  *");
//            {
//            }
//
//
//        }
//
//    }
//}


    public static void main (String[] args) {
        int size = 9;    // size of the board

        for (int row = 1; row <= size; row++) {
            boolean isEven = false;
            String printRow = "";
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
                isEven = true;

            }
            for (int col = 1; col <= size; col++) {

                if (isEven) {
                    printRow = printRow + " T";
                    isEven = false;
                } else {
                    isEven = true;
                    printRow = printRow+ "F";
                }
            }
            System.out.println(printRow);
        }
    }




}






//public class Day3Pyramids {
//
//    public static void main(String[] args) {

//            // int = counter -> i<=5 = boolean -> i++ =incrementor
//            for (int j = 1; j <=i; j++) {
//                System.out.print("#");
//            }
//            System.out.println(" ");
//        }
//
//
//    }
//
//
//}