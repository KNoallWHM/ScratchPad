package week2.day3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Superduo on 7/20/16.
 */
public class Day3RockPaperScissors {


    private String playerChoice = "[me/computer]";
    private String weaponChoice1 = "Rock";
    private String weaponChoice2 = "Paper";
    private String weaponChoice3 = "Scissors";


    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
    Random random = new Random();
        int input;
        int rand = 1;

        System.out.println("pick 1, 2, or 3");
        System.out.println("rock:(1), paper:(2), Scissors");

    }

    public static int randomInt2(int min, int max) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;



    }



//        Day3RockPaperScissors d3rps = new Day3RockPaperScissors();
//        d3rps.setPlayerChoices();
//        d3rps.decideWinner();
//    }

    private void setPlayerChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who are you?");
        System.out.println("are you me or computer?");
        playerChoice = scanner.nextLine();
        while (!((playerChoice.equalsIgnoreCase("[me/computer]") && (((weaponChoice1.equalsIgnoreCase("rock")) || ((weaponChoice2.equalsIgnoreCase("paper")) || weaponChoice3.equalsIgnoreCase("scissors"))))))) {
            if (playerChoice.equalsIgnoreCase("[me/computer")) {

                System.out.println("okay me, choose your weapon [rock/paper/scissors]");
            } else {
                System.out.println("okay computer choose your weapon [rock/paper/scissors]");
            }
            playerChoice = scanner.nextLine();



            // The game should then randomly select the computer's (player 2) selection
            //     (hint: should be a different selection than player 1)

        }


    }

    private void decideWinner() {
        Scanner scanner = new Scanner(System.in);


        if (playerChoice.equalsIgnoreCase("[me/computer]") && (weaponChoice1.equalsIgnoreCase("rock"))) {
            System.out.println("Player: rocks vs computer: scissors -------p.");
        } else if (playerChoice.equalsIgnoreCase("[me/computer]") && (weaponChoice2.equalsIgnoreCase("paper"))) {
            System.out.println("paper beats rock.");
        } else if (playerChoice.equalsIgnoreCase("[me/computer") && (weaponChoice3.equalsIgnoreCase("scissors"))) {
            System.out.println("Player :Scissors vs computer: paper -----player wins");

        } else {
            System.out.println("Invalid player type.");

        }
    }
}
        // Using the rules of Rock-Paper-Scissors, decide which player wins
        //    (rule: rock beats scissors)
        //    (rule: paper beats Rock)
        //    (rule: scissors beats Paper)

        // Print out who won in this format: "Player: ROCK vs Computer: SCISSORS ----- PLAYER WINS"

    // How will you make computer's selection random?
    //    (hint: you have already done this in several programs
