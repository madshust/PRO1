package Exercise3;

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
        // drawing 1:
        /*
        int x1 = 20;
        int y1 = 10;
        int x2 = 20;
        int y2 = 190;

        while (x2 <= 180) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            x1 += 40;
            x2 += 40;
        */

        // drawing 2:
        /*
        int x1 = 20;
        int y1 = 20;
        int x2 = 180;
        int y2 = 20;

        while (y2 <= 180) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            y1 += 40;
            y2 += 40;

        }
        */
         // drawing 3:
        int x1 = 90;
        int y1 = 20;
        int x2 = 110;
        int y2 = 20;

        while (x2 <= 190) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            x1 -= 20;
            y1 += 40;
            x2 += 20;
            y2 += 40;

        }


    }


}
