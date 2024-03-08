package pig_extended;


import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);

    private Die die1;
    private Die die2;
    private int rollCount = 0;
    private int[] resultsDie1 = new int[2];
    private int[] resultsDie2 = new int[2];
    private int[] sum = new int[2];
    private String playerName;
    private int totalSum;
    private int runningSum;
    private int winCondition;
    private int turnCount;

    public Player() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRollCount() {
        return rollCount;
    }

    public void throwDice() {
        die1.roll();
        die2.roll();

        if (rollCount == resultsDie1.length) {
            resultsDie1 = increaseArray(resultsDie1);
            resultsDie2 = increaseArray(resultsDie2);
            sum = increaseArray(sum);
        }

        resultsDie1[rollCount] = die1.getFaceValue();
        resultsDie2[rollCount] = die2.getFaceValue();
        sum[rollCount] = getSum();

        rollCount++;
    }

    public int getSum() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public int[] increaseArray(int[] results) {
        int[] biggerArray = new int[results.length * 2];

        for (int i = 0; i < results.length; i++)
            biggerArray[i] = results[i];

        return biggerArray;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public int getWinCondition() {
        return winCondition;
    }

    public void setWinCondition(int winCondition) {
        this.winCondition = winCondition;
    }

    // returns true if totalSum is larger or equals winCondition
    public boolean hasWon() {
        return totalSum >= winCondition;
    }

    public String getPlayerName() {
        return playerName;
    }

    // returns average number of rolls pr. turn
    public double averageRolls() {
        return (rollCount * 1.0) / (turnCount * 1.0);
    }

    // turn for the two players
    public void turn() {
        turnCount++;
        boolean finished = false; // once a turn is finished, this variable will be set to true
        System.out.println(); // new line
        System.out.print(playerName + "'s turn to throw. ");
        if (totalSum > 0) // doesnt print this statement when the totalSum is 0.
            System.out.println("You current total is " + totalSum);
        System.out.println("Press enter to roll"); // just to get a prompt so the game starts when a player hits a button
        input.nextLine();

        while (!finished) {
            throwDice(); // throw die
            System.out.printf("Rolling... %d & %d = %d\n", die1.getFaceValue(), die2.getFaceValue(), getSum()); // print die result
            if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1) { // checks for both dice being a 1
                runningSum = 0;
                totalSum = 0;
                finished = true;
                System.out.println("Your turn is over,  your total has been reset to 0. Unlucky.");
            } else if (die1.getFaceValue() == 1 || die2.getFaceValue() == 1) { // checks if either die is a 1
                runningSum = 0;
                finished = true;
                System.out.println("Your turn is over, you didn't get any points.");
            } else { // in all other cases than a 1
                runningSum += getSum(); // add the result to runningSum
                System.out.println("Do you want to roll again? (Y/n) Your current sum is " + runningSum);
                String again = input.nextLine(); // prompts for another throw, if a "n" is not given, the while loop will start over

                if (again.toLowerCase().equals("n")) { // check if user chooses to stop
                    totalSum += runningSum; // runningSum added to totalSum
                    System.out.printf("Your turn is over. You got %d points this turn and your current total is now %d \n", runningSum, totalSum);
                    runningSum = 0; // reset runninSum after saving value
                    finished = true;
                }
            }
        }
    }
}
