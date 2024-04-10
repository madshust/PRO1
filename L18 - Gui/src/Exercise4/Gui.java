package Exercise4;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private final TextField txfCelsius = new TextField("0");
    private final TextField txfFahrenheit = new TextField("0");
    private void initContent(GridPane pane) {

        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label celsiusLab = new Label("Celsius:");
        Label fahrenheitLab = new Label("Fahrenheit:");

        Button convert = new Button("Convert");
        Button reset = new Button("Reset");

        pane.add(celsiusLab,0,0);
        pane.add(txfCelsius,1,0);

        pane.add(fahrenheitLab,0,1);
        pane.add(txfFahrenheit,1,1);

        pane.add(convert,1,2);
        pane.add(reset,2,2);
        GridPane.setMargin(convert,new Insets(0,0,0,40));

        convert.setOnAction(event -> convertAction());
        reset.setOnAction(event -> resetAction());

    }

    private void convertAction(){

            if (txfFahrenheit.getText().trim().equalsIgnoreCase("0")) {
                double c1 = Double.parseDouble(txfCelsius.getText().trim());

                double f1 = ((9.0 / 5.0) * c1) + 32;

                txfFahrenheit.setText(String.format(Locale.UK, "%.1f", f1));
            }
            else if (txfCelsius.getText().trim().equalsIgnoreCase("0")){
                double f2 = Double.parseDouble(txfFahrenheit.getText().trim());

                double c2 = (f2-32) *(5.0/9.0);

                txfCelsius.setText(String.format(Locale.UK,"%.1f",c2));
            }
    }
    private void resetAction(){
        txfCelsius.setText("0");
        txfFahrenheit.setText("0");
    }
}