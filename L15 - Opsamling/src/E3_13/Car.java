package E3_13;

public class Car {
    private double fuelEfficiency;
    private double fuelAmount; // Miles/gallon


    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelAmount = 0;
    }

    public void addFuel(double fuelAmount){
        this.fuelAmount += fuelAmount;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void drive(double distance){
        fuelAmount -= fuelEfficiency/distance;
    }



}
