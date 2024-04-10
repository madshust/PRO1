package Exercise5;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Locale;

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
    private final TextArea txaNames = new TextArea();
    private StringBuilder sb = new StringBuilder();


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
        Label nameLabel = new Label("Name:");
        Button add = new Button("Add");
        txfName.setMaxSize(130,10);
        txaNames.setMaxSize(130,200);

        // add to pane
        pane.add(nameLabel,0,0);
        pane.add(txfName,0,1);
        pane.add(add,0,2);
        pane.add(txaNames,0,3);

        add.setOnAction(event -> addTextToArea());
    }

    private void addTextToArea(){
        sb.append(txfName.getText().trim() + "\n");
        txaNames.setText(sb.toString());
    }
}