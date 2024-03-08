package rolltwodice;

import java.util.Scanner;

public class Player {
    private Die die1;
    private Die die2;
    private int rollCount = 0;
    private int[] resultsDie1 = new int[2];
    private int[] resultsDie2 = new int[2];


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
        }

        resultsDie1[rollCount] = die1.getFaceValue();
        resultsDie2[rollCount] = die2.getFaceValue();

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

    public int sameEyes() {
        int sameEyes = 0;
        for (int i = 0; i < resultsDie1.length; i++)
            if ((resultsDie1[i] == resultsDie2[i]) && resultsDie1[i] != 0)
                sameEyes++;

        return sameEyes;
    }

    public int totalSum() {
        int sum = 0;
        for (int i = 0; i < resultsDie1.length; i++){
            sum += resultsDie1[i] + resultsDie1[i];
        }
        return sum;
    }

    public int maxSum() {
        int maxSum = 0;

        for (int i = 0; i < resultsDie1.length; i++) {
            int sum = resultsDie1[i] + resultsDie2[i];
            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

    public void printNumberOfOccurences(){
        int[] frequency = new int[7]; // array from 0 to 6;

        // results of die 1
        for (int value : resultsDie1)
            if (value > 0)
                frequency[value]++;
        // results of die 2
        for (int value : resultsDie2)
            if (value > 0)
                frequency[value]++;

        System.out.println("Number of occurence of each digit: ");
        for (int i = 1; i < frequency.length; i++)
            System.out.println(i + "'s: " + frequency[i]);
    }

    public double averageSum(){

        return totalSum()/ rollCount;
    }


    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDice();
            System.out.printf("Rolling... %d & %d = %d\n", die1.getFaceValue(), die2.getFaceValue(), getSum());
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
    }
}
