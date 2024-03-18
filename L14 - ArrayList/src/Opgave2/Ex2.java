package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sum1(ints);
        System.out.println("Sum: " + total);

        // Test of sum() method: correct sum is 61.
        total = sum(ints);
        System.out.println("Sum: " + total);

        // Test of minimum() method: correct minimum is -16.
        System.out.println(minimum(ints));


        // Test of maximum() method: correct maximum is 45.
        System.out.println(maximum(ints));


        // Test of average() method: correct average is 7.625.
        System.out.println(average(ints));

        // Test of zeroes() method: correct number of zeroes is 2.
        System.out.println(zeroes(ints));

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        System.out.println(evens(ints));
    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        return sum;
    }

    public static int minimum(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int value : list)
            if (value < min)
                min = value;

        return min;
    }

    public static int maximum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int value : list)
            if (value > max)
                max = value;
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        double avg = 0;
        for (int value : list)
            avg += value;
        return avg/list.size();
    }


    public static int zeroes(ArrayList<Integer> list){
        int zeroes = 0;
        for (int value : list)
            if (value == 0)
                zeroes++;
        return zeroes;
    }

    public static ArrayList<Integer> evens(ArrayList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int value : list)
            if (value % 2 == 0)
                arr.add(value);
        return arr;
    }
}
