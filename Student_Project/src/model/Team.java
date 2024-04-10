package model;

import java.util.ArrayList;
import java.util.Collections;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }



    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }


    public ArrayList<Student> getActiveStudents(){
        // make new array for storing active students
        ArrayList<Student> activeStudents = new ArrayList<>();
        // iterate through array to find all active students
        for (Student student : students){
            if (student.getStudentStatus() == true)
                activeStudents.add(student);
        }

        return activeStudents;
    }

    public void removeStudent(String name){
        int i = 0;

        while (i < students.size())
        {
            if(students.get(i).getName().equalsIgnoreCase(name)){
                students.remove(i);
                return;
            }
            i++;
        }
    }

    public double getAverageGrade(){
        double avgGrade = 0;
        for (Student student : students){
            avgGrade += student.getAverageGrade();
        }
        return avgGrade/students.size();
    }

    public ArrayList<Student> highscoreStudents(double minAverage){
        ArrayList<Student> studentsMinAvg = new ArrayList<>();

        for (Student student : getActiveStudents())
            if (student.getAverageGrade() >= minAverage)
                studentsMinAvg.add(student);

        return studentsMinAvg;
    }

    public int[] getStudentScores(){
        int[] scores = new int[students.size()];

        for (int i = 0; i < students.size(); i++){
            scores[i] = students.get(i).correctAnswersCount();
        }

        return scores;
    }

    public void runMultipleChoiceTest(){
        for (Student student : students)
            student.generateAnswers();
    }

    public void printStudentInfo(){

        System.out.println("============================");
        System.out.println("========StudentsInfo========");
        System.out.println("============================");
        System.out.printf("%-10s %-15s %-10s\n","Name", "Average Grade", "Test Score");
        for (Student student : students){
            System.out.printf("%-10s %-15.2f %-10d\n",student.getName(),student.getAverageGrade(),student.correctAnswersCount());

        }

    }

    public int correctAnswersOfQuestion(int questionNumber){
        int count = 0;

        for (Student student : students) {
            if (student.getAnswers().get(questionNumber) == MultipleChoiceTest.getCorrectAnswers().get(questionNumber)){
                count++;
            }
        }
        return count;
    }

    public void printStudentList(){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName());
        }
    }

    @Override
    public String toString() {
        return name + " " + room;
    }
}
