import java.util.Scanner;


public class Tasks {

    static Scanner input = new Scanner(System.in);

    public static void task1a(){
        // giv metoden en start parameter og en slut parameter
        System.out.println("Summen af alle lige tal er: " + Methods.sumWholeDigits(7,25));

    }

    public static void task1b(){
        // giv metoden en slut parameter
        System.out.println("Summen af alle kvadratal er " + Methods.sumSquareDigits(100));
    }

    public static void task2a(){
        Methods.printPowersOfTwo();
    }


    public static void task2c(){

        System.out.println("This method will add all odd digits in an integer and provide the sum");
        System.out.println("Plese enter an integer larger than 0: ");
        int num = input.nextInt();
        System.out.println("The sum of the odd digits in " + num + " is " + Methods.sumOddDigits(num));

    }


    public static void task6p3(){
        System.out.println("This program will tell you if a number is a palindrome.");
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        if (Methods.isPalindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");

    }
    // futureInvestmentValue =
    // investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
    public static void task6p7(){
        // intro message
        System.out.println("This program will calculate the value of future investments.");
        System.out.println("Please provide the following information: ");

        // get investment
        System.out.println("Investment amount: ");
        double investmentAmount = input.nextDouble();

        // get interest and convert to monthly rate
        System.out.println("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 12;

        // get years
        System.out.println("Number of years: ");
        int years = input.nextInt();

        // counter set to 1 for year 1
        int i = 1;

        // top of table print (12 spaces between years and value)
        System.out.println("------------------------");
        System.out.println("Year            Future Value");

        // loop for each year from 1 up to years
        while (i <= years){
            System.out.print(i + "               ");
            // this is to format the string printed with printf and %
            // in this case .2f means 2 decimals
            // the comma represents a grouping for large numbers
            System.out.printf("%,.2f", Methods.futureInvestmentValue(investmentAmount,monthlyInterestRate,i));
            // new line
            System.out.println();
            i++;
        }
    }

    public static void task6p11(){
        System.out.println("This program will return a table of commissions for different sales amounts");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Sales amount                    Commission");

        // sales amount variable. Starts at 1000
        double salesAmount = 1000;
        while (salesAmount <= 20000){
            System.out.println(salesAmount + "                          " + Methods.computeCommission(salesAmount));
            salesAmount += 1000;
        }

    }
}
