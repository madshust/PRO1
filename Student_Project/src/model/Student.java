package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private String name;
    private Boolean active;
    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.active = true;
    }

    // constructor med grades som int array
    public Student(String name, ArrayList grades){
        this.name = name;
        this.active = true;
        this.grades = grades;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void newGrade(int grade){
        grades.add(grade);
    }

    public int getHighestGrade(){
        int max = Integer.MIN_VALUE;
        for (int value : grades)
            if (value > max)
                max = value;
        return max;
    }

    public int maxGrade(){
        return Collections.max(grades);
    }

    public double getAverageGrade(){
        double avg = 0;
        for (int value : grades)
            avg += value;
        return avg/grades.size();
    }



    public String getName() {
        return name;
    }

    public boolean getStudentStatus(){
        return this.active;
    }

    public void generateAnswers(){
        this.answers = MultipleChoiceTest.generateAnswers();
    }


    public ArrayList<String> getAnswers() {
        return answers;
    }

    public int correctAnswersCount(){
        int count = 0;
        for (int i = 0; i < answers.size(); i++){
            if (answers.get(i).equalsIgnoreCase(MultipleChoiceTest.getCorrectAnswers().get(i))){
                count++;
            }
        }
        return count;
    }

    public void printStudentInfo(){

        System.out.println("============================");
        System.out.println("========StudentsInfo========");
        System.out.println("============================");
        System.out.printf("%-10s %-15s %-10s\n","Name", "Average Grade", "Test Score");
            System.out.printf("%-10s %-15.2f %-10d\n",getName(),getAverageGrade(),correctAnswersCount());

        }


    @Override
    public String toString() {
        return this.name;
    }
}
