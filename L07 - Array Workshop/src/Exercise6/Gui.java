package Exercise6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
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
        this.drawLine(pane);
        this.drawTicks(pane);
        this.drawArrowHead(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawLine(Pane pane) {
        Line line = new Line(0, 180, 182, 180);
        pane.getChildren().add(line);
    }

    private void drawTicks(Pane pane) {
        int x = 14;
        int y1 = 176;
        int y2 = 184;
        int num = 0;
        String str = "";

        for (int i = 0; i <= 11; i++) {
            num = i;
            if (i % 5 != 0) {
                Line line = new Line(x, y1, x, y2);
                pane.getChildren().add(line);
                x += 14;
            } else {
                str = Integer.toString(num);
                Line line = new Line(x,(y1-4),x,(y2+4));
                Text text = new Text((x-4),(y2+15),str);
                pane.getChildren().addAll(line,text);
                x += 14;
            }
        }


    }

    private void drawArrowHead(Pane pane) {
        Line line1 = new Line(182, 180, 176, 176);
        Line line2 = new Line(182, 180, 176, 184);
        pane.getChildren().addAll(line1, line2);
    }
}
