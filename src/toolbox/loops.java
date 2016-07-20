package toolbox;

/**
 * Created by katiebunnell on 7/12/16.
 */
public class loops {
    public class Loops {

        //Covers 'while loops', 'for loops', and do-while loops'.

        int [] numbers = {10, 20, 30, 40, 50};

        // while loops: Repeats a statement or group of statements while a given condition is true. It tests the condition
        // before executing the loop body.
        public void whileLoop() {
            int i = 0;
            //infinite loop
            while( i < numbers.length) {
                System.out.println("The number is: "+numbers[i]);
                i++;


            }
        }


        // for loops: Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.
        public void forLoop() {
            for(int i = 0; i < numbers.length; i++) {
                    System.out.println("The number is: "+numbers[i]);
            }
        }

        public void enhancedForLoop() {
            for(int num : numbers) {
                System.out.println("the number is:"+num);
            }

        }


        //do-while loops: Like a while statement, except that it tests the condition at the end of the loop body
        public void doWileLoop() {
            int i = 0;
            do {
                System.out.println("The number is: " + numbers[i]);
                i++;
            } while(i < numbers.length);

        }
    }
}
