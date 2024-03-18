package Opgave2;

import java.util.Scanner;

public class Test {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean finished = false;
        while(!finished) {
            StopWatch watch = new StopWatch();
            System.out.println("Start watch? ");
            String temp = input.nextLine();
            watch.start();
            System.out.println("Stop watch? ");
            temp = input.nextLine();
            watch.stop();
            System.out.println("Elapsed time: " + watch.elapsedTime() + " seconds");
            System.out.println("Again? Y/n");
            temp = input.nextLine();
            if (temp.equalsIgnoreCase("n"))
                finished = true;

        }
    }
}
