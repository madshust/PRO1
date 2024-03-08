
import java.util.Arrays;
import java.util.Scanner;

public class Tasks {

    static Scanner input = new Scanner(System.in);

    public static void task1() {
        // a:
        int arrayA[] = new int[10];
        System.out.println("Array A is: " + Arrays.toString(arrayA));

        // b:
        int arrayB[] = {2, 44, -23, 99, 8, 5, 7, 10, 20, 30};
        System.out.println("Array B is: " + Arrays.toString(arrayB));

        // c:
        int arrayC[] = new int[10];
        for (int i = 0; i < arrayC.length; i++)
            arrayC[i] += i;
        System.out.println("Array C is: " + Arrays.toString(arrayC));

        // d:
        int arrayD[] = new int[10];
        for (int i = 1; i <= arrayD.length; i++)
            arrayD[i - 1] += 2 * i;

        System.out.println("Array D is: " + Arrays.toString(arrayD));

        // e:
        int arrayE[] = new int[10];
        for (int i = 1; i <= arrayE.length; i++)
            // puts the next square number into array
            arrayE[i - 1] += i * i;

        System.out.println("Array E is: " + Arrays.toString(arrayE));

        // f:
        int arrayF[] = new int[10];
        for (int i = 0; i < arrayF.length; i++)
            arrayF[i] = i % 2;

        System.out.println("Array F is: " + Arrays.toString(arrayF));

        int arrayG[] = new int[10];
        for (int i = 0; i < arrayG.length; i++)
            arrayG[i] = i % 5;
        System.out.println("Array G is: " + Arrays.toString(arrayG));

        int arrayH[] = new int[10];
        for (int i = 0; i < arrayH.length; i++) {
            if (i % 2 == 0)
                arrayH[i] = i * 2;
            else
                arrayH[i] = i * 2 + 1;

        }
        System.out.println("Array H is: " + Arrays.toString(arrayH));
    }

    public static void task2() {

        // test af arrays med integers sum metode
        int numbersInt[] = {4, 6, 7, 2, 3};
        System.out.println("Summen af " + Arrays.toString(numbersInt) + " er " + Methods.sum(numbersInt));

        // test af arrays med doubles sum metode
        double numbersDouble[] = {4.5, 6.2, 7.6, 1.2, 30};
        System.out.println("Summen af " + Arrays.toString(numbersDouble) + " er " + Methods.sum(numbersDouble));
    }

    public static void task3() {

        // create arrays for testing
        int[] a = {1, 2, 4, 6, 7, 8, 10, 145};
        int[] b = {1, 2, 5, 45, 30, 10, 11, 150, 130, 9};

        // check if method returns a valid statement ie. does not equal null
        if (Methods.sumArraysEqual(a, b) != null) {
            System.out.println("Summen af " + Arrays.toString(a) + " og " + Arrays.toString(b) + " er ");
            System.out.println(Arrays.toString(Methods.sumArraysEqual(a, b)));
        } else
            System.out.println("De to arrays er forskellige længder");
        System.out.println();

        // test ny metode hvor summen er ligegyldig
        System.out.println("Summen af " + Arrays.toString(a) + " og " + Arrays.toString(b) + " er ");
        System.out.println(Arrays.toString(Methods.sumArrays(a, b)));


    }

    public static void task4() {

        int[] a = {2, 2, 2, 6};
        System.out.println(Methods.hasUneven(a));

    }

    public static void task7_5() {

        // make new array to store user inputs
        int[] numbers = new int[10];

        System.out.println("Please enter 10 digits: ");
        // get user input 10 digits and store in array numbers
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The array " + Arrays.toString(numbers) + " contains");
        System.out.println("Even digits: " + Methods.numberOfEvenDigits(numbers));
        System.out.println("Odd digits: " + Methods.numberOfOddDigits(numbers));


    }

    public static void task7_3() {
        // variables
        int[] numbers = new int[2]; // array to store inputs from user
        int max = 0; // int max value - will be set by user
        int size = 0; // size of array
        int num = 1; // can't be zero, since this is termination value

        // program intro
        System.out.println("This program will check how many occurences a number has in an array");
        System.out.println("Please choose the maximum value of each digit: ");
        max = input.nextInt();
        System.out.println("Please enter digits between 1 and " + max);
        System.out.println("The program will terminate when you enter a 0: ");

        // main input loop, will be terminated with 0
        while (num != 0) {
            num = input.nextInt();
            // check to see if valid input
            if (num >= 0 && num < max) {
                numbers[size] = num;
                size++;
            } else
                System.out.println("Forkert input. Prøv igen:");

            // increase array size incase we need to store more numbers than currently available
            if (size == numbers.length)
                numbers = Methods.increaseArray(numbers);
        }

        Methods.printNumberOfOccurences(numbers, max);
    }


    public static void task6() {
        int[] numbers = {0, 1, 2, 1, 4, 5, 5, 6, 7, 8, 9, 11, 10};

        System.out.println("The array is: " + Arrays.toString(numbers));
        System.out.println("Switch first and last digit: " + Arrays.toString(Methods.switchFirstLastDigit(numbers)));
        System.out.println("Replace even digits with zero: " + Arrays.toString(Methods.replaceEvenWithZero(numbers)));
        System.out.println("The second higest digit of the array is: " + Methods.getSecondHighestDigit(numbers));
        System.out.println("The elements in the array are ascending? : " + Methods.isAscending(numbers));
        System.out.println("The array is: " + Arrays.toString(numbers));
        System.out.println("The array shifted one to the right: " + Arrays.toString(Methods.shiftRight(numbers)));
        System.out.println("There are duplicates in the array? " + Methods.hasDoublets(numbers));

    }

}
