package Exercise4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.awt.*;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        //this.drawShapes1(pane);
        //this.drawShapes2(pane);
        this.drawShapes3(pane);
        //this.drawShapes4(pane);

        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes1(Pane pane) {
        int x = 50; // center: (x,y)
        int y = 100;
        int r = 40; // radius: r
        while (x <= 150) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            x += 25;
        }
    }

    private void drawShapes2(Pane pane) {
        int x = 100; // center: (x,y)
        int y = 100;
        int r = 20; // radius: r
        while (r <= 100) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            r += 20;
        }
    }

    private void drawShapes3(Pane pane) {
        int x = 10; // center: (x,y)
        int y = 100;
        int r = 10; // radius: r
        while (r <= 80) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            r += 10;
            x += 10;
        }
    }

    private void drawShapes4(Pane pane) {
        int x = 100; // center: (x,y)
        int y = 100;
        int rx = 20; // radius: x
        int ry = 40; // radius: y
        while (rx <= 80) {
            Ellipse ellipse = new Ellipse(x, y, rx, ry);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(null);
            pane.getChildren().add(ellipse);
            rx += 10;
        }

    }

}
