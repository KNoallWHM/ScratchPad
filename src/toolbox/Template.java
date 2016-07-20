package toolbox;
// only one main method can be applied to each package

/**
 * Created by Kev on 7/13/16.
 */
public class Template {
    // variable -- access modifier_type_name = value
    public int a = 7; // this is your global variable, always declare before main method

    // definition of int is on line 84 & 58


    //
    public boolean isCat = true;
/// definition on line 66
    //
    double mark = 22.5;
    // definition of double is on line 85 & 64

    String name = "Chaz";
    // definition of string is on line 89

    // main method -- access modefier_return_name_receives->passes value
    public static void main(String[] args) {

    double g = newby(1,2);

    }
//the reason we are using double is becuase we are combining a integer double(which is a decimal number)
    double chaz() {
        return a+mark;
    }
    //complicated for of equation above
    double chaz(int i, double d) {
        double e = i + d;
        return e;
    }
// this. (means global w/ in the class

    public static double newby(int firstNumber, int secondNumber) {

            double z = firstNumber+secondNumber;
        return z;
        }
// everything in the brackets are considered the body

    }



    // PRIMITIVES ->>>


//    byte: The byte type is an 8-bit signed two's complement integer. The range of a byte goes from -128 to 127. It may be useful to use bytes to save memory compared to an int.
//
//    short: The short type is a 16-bit signed two's complement integer. The range of a short goes from -32,768 to 32,767 .
//
//    int: The int type is a 32-bit signed two's complement integer. The default range is two to the power of 31 (minus 1) to negative two to the power of 31. Advanced programmers should note that in Java 8, int can also represent unsigned 32-bit integers. These have a range from 0 to 2 to the power of 32 (minus 1). See the documentation on Integer and Number for more information about how to perform operations on unsigned integers.
//
//    long: The long type is a 64-bit two's complement integer. The signed long has a minimum value of -2 to the power of 63 and a maximum value of 2 to the power of 63 (minus 1). Like int, Java 8 now supports unsigned longs.
//
//    float: The float type is a single-precision 32-bit IEEE 754 floating point.
//
//    double: The double type is a double-precision 64-bit IEEE 754 floating point.
//
//    boolean: The boolean type has only two possible values: true and false. Note that unlike C++, true is not equivalent to 1, and false is not equivalent to 0.
//
//    char: The char type is a single 16-bit Unicode character. We will discuss the char type in more detail when we learn about Strings.




//    VARIABLE DECLARATIONS  ->>>

//    You can store and re-use an expression in a variable. A variable is a container that equals some value. For example, we can create a variable in this variable declaration int x = 5;, and output it with println:

//      MAIN METHOD ->> a very special method to run an application (all it means is this is the main method by which it is executed)

//public class MyProgram {
//    public static void main(String[] args) {

// types of RETURNS; ->

//        int x = 5;  //A variable declaration
//        System.out.println(x);  //This does not output "x", it outputs 5

//        double y = 2.5; //A decimal number equal to 2.5
//        System.out.println(y);

//        String z = "mimi the cat"; //A string (multi-characeter) type
//        System.out.println(z);


    //
// Java has eight primitive types: byte , short , int , long , char , boolean , float and double