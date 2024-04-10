package P3_5;

import java.util.Scanner;

public class MicrowaveTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Microwave microwave = new Microwave();

        while(true) {

            System.out.println("Press 1 to add 30 seconds");
            System.out.println("Press 2 to change power level");
            System.out.println("Press 3 to start");
            System.out.println("Press 4 to reset");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    microwave.add30();
                    System.out.println("Time is now: " + microwave.getTime().toSeconds());
                    break;
                case 2:
                    microwave.switchPowerLevel();
                    System.out.println("Power level is now: " + microwave.getPowerLevel());
                    break;
                case 3:
                    microwave.start();
                    break;
                case 4:
                    microwave.reset();
                    System.out.println("Time is now: " + microwave.getTime().toSeconds());
                    System.out.println("Power level is now: " + microwave.getPowerLevel());
                    break;

            }
        }
    }
}
