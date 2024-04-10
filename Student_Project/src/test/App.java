package test;

import model.MultipleChoiceTest;
import model.Student;
import model.Team;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Team t1 = new Team("24A","A1.32");
        Team t2 = new Team("24B","A2.12");
        Student mads = new Student("Mads", new ArrayList<Integer>(List.of(12,10,12)));
        Student oliver = new Student("Oliver", new ArrayList<Integer>(List.of(12,10,12)));
        Student coveen = new Student("Coveen", new ArrayList<Integer>(List.of(12,10,12)));
        Student victor = new Student("Victor", new ArrayList<Integer>(List.of(7,7,12)));
        Student markus = new Student("Markus", new ArrayList<Integer>(List.of(2,4,2)));
        Student benjaminV = new Student("Benjamin V", new ArrayList<Integer>(List.of(4,7,12)));
        Student benjaminH = new Student("Benjamin h", new ArrayList<Integer>(List.of(7,4,12)));

        t1.addStudent(mads);
        t1.addStudent(oliver);
        t1.addStudent(coveen);
        t1.addStudent(victor);
        t1.addStudent(markus);
        t2.addStudent(benjaminH);
        t2.addStudent(benjaminV);

        System.out.println(t1.getActiveStudents());
        t1.removeStudent("oliver");
        System.out.println(t1.getActiveStudents());

        System.out.println("average grade for " + mads.getName() + " is: " + mads.getAverageGrade());
        System.out.printf("average grade for %s is %.2f\n",t1.getName(),t1.getAverageGrade());
        int avgGrade = 2;
        System.out.println("active students with an avg grade of above " + avgGrade + " is: ");
        System.out.println(t1.highscoreStudents(avgGrade));
        markus.setActive(false);
        System.out.println("active students with an avg grade of above " + avgGrade + " is: ");
        System.out.println(t1.highscoreStudents(avgGrade));
        markus.setActive(true);
        t1.addStudent(oliver);

        t1.runMultipleChoiceTest();
        t1.printStudentInfo();
        System.out.println();
        int questionNumber = 2;
        System.out.println("Number of correct answers for question number " + questionNumber + " is: " + t1.correctAnswersOfQuestion(questionNumber));
        System.out.println();
        for (int i = 0; i < MultipleChoiceTest.getCorrectAnswers().size(); i++){
            System.out.printf("Question %-2s : %d\n",i+1,t1.correctAnswersOfQuestion(i));
        }
    }
}
