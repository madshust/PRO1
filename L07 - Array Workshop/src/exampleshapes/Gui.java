package exampleshapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();

    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        // Line from (70,70) to (100,70)
        Line line = new Line(70, 70, 100, 70);
        pane.getChildren().add(line);

        // Circle with center at (70,70) and radius 30
        Circle circle = new Circle(70, 70, 30);
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        // Rectangle, upper left corner at (100,40), width 75, height 25
        Rectangle rektangel = new Rectangle(200, 40, 75, 25);
        rektangel.setFill(Color.CORAL);
        pane.getChildren().add(rektangel);

        // Polygon with 3 points (200,100), (300,100) and (250,150)
        Polygon polygon = new Polygon(200, 100, 300, 100, 250, 150);
        polygon.setFill(Color.PINK);
        pane.getChildren().add(polygon);

        // Ellipse with center at (70,230), x-radius 50 and y-radius 200/2
        Ellipse ellipse = new Ellipse(70, 230, 50, 100);
        ellipse.setFill(Color.YELLOW);
        ellipse.setStroke(Color.GREEN);
        ellipse.setStrokeWidth(5);
        pane.getChildren().add(ellipse);

        // Arc (part of ellipse) with center at (300,300), x-radius 100 and y-radius 60,
        // start angle 45 degrees, length 90 degrees
        Arc arc = new Arc(300, 300, 100, 60, 45, 90);
        arc.setFill(Color.GREEN);
        arc.setType(ArcType.ROUND);
        pane.getChildren().add(arc);

        // Text placed at (100,350)
        Text text = new Text(100, 350, "Computer Science");
        text.setFill(Color.BLUEVIOLET);
        pane.getChildren().add(text);
    }
}
