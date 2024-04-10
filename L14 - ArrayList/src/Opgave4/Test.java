package Opgave4;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(0);
        ints.add(15);
        ints.add(15);
        ints.add(14);
        ints.add(-15);
        ints.add(4);


        System.out.println(ints);
        System.out.println("switchFirstLast(ints) = " + switchFirstLast(ints));
        System.out.println("replaceEvenWithZero(ints) = " + replaceEvenWithZero(ints));
        System.out.println("getSecondHighest(ints) = " + getSecondHighest(ints));

        ArrayList<Integer> ascending = new ArrayList<>();
        ArrayList<Integer> descending = new ArrayList<>();
        ascending.addAll(List.of(1, 2, 3, 4, 5, 10));
        descending.addAll(List.of(10, 9, 8, 7, 10));

        System.out.println("isAscending(ascending) = " + isAscending(ascending));
        System.out.println("isAscending(descending) = " + isAscending(descending));
        System.out.println("shiftRight(ints) = " + shiftRight(ints));
        System.out.println("hasDoublets(ints) = " + hasDoublets(ints));
        System.out.println("hasDoublets(ascending) = " + hasDoublets(ascending));

    }

    public static ArrayList<Integer> switchFirstLast(ArrayList<Integer> list) {
        ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();

        temp.set(0, list.get(list.size() - 1));
        temp.set(temp.size() - 1, list.get(0));

        return temp;
    }

    public static ArrayList<Integer> replaceEvenWithZero(ArrayList<Integer> list) {
        ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();

        for (int i = 0; i < temp.size(); i++)
            if (list.get(i) % 2 == 0)
                temp.set(i, 0);
        return temp;
    }

    public static int getSecondHighest(ArrayList<Integer> list) {
        ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();
        int max = getHighest(temp);

        temp.removeAll(Collections.singleton(max));

        return getHighest(temp);
    }

    public static int getHighest(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int value : list)
            if (value > max)
                max = value;

        return max;
    }

    public static boolean isAscending(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1) || list.get(i) == list.get(i - 1))
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> shiftRight(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(0, list.getLast());
        for (int i = 1; i < list.size(); i++) {
            temp.add(i, list.get(i - 1));
        }

        return temp;
    }

    public static boolean hasDoublets(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            for (int j = 0; j < list.size(); j++)
                if (i != j && list.get(i) == list.get(j))
                    return true;
        return false;
    }

}
