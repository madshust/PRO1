package Main;

import Files.AdditionQuiz;
import Files.ChildApp;
import Files.StuderendeApp;

import java.util.Random;
import java.util.Scanner;

public class Tasks {

    static Scanner input = new Scanner(System.in);

    public static void task3p2() {
        AdditionQuiz.main(null);
    }

    public static void task2() {
        System.out.print("Indtast et heltal: ");
        int num = input.nextInt();

        if (num > 0)
            System.out.println(num + " er positivt");
        else if (num == 0)
            System.out.println(num + " er nul");
        else
            System.out.println(num + " er negativt");
    }

    public static void task3() {

        // Variable declaration
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Indtast 3 heltal: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2 && num2 < num3)
            System.out.println(num1 + " " + num2 + " " + num3 + " er voksende");
        else if (num1 > num2 && num2 > num3)
            System.out.println(num1 + " " + num2 + " " + num3 + " er aftagende");
        else
            System.out.println(num1 + " " + num2 + " " + num3 + " hverken eller");
    }

    public static void task4() {
        System.out.print("Indtast alder på personen: ");
        int age = input.nextInt();
        System.out.println("En person på " + age + " år skal til: " + ChildApp.institution(age));

    }

    public static void task5() {
        System.out.print("Indtast alder på personen: ");
        // init age variable with user input
        int age = input.nextInt();
        System.out.print("Indtast 1 for dreng og 0 for pige: ");
        // init gender variable with user input
        int genderBin = input.nextInt();
        // init bool variable for storing the 1 and 0 from user
        boolean gender = true;
        String køn = new String();

        if (genderBin == 0) {
            gender = false;
            køn = "pige";
        }
        if (genderBin == 1) {
            gender = true;
            køn = "dreng";
        }


        System.out.println("En " + køn + " på " + age + " år skal på dette hold: " + ChildApp.team(gender, age));

        // System.out.println("En pige på 10 år skal på dette hold: " + ChildApp.team(false, 10));
    }


    public static String task6(int num) {

        String myString = new String();

        if (num > 0)
            myString = "Positivt";
        if (num == 0)
            myString = "Nul";
        if (num < 0)
            myString = "Negativt";

        return myString;
    }

    public static String task7(int num1, int num2, int num3) {
        String myString = new String();

        if (num1 < num2 && num2 < num3)
            myString = "voksende";
        else if (num1 > num2 && num2 > num3)
            myString = "aftagende";
        else
            myString = "hverken eller";

        return myString;
    }

    public static void task8() {
        // create Random class object
        Random random = new Random();

        // generate computer's choice of number
        int computerChoice = random.nextInt(3);
        // init variable for user's choice of number
        int userChoice = 0;
        // init variables for score keeping
        int userPoints = 0;
        int computerPoints = 0;
        do {

            System.out.println("Scissor (0), rock (1), paper (2): ");
            userChoice = input.nextInt();


            switch (userChoice) {
                case 0:
                    if (computerChoice == 0)
                        System.out.println("The computer is scissor. You are scissor. It is a draw.");
                    else if (computerChoice == 1) {
                        System.out.println("The computer is rock. You are scissor. The computer won.");
                        computerPoints++;
                    } else if (computerChoice == 2) {
                        System.out.println("The computer is paper. You are scissor. You won.");
                        userPoints++;
                    }
                    break;
                case 1:
                    if (computerChoice == 0) {
                        System.out.println("The computer is scissor. You are rock. You won");
                        userPoints++;
                    } else if (computerChoice == 1)
                        System.out.println("The computer is rock. You are rock. It is a draw");
                    else if (computerChoice == 2) {
                        System.out.println("The computer is paper. You are rock. The computer won.");
                        computerPoints++;
                    }
                    break;
                case 2:
                    if (computerChoice == 0) {
                        System.out.println("The computer is scissor. You are paper. The computer won.");
                        computerPoints++;
                    } else if (computerChoice == 1) {
                        System.out.println("The computer is rock. You are paper. You won.");
                        userPoints++;
                    } else if (computerChoice == 2)
                        System.out.println("The computer is paper. You are paper. It is a draw.");
                    break;
            }
        }
        while (userPoints < 3 && computerPoints < 3);

        if (userPoints == 3)
            System.out.println("You have won the game with a score of " + userPoints + " to " + computerPoints);
        else if (computerPoints == 3)
            System.out.println("The computer has won the game with a score of " + computerPoints + " to " + userPoints);

    }

    private static void test() {

    }


}
