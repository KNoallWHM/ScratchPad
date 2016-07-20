package week2.day3;

import toolbox.Switches;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Superduo on 7/20/16.
 */
public class Day3RockPaperScissors2 {

    int Y = 8;
    int N = 9;




    /* Name of the class has to be "Main" only if the class is public. */

        public static void main(String[] args) {

            Scanner Kev = new Scanner(System.in);


            Switches switches = new Switches();
            System.out.println("Kevin uses resources");

            System.out.println("Pick 1,2, or 3 for:");
            System.out.println("ROCK (1), PAPER(2), or SCISSOR (3)");
            int input;
            input = Kev.nextInt();
            Random rnd = new Random();
            int randomNumber = rnd.nextInt(3 - 2 +1) +1;


            int Rock = 1;
            int Paper = 2;
            int Scissor = 3;   {





    //public void intSwitch(int rock) {

        switch (Rock) {

            case 1:
                System.out.println("Player :rock vs Computer: rock, it's a  TIE. ----- everyone looses");
                break;
            case 2:
                System.out.println("Player: rock vs Computer paper: ----- computer wins");
                break;
            case 3:
                System.out.println("Player: rock vs Computer scissor: ----- Player win");
                break;

        }
    }

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

   // int Paper;{
        switch (Paper) {
            case 1:
                System.out.println("paper vs rock: You Win");
                break;
            case 2:
                System.out.println("paper vs paper: TIE");
                break;
            case 3:
                System.out.println("paper vs scissor: You Lose");
                break;
        }

    //int scissor; {
        switch (Scissor) {
            case 1:
                System.out.println("scissor vs rock: You Lose");
                break;
            case 2:
                System.out.println("scissor vs paper: You Win");
                break;
            case 3:
                System.out.println("scissor vs scissor: TIE");
                break;
        }
        int Y = 8;
                int N= 9;
        System.out.println("Do you want to play again? Y(8)/N(9)");


             ;
            switch (Y) {
                case 1:
                    System.out.println("rock, paper, scissor");



                    switch (N) {
                        case 1:
                            System.out.println("rock, paper, scissor");
                            break;
                        case 2:
                            System.out.println("Goodbye");
                    }
                }
            }
        }

//        if(input==){
//
//            System.out.println("Rock, Paper,SCISSOR");
//        }
//        else if(input==N)
//        {System.exit(0);
//            System.out.println("GOODBYE");









            // This method is an example of a very simple case
