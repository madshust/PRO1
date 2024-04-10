package Exercise1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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

    private final TextField txfFirstName = new TextField();
    private final TextField txfLastName = new TextField();
    private final TextField txfFullName = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label fName = new Label("First name:");
        Label lName = new Label("Last name:");
        Label fullName = new Label("Full name:");

        pane.add(fName, 0, 0);
        pane.add(lName,2,0);
        pane.add(fullName,0,2);



        pane.add(txfFirstName, 0, 1, 2, 1);
        pane.add(txfLastName,2,1,2,1);
        pane.add(txfFullName,0,3,3,1);
        txfFullName.setEditable(false);

        Button combine = new Button("Combine");
        pane.add(combine,3,3);

        combine.setOnAction(event -> this.combineAction());

    }

    // -------------------------------------------------------------------------

    private void combineAction() {
        String firstName = txfFirstName.getText().trim();
        String LastName = txfLastName.getText().trim();
        String fullName = firstName + " " + LastName;
        txfFullName.setText(fullName);
    }
}
