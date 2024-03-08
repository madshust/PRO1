package pig;


import java.util.Scanner;

public class PigGame {

    private Player player1 = new Player();
    private Player player2 = new Player();

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

    }

    public void printWinner(){
        if (player1.hasWon())
            System.out.printf("%s has won with a score of %d to %d", player1.getPlayerName(),player1.getTotalSum(),player2.getTotalSum());
        else
            System.out.printf("%s has won with a score of %d to %d", player2.getPlayerName(),player2.getTotalSum(),player1.getTotalSum());
    }

    public void printRules(){
        System.out.println("=====================================================");
        System.out.println("Rules of Pig:");
        System.out.println("First player throws the dice until he hits a 1.");
        System.out.println("If a 1 is not hit, the number is a added to a running sum.");
        System.out.println("If a 1 is hit, the running sum is set to 0.");
        System.out.println("A player can at anytime choose to stop and the running sum is added to a total");
        System.out.println("When a chosen win condition is hit and the player stops, the game is over and the player has won.");
        System.out.println("=====================================================");

    }
}
