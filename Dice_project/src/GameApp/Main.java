package GameApp;

import craps_extended.CrapsGame;
import pig_extended.PigGame;

import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    private static int game;
    private static String[] games = {"Craps", "Pig"};

    public static void main(String[] args) {
        menu();

        if (game == 0){
            CrapsGame crapsGame1 = new CrapsGame();
            crapsGame1.play();
        }
        else if (game == 1){
            PigGame pigGame1 = new PigGame();
            pigGame1.play();
        }


    }

    public static void menu(){

        String titel = "Welcome to Game App";


        System.out.println("==============================================");
        System.out.printf("%30s \n", titel);
        System.out.println("==============================================");
        System.out.print("\n\n\n");
        System.out.printf("%-10s %-15s %-10s\n","Game","Game number","Number of players");
        System.out.printf("%-10s %-15s %-10s\n", games[0],0, 1);
        System.out.printf("%-10s %-15s %-10s\n", games[1],1, 2);
        System.out.println("Please enter the game number for the game you want to play?");
        game = input.nextByte();


    }
}
