import com.sun.javafx.geom.Curve;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
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
        Car car = new Car(4, 4, Color.BLUE);
        pane.setPrefSize(400, 400); // may be changed
        this.drawCar(pane, car);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawCar(Pane pane, Car car) {
        // lights
        light(pane,"front");
        light(pane,"back");

        // body
        body(pane,car.getColor());
        // wheels
        if (car.getWheels() == 2)
            wheel(pane,200,275);
        else if (car.getWheels() == 4) {
            wheel(pane, 100, 275);
            wheel(pane, 300, 275);
        }
        // doors
        if (car.getDoors() == 2) {
            door(pane, 140, 200);
        }
        else if (car.getDoors() == 4){
            door(pane, 140,200);
            door(pane, 200,200);
        }

        // windows
        windows(pane);
    }

    private void body(Pane pane, Color color){
        Rectangle bottom = new Rectangle(50,200,300,75);
        Rectangle top = new Rectangle(125,150,150,50);
        bottom.setFill(color);
        top.setFill(color);
        pane.getChildren().addAll(bottom,top);
    }

    private void wheel(Pane pane, int x, int y){
        Circle tire = new Circle(x,y,20,Color.BLACK);
        Circle wheel = new Circle(x,y,15,Color.GREY);
        pane.getChildren().addAll(tire,wheel);
    }

    private void door(Pane pane, int x, int y){
        Rectangle door = new Rectangle(x,y,60,60);
        Line line = new Line(x+60,y+(60/2),x+60-8,y+(60/2));
        door.setStroke(Color.BLACK);
        door.setFill(null);
        pane.getChildren().addAll(door,line);
    }

    private void light(Pane pane, String place){
        if(place.equalsIgnoreCase("front")) {
            Circle front = new Circle(50, 230, 10, Color.GOLD);
            front.setStroke(Color.BLACK);
            pane.getChildren().add(front);
        } else if (place.equalsIgnoreCase("back")) {
            Circle back = new Circle(350, 230, 10, Color.RED);
            back.setStroke(Color.BLACK);
            pane.getChildren().add(back);
        }
    }

    private void windows(Pane pane){
        Rectangle window1 = new Rectangle(135,160,70,40);
        Rectangle window2 = new Rectangle(200,160,65,40);
        window1.setFill(Color.WHITE);
        window2.setFill(Color.WHITE);
        window1.setStroke(Color.BLACK);
        window2.setStroke(Color.BLACK);
        pane.getChildren().addAll(window1,window2);
    }
}
