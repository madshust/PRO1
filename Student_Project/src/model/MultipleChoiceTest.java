package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleChoiceTest {
    private static ArrayList<String> correctAnswers = new ArrayList<>(List.of("A","B","C","D","A","B","C","D","A","B"));

    public static ArrayList<String> generateAnswers(){
       Random r = new Random();
       ArrayList<String> answers = new ArrayList<>();
       int i = 0;

       while (i < 10){
           int a = r.nextInt(4);
           if (a == 0)
               answers.add("A");
           else if (a == 1)
               answers.add("B");
           else if (a == 2)
               answers.add("C");
           else if (a == 3)
               answers.add("D");
           i++;
       }
       return answers;
    }

    public static ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }
}
