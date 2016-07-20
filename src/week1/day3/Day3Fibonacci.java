package week1.day3;

/**
 * Created by Superduo on 7/14/16.
 */
public class Day3Fibonacci {


//    public static void main(String[] args) {
//
//            int febCount = 15;
//            int[] feb = new int[febCount];
//            feb[0] = 0;
//            feb[1] = 1;
//            for (int i = 2; i < febCount; i++) {
//                feb[i] = feb[i - 1] + feb[i - 2];
//            }
//
//            for (int i = 0; i < febCount; i++) {
//                System.out.print(feb[i] + " ");
//            }
//        }
//    }


//    Output:
//            0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
//

public static void main(String args[]) {
    int n1 = 0, n2 = 1, n3, i, count = 10;
    System.out.print(n1 + " " + n2);//printing 0 and 1

    for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
    {
        n3 = n1 + n2;
        System.out.print(" " + n3);
        n1 = n2;
        n2 = n3;
    }
}
}


