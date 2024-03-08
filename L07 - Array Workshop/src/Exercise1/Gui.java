package Exercise1;

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
        // a)
        // draw an arrowhead at (100,75)
        int length = 10*2;
        int height = 4*2;

        int x1 = 100;
        int y1 = 75;
        Line line1 = new Line(x1,y1,x1+length,y1-height);
        Line line2 = new Line(x1,y1,x1+length,y1+height);
        pane.getChildren().addAll(line1,line2);

        // draw an arrowhead at (100, 125)
        int x2 = 100;
        int y2 = 125;
        Line line3 = new Line(x2,y2,x2+length,y2-height);
        Line line4 = new Line(x2,y2,x2+length,y2+height);
        pane.getChildren().addAll(line3,line4);

        // draw an arrowhead at (20,50)
        int x3 = 20;
        int y3 = 50;
        Line line5 = new Line(x3,y3,x3+length,y3-height);
        Line line6 = new Line(x3,y3,x3+length,y3+height);
        pane.getChildren().addAll(line5,line6);

    }

}
