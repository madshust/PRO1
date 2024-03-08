package Exercise12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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

        // main triangle
        int x = 20;
        int y = 100;
        int h = 81;

        drawTriangle(pane, x, y, h);
        drawInnerTriangles(pane, x, y, h);

    }

    private void drawTriangle(Pane pane, int x, int y, int h) {
        // calculate new coordinates
        int x1 = x + (h * 2);
        int y1 = y;
        int x2 = x + h;
        int y2 = y - h;

        Line line1 = new Line(x, y, x1, y1);
        Line line2 = new Line(x, y, x2, y2);
        Line line3 = new Line(x1, y1, x2, y2);
        pane.getChildren().addAll(line1, line2, line3);
    }

    private void drawInnerTriangles(Pane pane, int x, int y, int h) {

        h = h / 3;
        // calculate new coordinates
        int x1 = x + (h * 4);
        int y1 = y;
        int x2 = x + (h * 2);
        int y2 = y - (h * 2);

        drawTriangle(pane, x, y, h);
        drawInnerTriangles2(pane, x, y, h);
        drawTriangle(pane, x1, y1, h);
        drawInnerTriangles2(pane, x1, y1, h);
        drawTriangle(pane, x2, y2, h);
        drawInnerTriangles2(pane, x2, y2, h);
    }

    private void drawInnerTriangles2(Pane pane, int x, int y, int h) {

        h = h / 3;
        // calculate new coordinates
        int x1 = x + (h * 4);
        int y1 = y;
        int x2 = x + (h * 2);
        int y2 = y - (h * 2);

        drawTriangle(pane, x, y, h);
        drawTriangle(pane, x1, y1, h);
        drawTriangle(pane, x2, y2, h);
    }


}
