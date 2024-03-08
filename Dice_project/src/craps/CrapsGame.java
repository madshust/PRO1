package craps;

public class CrapsGame {
    public static void main(String[] args) {

        Player player = new Player();
        System.out.println("Playing Crabs.");
        printRules();
        player.play();

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
