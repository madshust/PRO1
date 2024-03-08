package rolltwodice;

public class RollTwoDiceGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Playing RollTwoDice.");
        player.play();

        printResults(player);
        System.out.println();

        System.out.println("Thank you for playing RollOneDie.");
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollOneDie:");
        System.out.println("The player throws one die as long as he/she wants.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        System.out.println("Results");
        System.out.println("-------");
        System.out.println("Roll count: " + player.getRollCount());
        System.out.println("Total sum of dice throws: " + player.totalSum());
        System.out.println("Number of equal dice in same throw: " + player.sameEyes());
        System.out.println("Max sum of dice in throws: " + player.maxSum());
        player.printNumberOfOccurences();
        System.out.println("Average sum of throws: " + player.averageSum());
    }


}
