package craps_extended;

import java.util.Scanner;

public class Player {
    private Die die1;
    private Die die2;
    private int rollCount = 0;
    private int[] resultsDie1 = new int[2];
    private int[] resultsDie2 = new int[2];
    private int[] sum = new int[2];
    private int wins;
    private int losses;


    public Player() {
        this.die1 = new Die();
        this.die2 = new Die();
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

    public void printResults(){
       if (wins > 1 || wins == 0)
           System.out.print("You have won " + wins + " games and ");
       else
           System.out.print("You have won " + wins + " game and ");
       if (losses > 1 || losses == 0)
           System.out.println("lost " + losses + " games.");
       else
           System.out.println("lost " + losses + " game.");

    }


    public void play() {

        Scanner scanner = new Scanner(System.in);
        int point = 0;
        int i = 0;
        boolean finished = false;
        String result = "";
        while (!finished) {
            throwDice();
            System.out.println();
            System.out.println("Roll?");
            scanner.nextLine();
            System.out.printf("Rolling... %d & %d = %d\n", die1.getFaceValue(), die2.getFaceValue(), getSum());

            // first throw
            if (i == 0) {
                if (sum[i] == 7 || sum[i] == 11) {
                    result = "won";
                    wins++;
                    finished = true;
                    System.out.println("You have " + result + ".");
                } else if (sum[i] == 2 || sum[i] == 3 || sum[i] == 12) {
                    result = "lost";
                    losses++;
                    finished = true;
                    System.out.println("You have " + result + ".");
                } else {
                    point = sum[i];
                    i++;
                    System.out.println("Your point is " + point);
                }
            }
            // all other throws
            else {
                if (sum[i] == 7){
                    result = "lost";
                    losses++;
                    finished = true;
                    System.out.println("You have " + result + ".");
                }
                else if (sum[i] == point){
                    result = "won";
                    wins++;
                    finished = true;
                    System.out.println("You have " + result + ".");
                }
                else{
                    i++;
                }

            }

        }
        rollCount = 0;
    }

}
