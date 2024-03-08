import java.util.ArrayList;
import java.util.Scanner;
import Files.StarsApp;

public class Tasks {
    static Scanner input = new Scanner(System.in);

    public static void task1_1() {
        Methods.printOddNumbers(99);
    }

    public static void task1_2() {
        Methods.printMultiplesOf3(300);
    }

    public static void task2_a() {
        System.out.println("Please enter how many numbers you want to check: ");
        // get size
        int size = input.nextInt();

        System.out.println("Please enter a digit between 1 and 99: ");

        // init variables
        int odd = 0;
        int even = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < size; i++) {
            // get num input
            int num = input.nextInt();
            // check if num is between 1 and 99
            if (num > 0 && num <= 99) {

                // only does this once to ensure min is auto set to the first number
                if (min == 0)
                    min = num;
                // find minimum value
                if (num < min)
                    min = num;
                // find maximum value
                if (num > max)
                    max = num;
                // find number of odd digits
                if (num % 2 != 0)
                    odd++;
                // find number of even digits
                else
                    even++;
            } else
                System.out.println("Forkert input.");
        }
        System.out.println("The highest number is: " + max);
        System.out.println("The lowest number is: " + min);
        System.out.println("The number of odd digits is: " + odd);
        System.out.println("The number of even digits is: " + even);
    }

    public static void task2_b() {
        System.out.println("Please enter how many numbers you want to check: ");
        // get size
        int size = input.nextInt();

        System.out.println("Please enter a digit between 1 and 99: ");

        // init variables
        int sum = 0;

        for (int i = 0; i < size; i++) {
            // get num input
            int num = input.nextInt();
            // check if num is between 1 and 99
            if (num > 0 && num <= 99) {
                sum += num;
                System.out.println("Den løbende sum er: " + sum);

            } else
                System.out.println("Forkert input.");
        }


    }

    public static void task2_c() {
        System.out.println("Please enter how many numbers you want to check: ");
        // get size
        int size = input.nextInt();

        System.out.println("Please enter a digit between 1 and 99: ");

        // init variables
        int max = 0;
        int counter = 0;

        for (int i = 0; i < size; i++) {
            // get num input
            int num = input.nextInt();
            // check if num is between 1 and 99
            if (num > 0 && num <= 99) {
                if (num > max) {
                    max = num;
                    counter = 0;
                    counter++;

                } else if (num == max)
                    counter++;

            } else
                System.out.println("Forkert input.");

        }
        System.out.println("Det største tal er " + max + " og det forekommer " + counter + " gange");
    }

    public static void task2_d_array() {
        System.out.println("Please enter how many numbers you want to check: ");
        // get size and make array with size
        int size = input.nextInt();

        // make array to hold numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        // make array to hold recurring numbers
        ArrayList<Integer> recurringNumbers = new ArrayList<>();

        System.out.println("Please enter a digit between 1 and 99: ");

        for (int i = 0; i < size; i++) {
            // get num input and store in numbers
            numbers.add(input.nextInt());
            // check if num is between 1 and 99
            if (numbers.get(i) > 0 && numbers.get(i) <= 99) {
                // check for cases where i is larger than 1, since at 0 there can never be a
                // recurring number - this also enables our (i-1) logic.
                if (i > 0) {
                    // check if the value of numbers is the same as the previous
                    if (numbers.get(i) == numbers.get(i - 1)) {
                        recurringNumbers.add(numbers.get(i)); // add digit to recurringNumbers array
                        // check if array size has more than one digit
                        if (recurringNumbers.size() > 1) {
                            // check if the newest digit is the same as the previous. If it is, remove the newest digit.
                            if (recurringNumbers.get(recurringNumbers.size()-1) == recurringNumbers.get(recurringNumbers.size()-2))
                                recurringNumbers.remove(recurringNumbers.size()-1);
                        }
                    }
                }

            } else
                System.out.println("Forkert input.");

        }
        for (int i = 0; i < recurringNumbers.size(); i++)
            System.out.print(" " + recurringNumbers.get(i));
    }

    public static void taskStars(){
        StarsApp.starPicture();
    }

    
}


