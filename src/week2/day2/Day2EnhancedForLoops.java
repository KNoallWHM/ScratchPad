package week2.day2;

/**
 * Created by Superduo on 7/19/16.
 */
public class Day2EnhancedForLoops {
// build a private static char array with the values a,b,c,d,e,f,g, and h
    private static char[] letters = {'a','b','c','d','e','f','g','h'};

    public static void main(String[] args) {

        forloop(letters);
        System.out.println(" ");
        System.out.println("---");
        enhancedForLoop(letters);
    }

    // create a method named 'forLoop' that prints out all the values of the char array using a standard for-loop

    public static void forloop(char[] letters) {

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

    }

    // create a method named 'enhancedForLoop' that prints out all the values of the char array using an enhanced for-loop

    public static void enhancedForLoop(char[] letters) {

        for (char letter : letters) {
            System.out.println(letter);
        }
    }

}
