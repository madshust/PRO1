package Exercise10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

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
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        drawRing(pane,50,50);
        drawRing(pane,150,50);
        drawRing(pane,50,150);
        drawRing(pane,150,150);
    }

    private void drawRing(Pane pane, int x, int y){
        int r1 = 20; // radius inner ring
        int r2 = 25; // radius outer ring
        int r3 = r2-r1; // radius y-axis for ellipse
        int r4 = r3*2; // radius x-axis for ellipse

        Circle circle1 = new Circle(x,y,r1);
        Circle circle2 = new Circle(x,y,r2);
        Ellipse ellipse = new Ellipse(x,(y-r2),r4,r3);
        ellipse.setStroke(Color.RED);
        ellipse.setFill(Color.RED);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.GOLD);

        pane.getChildren().addAll(circle2,circle1,ellipse);
    }
}
