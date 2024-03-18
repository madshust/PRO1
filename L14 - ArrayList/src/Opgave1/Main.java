package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(List.of("Hans","Viggo","Jens","Bente","Bent"));
        System.out.println(arr.size());
        arr.add(2,"Jane");
        System.out.println(arr);
        arr.remove(1);
        arr.add(0,"Pia");
        arr.add("Ib");
        System.out.println(arr.size());
        arr.set(2,"Hansi");
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println("--------------------------------");
        for (int i = 0; i < arr.size(); i++){
            String value = arr.get(i);
            System.out.println(value.length());
        }
        System.out.println("--------------------------------");
        for(String value : arr){
            System.out.println(value.length());
        }
    }
}
