import javafx.scene.paint.Color;

public class Car {
    private int doors;
    private int wheels;
    private Color color;

    public Car(int doors, int wheels, Color color) {
        this.doors = doors;
        this.wheels = wheels;
        this.color = color;
    }

    public Car(){
        this(1,3,Color.RED);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString(){
        return "Farve: " + color + " Antal hjul: " + wheels + " Antal døre: " + doors;
    }
}
