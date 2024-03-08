import jdk.jfr.Frequency;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class Methods {
    public static int sum(int[] numbersInt) {
        int sum = 0;
        for (int value : numbersInt)
            sum += value;

        return sum;
    }

    public static double sum(double[] doublesInt) {
        double sum = 0.0;
        for (double value : doublesInt)
            sum += value;

        return sum;
    }

    public static int[] sumArraysEqual(int[] a, int[] b) {

        // create new array for storing sum
        int[] sum = new int[a.length];
        // check for same length
        if (a.length == b.length) {
            // go through array and add a and b indexes together and store in sum
            for (int i = 0; i < a.length; i++) {
                sum[i] = a[i] + b[i];
            }
        } else
            return null;

        return sum;
    }

    public static int[] sumArrays(int[] a, int[] b) {
        // Check if array a is larger than b
        if (a.length >= b.length) {
            // make sum array with size of a, since a is largest
            int[] sum = new int[a.length];

            // go through array a
            for (int i = 0; i < a.length; i++) {
                // check to see if we have met the bounds of b, the smallest array
                if (i < b.length)
                    sum[i] = a[i] + b[i];
                    // if we have the bound, just add the current index value of a to sum
                else
                    sum[i] = a[i];
            }
            // return our new sum array
            return sum;

        } else {
            // make sum array with the size of b, since b is largest
            int[] sum = new int[b.length];
            // go through array b
            for (int i = 0; i < b.length; i++) {
                // check to see if we have met the bounds of a, the smallest array
                if (i < a.length)
                    sum[i] = a[i] + b[i];
                    // if we have met the bound, just add the current index value of b to sum
                else
                    sum[i] = b[i];
            }
            // return our new sum array
            return sum;

        }

    }

    public static boolean hasUneven(int[] numbers) {

        for (int value : numbers)
            if (value % 2 != 0)
                return true;
        return false;

    }

    public static int numberOfOddDigits(int[] numbers) {
        int odd = 0;

        for (int value : numbers)
            if (value % 2 != 0)
                odd++;
        return odd;
    }

    public static int numberOfEvenDigits(int[] numbers) {
        int even = 0;

        for (int value : numbers)
            if (value % 2 == 0)
                even++;
        return even;
    }

    public static void printNumberOfOccurences(int[] numbers, int max) {

        // make new array with a size of max
        int[] frequency = new int[max];

        for (int value : numbers) {
            if (value > 0)
                frequency[value]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                if (frequency[i] == 1) {
                    System.out.printf("The number%3d appears%2d time%n", i, frequency[i]);
                } else
                    System.out.printf("The number%3d appears%2d times%n", i, frequency[i]);

            }
        }
    }

    public static int[] increaseArray(int[] currentArray) {
        int[] largerArray = new int[currentArray.length * 2];

        for (int i = 0; i < currentArray.length; i++) {
            largerArray[i] = currentArray[i];
        }

        return largerArray;
    }

    public static int[] switchFirstLastDigit(int[] numbers) {

        // make new array equal to our current array
        // .clone() is used since this copies the array while a[] = b[] makes a reference? they become the same object,
        // so manipulating this array also manipulates the original array, which we DONT want.
        int[] array = numbers.clone();

        array[0] = numbers[numbers.length - 1];
        array[numbers.length - 1] = numbers[0];

        return array;
    }

    public static int[] replaceEvenWithZero(int[] numbers) {

        int[] array = numbers.clone();

        // iterate through array
        for (int i = 0; i < numbers.length; i++) {
            // check if even number, if it is, replace with zero
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }

        }
        return array;
    }

    public static int getSecondHighestDigit(int[] numbers) {
        // make largest equal to first index value
        int largest = numbers[0];
        // make second largest as small as possible, since it should always be smaller than largest
        int secondLargest = MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // check to see if index value is larger than largest
            if (numbers[i] > largest || numbers[i] > secondLargest) {
                // if it is, put largest to second largest and make index value our new largest
                secondLargest = largest;
                largest = numbers[i];
            }
        }


        return secondLargest;
    }

    public static boolean isAscending(int[] numbers) {

        // start iteration at 1, check to see if next value is larger than previous
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1])
                return false;
        }

        return true;
    }

    public static int[] shiftRight(int[] numbers) {

        int[] array = new int[numbers.length];

        // set first index of array to last index of numbers
        array[0] = numbers[numbers.length-1];

        // loop through rest of array and shift to the right, where we start at 1 since we have already
        // set index[0]
        for (int i = 1; i < array.length; i++)
                array[i] = numbers[i-1];

        return array;
    }

    public static boolean hasDoublets(int[] numbers){

        // first loop, to go iterate through array
        for (int i = 0; i < numbers.length; i++)
            // second loop, to compare the value with all other values
            for (int j = 1; j < numbers.length; j++)
                // make sure the index is not the same, and check to see if an equal value is present
                // in array
                if (i != j && numbers[i] == numbers[j])
                    return true;

        return false;

    }

}

