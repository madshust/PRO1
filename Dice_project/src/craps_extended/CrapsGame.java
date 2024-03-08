package craps_extended;

import java.util.Locale;
import java.util.Scanner;

public class CrapsGame {
    Player player = new Player();
    Scanner input = new Scanner(System.in);
    boolean finished = false;


    public void play(){
        printRules();
        while (!finished) {
            player.play();
            System.out.println("Do you want to play again? (Y/n)");
            String again = input.nextLine();
            if (again.toLowerCase().equals("n"))
                finished = true;
        }
        player.printResults();
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Crabs:");
        System.out.println("The player throws the dice. If a 7 or 11 is hit, the player has won.");
        System.out.println("If a 2,3 or 12 is hit, the player has lost.");
        System.out.println("Else, the roll is the players point.");
        System.out.println("The player throws the dice again. If a 7 is hit, the player has lost.");
        System.out.println("If the roll is equal to the players point, the player has won.");
        System.out.println("Else, the player throws the dice again.");
        System.out.println("=====================================================");
    }
}
