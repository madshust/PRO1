package Exercise3;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
    private final TextField txfInvestment = new TextField();
    private final TextField txfYears = new TextField();
    private final TextField txfInterest = new TextField();
    private final TextField txfFutureValue = new TextField();
    private void initContent(GridPane pane) {

        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        txfFutureValue.setEditable(false);

        Label investmentLabel = new Label("Investment:");
        Label yearsLabel = new Label("Years:");
        Label interestLabel = new Label("Interest (%):");
        Label futureValueLabel = new Label("Future Value:");

        Button calculate = new Button("Calculate");

        pane.add(investmentLabel,0,0);
        pane.add(txfInvestment,1,0);

        pane.add(yearsLabel,0,1);
        pane.add(txfYears,1,1);

        pane.add(interestLabel,0,2);
        pane.add(txfInterest,1,2);

        pane.add(calculate,1,3);
        GridPane.setMargin(calculate,new Insets(0,0,0,30));

        pane.add(futureValueLabel,0,4);
        pane.add(txfFutureValue,1,4);

        calculate.setOnAction(event -> this.calculateFutureValueAction());
    }

    private void calculateFutureValueAction(){

        double inv = Double.parseDouble(txfInvestment.getText().trim());
        int y = Integer.parseInt(txfYears.getText().trim());
        double intr = Double.parseDouble(txfInterest.getText().trim());

        double futureValue = (inv*Math.pow(1+(intr/100),y));

        txfFutureValue.setText(String.format("%.2f",futureValue));
    }
}