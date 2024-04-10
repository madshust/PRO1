package Exercise6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

import static java.lang.Math.round;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private final TextField txfName = new TextField();
    private final TextField txfAge = new TextField();
    private final CheckBox cbActive = new CheckBox();
    private final TextArea txaNames = new TextArea();

    private ArrayList<Student> students = new ArrayList<>();

    private int currentIndex = -1;


    private void initContent(GridPane pane) {

        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(10);

        // create content

        Label lbStudentInfo = new Label("Student info:");
        Label lbName = new Label("Name: ");
        Label lbAge = new Label("Age:");
        Label lbActive = new Label("Active:");

        txaNames.setEditable(false);
        txaNames.setMaxSize(350,150);
        txfName.setMaxSize(150,10);
        txfAge.setMaxSize(60,10);

        Button btnInc = new Button("inc");
        Button btnReset = new Button("Reset");
        Button btnCreate = new Button("Create");
        Button btnUpdate = new Button("Update");
        Button btnDelete = new Button("Delete");
        Button btnPrevious = new Button("Prev");
        Button btnNext = new Button("Next");


        // add to GUI pane

        pane.add(lbStudentInfo,0,0);
        pane.add(txaNames,0,1);
        pane.add(lbName,0,2);
        pane.add(txfName,0,2,1,1);
        GridPane.setMargin(txfName,new Insets(0,0,0,60));
        pane.add(lbAge,0,3);
        pane.add(txfAge,0,3);
        GridPane.setMargin(txfAge,new Insets(0,0,0,60));
        pane.add(lbActive,0,4);
        pane.add(cbActive,0,4);
        GridPane.setMargin(cbActive,new Insets(0,0,0,60));

        // next/prev buttons

        pane.add(btnPrevious,0,2);
        GridPane.setMargin(btnPrevious,new Insets(0,0,0,250));
        pane.add(btnNext,0,2);
        GridPane.setMargin(btnNext,new Insets(0,0,0,300));


        // buttons

        pane.add(btnInc,0,3);
        GridPane.setMargin(btnInc,new Insets(0,0,0,140));
        pane.add(btnReset,0,3);
        GridPane.setMargin(btnReset,new Insets(0,0,0,190));
        pane.add(btnCreate,0,5);
        GridPane.setMargin(btnCreate,new Insets(0,0,0,30));
        pane.add(btnUpdate,0,5);
        GridPane.setMargin(btnUpdate,new Insets(0,0,0,120));
        pane.add(btnDelete,0,5);
        GridPane.setMargin(btnDelete,new Insets(0,0,0,210));

        // Assign buttons

        btnCreate.setOnAction(event -> createStudent());
        btnUpdate.setOnAction(event -> updateStudent());
        btnInc.setOnAction(event-> incAge());
        btnReset.setOnAction(event -> resetInputs());
        btnDelete.setOnAction(event-> deleteStudent());
        btnNext.setOnAction(event-> nextStudent());
        btnPrevious.setOnAction(event->previousStudent());

    }

    private void displayStudent(){
        if (students.size() > 0) {
            txaNames.setText(students.get(currentIndex).toString());
        }
    }


    private void createStudent(){
        String name = txfName.getText().trim();
        int age = Integer.parseInt(txfAge.getText().trim());
        boolean active = cbActive.isSelected();

        students.add(new Student(name,age,active));
        currentIndex = students.size()-1;
        displayStudent();

        txfName.setText("");
        txfAge.setText("");
        cbActive.setSelected(false);
    }

    private void updateStudent(){
        students.get(currentIndex).setAge(Integer.parseInt(txfAge.getText().trim()));
        students.get(currentIndex).setName(txfName.getText().trim());
        students.get(currentIndex).setActive(cbActive.isSelected());

        displayStudent();
    }

    private void incAge(){
        int num = Integer.parseInt(txfAge.getText().trim());
        num++;
        String number = new String();
        number += num;
        txfAge.setText(number);
    }

    private void resetInputs(){
        txfName.setText(students.get(currentIndex).getName());
        String age = "" + students.get(currentIndex).getAge();
        txfAge.setText(age);
        cbActive.setSelected(students.get(currentIndex).isActive());
    }

    private void deleteStudent(){
        if (students.size() > 0){
            students.remove(currentIndex);
            txaNames.setText("");
            txfAge.setText("");
            txfName.setText("");
            cbActive.setSelected(false);
        }
        else
            txaNames.setText("No students");
    }

    private void nextStudent(){
        if (currentIndex < students.size()-1){
            currentIndex++;
            displayStudent();
        }

    }

    private void previousStudent(){
        if (currentIndex > 0) {
            currentIndex--;
            displayStudent();
        }

    }


}
