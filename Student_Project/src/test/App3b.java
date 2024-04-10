package test;

import model.MultipleChoiceTest;
import model.Student;
import model.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App3b {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Team> teams = new ArrayList<>();

    public static void main(String[] args) {

        teams.add(new Team("24A", "A1.32"));
        teams.add(new Team("24B", "A2.12"));
        Student mads = new Student("Mads", new ArrayList<Integer>(List.of(12, 10, 12)));
        Student oliver = new Student("Oliver", new ArrayList<Integer>(List.of(12, 10, 12)));
        Student coveen = new Student("Coveen", new ArrayList<Integer>(List.of(12, 10, 12)));
        Student victor = new Student("Victor", new ArrayList<Integer>(List.of(7, 7, 12)));
        Student markus = new Student("Markus", new ArrayList<Integer>(List.of(2, 4, 2)));
        Student benjaminV = new Student("Benjamin", new ArrayList<Integer>(List.of(4, 7, 12)));
        Student benjaminH = new Student("Jonas", new ArrayList<Integer>(List.of(7, 4, 12)));

        teams.get(0).addStudent(mads);
        teams.get(0).addStudent(oliver);
        teams.get(0).addStudent(coveen);
        teams.get(0).addStudent(victor);
        teams.get(0).addStudent(markus);
        teams.get(1).addStudent(benjaminH);
        teams.get(1).addStudent(benjaminV);


        boolean finished = true;
        boolean menu = true;
        while (finished) {
            System.out.println("=====================");
            System.out.println("========MENU=========");
            System.out.println("=====================");
            System.out.println("1. Create a team");
            System.out.println("2. Create a student");
            System.out.println("3. Edit student");
            System.out.println("4. Run Multiple Choice Test for all teams");
            System.out.println("5. Show one student's info and results");
            System.out.println("6. Show one team's info and results");
            System.out.println("7. Show info and results for all teams");
            System.out.println("8. Exit program");
            int choice = Integer.MAX_VALUE;
            choice = input.nextInt();
            if (choice < 8 && choice > 0) {
                switch (choice) {
                    case 1:
                        createTeam();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        editStudent();
                        break;
                    case 4:
                        for (Team team : teams) {
                            team.runMultipleChoiceTest();
                        }
                        System.out.println("All teams have now taken the test");
                        break;
                    case 5:
                        showStudentInfo();
                        break;
                    case 6:
                        showTeamInfo();
                        break;
                    case 7:
                        break;
                    case 8:
                        finished = false;

                }
            } else {
                System.out.println();
                System.out.println("Please enter a valid choice");
            }

        }
    }

    public static void createTeam() {
        System.out.println("Team name and room: ");
        String name = input.next();
        String room = input.next();
        teams.add(new Team(name, room));
        System.out.println("Team created with name " + teams.getLast().getName() + " and room " + teams.getLast().getRoom());
    }

    public static void createStudent() {
        boolean finished = true;
        while (finished) {

            int valid = 0; // to check if a team name was found
            System.out.println("Name of students team: ");
            String teamName = input.next(); // get team name from user

            for (Team team : teams) {
                if (teamName.equalsIgnoreCase(team.getName())) { // check if teamName is equal to existing team
                    // get student name
                    System.out.println("Students name: ");
                    String studentName = input.next();

                    // get number of grades
                    System.out.println("Students number of grades: ");
                    int numOfGrades = input.nextInt();

                    // get grades and store in arrayList grades
                    System.out.println("Input grades: ");
                    ArrayList<Integer> grades = new ArrayList<>();
                    for (int i = 0; i < numOfGrades; i++) {
                        grades.add(input.nextInt());
                    }

                    // create new student and add to team
                    team.addStudent(new Student(studentName, grades));

                    System.out.print("Student " + studentName);
                    if (team.getStudents().getLast().getStudentStatus() == true)
                        System.out.print("(active)");
                    else
                        System.out.print("(inactive)");
                    System.out.println(" with grades " + grades + " created in team " + team.getName());

                    valid++; // inc counter for checking if a team was found
                    finished = false; // exit while loop
                }
            }
            if (valid == 0) {
                System.out.println("Not a valid team name. List of teams are: ");
                System.out.println(teams);
            }
        }

    }

    public static void editStudent() {

        boolean finished = true;
        while (finished) {
            boolean menu = true;

            printTeamList();

            System.out.println("Please enter the number of the team: ");
            int team = input.nextInt();

            System.out.println("Student list: ");
            teams.get(team - 1).printStudentList();


            System.out.println("Please enter the name of the student you want to edit: ");
            while (menu) {
                int valid = 0;
                boolean removeStudent = false; // to check if remove student was chosen.
                boolean studentMenu = true;
                String studentName = input.next();
                while (studentMenu) {
                    for (Student student : teams.get(team - 1).getStudents()) {
                        if (studentName.equalsIgnoreCase(student.getName())) {
                            System.out.println("======" + student.getName() + "======");
                            System.out.println("1. Remove Student");
                            System.out.println("2. Add new grade");
                            System.out.println("3. Set active status");
                            System.out.println("4. Exit to main menu");
                            System.out.println();
                            System.out.println("Choose an option: ");

                            switch (input.nextInt()) {
                                case 1:
                                    removeStudent = true;
                                    studentMenu = false;
                                    menu = false;
                                    break;
                                case 2:
                                    System.out.println("Enter grade: ");
                                    student.newGrade(input.nextInt());
                                    break;
                                case 3:
                                    System.out.println("Change status (y/n). Current status is (true=active - false=inactive): " + student.getStudentStatus());
                                    String choice = input.next();
                                    if (choice.equalsIgnoreCase("y"))
                                        if (student.getStudentStatus() == true)
                                            student.setActive(false);
                                        else
                                            student.setActive(true);
                                    System.out.println(student.getName() + " is activity is now: " + student.getStudentStatus());
                                    break;
                                case 4:
                                    studentMenu = false;
                                    break;

                            }
                            valid++;
                        }
                    }
                    if (removeStudent == true) {
                        teams.get(team - 1).removeStudent(studentName);
                    }
                    if (valid == 0) {
                        System.out.println("Please enter a valid name: ");
                        studentMenu = false;
                    }

                }
            }
            menu = false;
            finished = false;
        }
    }

    public static void printTeamList() {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(i + 1 + ": " + teams.get(i).getName());
        }
    }

    public static void showStudentInfo() {
        boolean finished = true;
        while (finished) {
            boolean menu = true;

            printTeamList();

            System.out.println("Please enter the number of the team: ");
            int team = input.nextInt();

            System.out.println("Student list: ");
            teams.get(team - 1).printStudentList();


            System.out.println("Please enter the name of the student you want: ");
            while (menu) {
                int valid = 0;
                boolean studentMenu = true;
                String studentName = input.next();
                while (studentMenu) {
                    for (Student student : teams.get(team - 1).getStudents()) {
                        if (studentName.equalsIgnoreCase(student.getName())) {
                            student.printStudentInfo();
                            menu = false;
                            studentMenu = false;
                            finished = false;
                        }
                    }
                }
            }
        }
    }

    public static void showTeamInfo() {
        boolean finished = true;
        while (finished) {

            printTeamList();

            System.out.println("Please enter the number of the team you want: ");
            int teamName = input.nextInt();

            teams.get(teamName-1).printStudentInfo();
            finished = false;
            input.nextLine();
        }
    }
}
