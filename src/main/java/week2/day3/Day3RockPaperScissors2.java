package week2.day3;

import toolbox.Switches;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Superduo on 7/20/16.
 */
public class Day3RockPaperScissors2 {

    int Y = 8;
    int N = 9;
    private ArrayList<String> wins = new ArrayList<>();
    private ArrayList<String> tools = new ArrayList<>();

    private String player1Choice;
    private String player2Choice;


    public static void main(String[] args) {

        Day3RockPaperScissors2 d3rps = new Day3RockPaperScissors2();
        for (int i = 0; i < 10; i++) {
            d3rps.setPlayers();
            d3rps.printStats();

        }
    }


    private void setPlayers() {
        player1Choice = randomSelection();
        player2Choice = randomSelection();
    }



    // Scanner Kev = new Scanner(System.in);

    public void setWinner() {



    Switches switches = new Switches();
    System.out.println("Kevin uses resources");

    System.out.println("Pick 1,2, or 3 for:");
    System.out.println("ROCK (1), PAPER(2), or SCISSOR (3)");
    //int input;
    //input = Kev.nextInt();
    Random rnd = new Random();
    int randomNumber = rnd.nextInt(3 - 2 + 1) + 1;


    int Rock = 1;
    int Paper = 2;
    int Scissor = 3;

    {



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
        int N = 9;
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


    private void printStats() {
        int player1WinsCount = 0;
        int player2WinsCount = 0;
        int tieWinsCount = 0;
        for(String winner: wins) {
            switch (winner) {
                case "player" : player1WinsCount++; break;
                case "computer" : player2WinsCount++; break;
                default : tieWinsCount++; break;
            }
        }
        System.out.println("Player 1 Wins: "+player1WinsCount);
        System.out.println("Player 2 Wins: "+player2WinsCount);
        System.out.println("Ties: "+tieWinsCount);
        int rockCount = 0;
        int paperCount = 0;
        int scissorsCount = 0;
        for(String tool : tools) {
            switch (tool) {
                case "rock" : rockCount++; break;
                case "paper" : paperCount++; break;
                case "scissors" : scissorsCount++; break;
            }
        }
        System.out.println("Rock Used: "+rockCount+" times");
        System.out.println("Paper Used: "+paperCount+" times");
        System.out.println("Scissors Used: "+scissorsCount+" times");
    }


    public String randomSelection() {
        int min = 1;
        int max = 3;
        String randomSelection;
        Random random = new Random();
//        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) +1) +min;
        if(randomNumber == 1) {
            randomSelection = "rock";
        } else if (randomNumber == 2) {
            randomSelection = "paper";
        } else {
            randomSelection = "scissors";
        }
        tools.add(randomSelection);
        return randomSelection;
    }
}
