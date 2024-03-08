package Opgave9_1;

public class Rectangle {

    private double width = 1;
    private double height = 1;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimenter(){
        return 2 * (width + height);
    }

    public void printRectangle(){
        System.out.println("***************");
        System.out.println("The width is: " + width);
        System.out.println("The height is: " + height);
        System.out.printf("The area is: %.2f\n", getArea());
        System.out.println("The perimeter is: %.2f\n" + getPerimenter());
        System.out.println("***************");
        System.out.println();
    }

}
