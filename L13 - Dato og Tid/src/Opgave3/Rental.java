package Opgave3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private int number;
    private int days;
    private LocalDate startDate;
    private double price;

    public Rental(int number, int days, LocalDate startDate, double price) {
        this.number = number;
        this.days = days;
        this.startDate = startDate;
        this.price = price;
    }

    public double getPricePrDay(){
        return this.price;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate(){
        return startDate.plusDays(days);
    }

    public double getTotalPrice(){
        return price * days;
    }

    @Override
    public String toString() {
        return "Rental unit " + number;
    }
}
