package E3_13;

public class CarTester {
    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addFuel(20);
        myHybrid.drive(100);
        System.out.println(myHybrid.getFuelAmount());
    }
}
