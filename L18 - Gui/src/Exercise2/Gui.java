package Exercise2;

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
    private final TextField txfNumber = new TextField();
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label num = new Label("Number: ");
        pane.add(num,1,1);

        pane.add(txfNumber,2,1,1,1);
        txfNumber.setMaxSize(40,10);

        Button inc = new Button("Inc");
        Button dec = new Button("Dec");

        pane.add(inc,3,1);
        GridPane.setMargin(inc,new Insets(-30,0,0,0));
        pane.add(dec,3,1);
        GridPane.setMargin(dec,new Insets(30,0,0,0));

        inc.setOnAction(event -> this.incrementAction());
        dec.setOnAction(event -> this.decrementAction());
    }

    public void incrementAction(){
        int num = Integer.parseInt(txfNumber.getText().trim());
        num++;
        String number = new String();
        number += num;
        txfNumber.setText(number);
    }

    public void decrementAction(){
        int num = Integer.parseInt(txfNumber.getText().trim());
        num--;
        String number = new String();
        number += num;
        txfNumber.setText(number);
    }

}
