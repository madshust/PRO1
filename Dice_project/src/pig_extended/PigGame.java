package pig_extended;


import java.util.Scanner;

public class PigGame {

    private Player player1 = new Player();
    private Player player2 = new Player();
    private int winCondition = 0;

    static Scanner input = new Scanner(System.in);


    public void play(){
        printRules();
        intro();

        while (!player1.hasWon() && !player2.hasWon()) { // plays until one of the players has won
            player1.turn();
            if (!player1.hasWon()) { // checks if player1 has won before moving on to player 2
                player2.turn();
            }
        }

        printWinner();
    }

    public void intro(){

        System.out.println("Welcome to Pig Game.");
        System.out.print("Please enter the name of player1: ");
        player1.setPlayerName(input.nextLine());
        System.out.print("Please enter the name of player2: ");
        player2.setPlayerName(input.nextLine());
        System.out.print("Please enter the win condition as an integer: ");
        winCondition = input.nextInt();
        player1.setWinCondition(winCondition); // sets winCondition for player1
        player2.setWinCondition(winCondition); // sets winCondition for player2

    }

    public void printWinner(){
        System.out.println();
        System.out.println("=====================================================");
        if (player1.hasWon())
            System.out.printf("%s has won with a score of %d to %d\n", player1.getPlayerName(),player1.getTotalSum(),player2.getTotalSum());
        else
            System.out.printf("%s has won with a score of %d to %d\n", player2.getPlayerName(),player2.getTotalSum(),player1.getTotalSum());

        System.out.printf("%s's average roll counts: %.2f\n", player1.getPlayerName(),player1.averageRolls());
        System.out.printf("%s's average roll counts: %.2f\n", player2.getPlayerName(),player2.averageRolls());
        System.out.println("=====================================================");
    }

    public void printRules(){
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("Rules of Pig:");
        System.out.println("The player throws the dice. If a 1 is hit on either die, the running sum is set to 0");
        System.out.println("If both die are 1's, both the running Sum and total Sum is reset to 0");
        System.out.println("Else, the sum of the dice are added to the running sum");
        System.out.println("The player can at anytime choose to stop his turn, and then the running sum will be added to the total sum");
        System.out.println("The game ends when the win condition is met for one of the players");
        System.out.println("=====================================================");

    }

}
