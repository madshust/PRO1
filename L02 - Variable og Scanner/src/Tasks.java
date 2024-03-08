import java.util.Locale;
import java.util.Scanner;

public class Tasks {

    public static void task2() {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        System.out.println("Opgave 2:");
        System.out.println("String ord1 indeholder ordet: " + ord1 + " og ord2 indeholder ordet: " + ord2);

        //a) Færdiggør programmet så det udskriver ord1 med store bogstaver
        System.out.println("Opgave 2a:");
        System.out.println(ord1.toUpperCase());

        //b) Færdiggør programmet så det udskriver ord2 med små bogstaver.
        System.out.println("Opgave 2b:");
        System.out.println(ord2.toLowerCase());

        //c) Færdiggør programmet så det sammensætter ord1 og ord2 med et mellemrum imellem og
        //udskriver resultatet
        System.out.println("Opgave 2c:");
        System.out.println(ord1 + " " + ord2);

        //d) Færdiggør programmet så det i en ny streng, ord3, sammensætter ord1 og ord2, hvor ord2 er
        //med små bogstaver. Udskriv resultatet.

        String ord3 = ord1 + ord2.toLowerCase();
        System.out.println("Opgave 2d:");
        System.out.println("String ord3 indeholder: " + ord3);

        //e) Udskriv længden af strengen fra opgave d).
        System.out.println("Opgave 2e:");
        System.out.println(ord3.length());

        //f) Udskriv de første 7 bogstaver af ord1.
        System.out.println("Opgave 2f:");
        for (int i = 0; i < 7; i++) {
            System.out.print(ord1.charAt(i));
        }

        //g) Udskriv bogstav 3-7 fra ord2.
        System.out.println();
        System.out.println("Opgave 2g:");
        for (int i = 2; i < 7; i++) {
            System.out.print(ord2.charAt(i));

        }

        //h) Udskriv den sidste halvdel af strengen fra opgave d).
        System.out.println();
        System.out.println("Opgave 2h:");
        int lastHalf = (ord3.length()) / 2;
        for (int i = lastHalf; i < ord3.length(); i++) {
            System.out.print(ord3.charAt(i));
        }

    }




    static Scanner input = new Scanner(System.in);

    public static void task2p6()
    // (Sum the digits in an integer) Write a program that reads an integer between 0
    //and 1000 and adds all the digits in the integer. For example, if an integer is 932,
    //the sum of all its digits is 14.
    {
        System.out.println("Indtast et heltal mellem 0 og 1000: ");
        int helTal = input.nextInt();
        if (helTal >= 0 && helTal < 1000) {
            System.out.println("Summen af tallene i tallet er: " + ((helTal % 10) + (helTal / 10 % 10) + (helTal / 100)));
        }
        else {
            System.out.println("Tallet skal være mellem 0 og 1000!!");
        }
    }

    public static void task2p7()
    {
        //(Find the number of years) Write a program that prompts the user to enter the
        //minutes (e.g., 1 billion), and displays the maximum number of years and remaining
        //days for the minutes. For simplicity, assume that a year has 365 days. Here is
        //a sample run:
        System.out.println("Indtast et antal af minutter: ");
        int min = input.nextInt();
        int day = min/60/24;
        int year = day/365;
        int dayRemaining = day%365;
        System.out.println(min + " minutter er cirka " + year + " år og " + dayRemaining + " dage");
    }

    public static void task2p23()
    {
        //(Cost of driving) Write a program that prompts the user to enter the distance to
        //drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
        //then displays the cost of the trip.

        // Variabler

        double distance;
        double kmLiter;
        double prisLiter;
        double samletPris;

        System.out.print("Benzinprogram\nIndtast venligst distance i kM:");
        distance = input.nextDouble();

        System.out.print("Indtast din bils kM/L: ");
        kmLiter = input.nextDouble();

        System.out.print("Indtast den nuværende pris pr. liter i kroner: ");
        prisLiter = input.nextDouble();
        samletPris = (distance/kmLiter)*prisLiter;

        System.out.println("Prisen for turen er " + samletPris + "kr.");


    }

}
