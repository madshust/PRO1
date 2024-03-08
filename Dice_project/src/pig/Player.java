package pig;


import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);

    private Die die;
    private int rollCount = 0;
    private int[] resultsdie = new int[2];
    private String playerName;
    private int totalSum;
    private int runningSum;
    private int winCondition = 100;

    public Player() {
        this.die = new Die();
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }


    public int getRollCount() {
        return rollCount;
    }

    public void throwDie() {
        die.roll();

        if (rollCount == resultsdie.length)
            resultsdie = increaseArray(resultsdie);

        resultsdie[rollCount] = die.getFaceValue();

        rollCount++;
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

    // returns true if totalSum is larger or equals winCondition
    public boolean hasWon(){
        return totalSum >= winCondition;
    }

    // turn for the two players
    public void turn(){
        boolean finished = false; // once a turn is finished, this variable will be set to true
        System.out.print(playerName + "'s turn to throw. ");
        if (totalSum > 0) // doesnt print this statement when the totalSum is 0.
            System.out.println("You current total is " + totalSum);
        System.out.println("Press enter to roll"); // just to get a prompt so the game starts when a player hits a button
        input.nextLine();

        while (!finished) {
            throwDie(); // throw die
            System.out.printf("Rolling... %d\n", die.getFaceValue()); // print die result

            if (die.getFaceValue() == 1) { // checks if a 1 is hit, if it is, the turn is over and runningSum is reset
                runningSum = 0;
                finished = true;
            }
            else{ // in all other cases than a 1
                runningSum += die.getFaceValue(); // add the result to runningSum
                System.out.println("Do you want to roll again? (Y/n) Your current sum is " + runningSum );
                String again = input.nextLine(); // prompts for another throw, if a "n" is not given, the while loop will start over

                if (again.toLowerCase().equals("n")){ // check if user chooses to stop
                    totalSum += runningSum; // runningSum added to totalSum
                    runningSum = 0; // reset runninSum after saving value
                    finished = true;
                }
            }
        }
    }
}
