package Opgave3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class RentalApp {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        Rental[] rentals = new Rental[10];
        rentals[0] = new Rental(4, 10, LocalDate.of(2024, 04, 01), 350);
        rentals[1] = new Rental(7, 6, currentDate.plusMonths(10), 350);

        for (int i = 0; i < rentals.length; i++) {
            if (rentals[i] != null) {
                System.out.println(rentals[i].toString());
                System.out.println("The total price for the rental is: " + rentals[i].getTotalPrice());
                System.out.println("The end date for the rental: " + rentals[i].getEndDate());
                System.out.println("The day before the start of the rental is: " + rentals[i].getStartDate().minusDays(1));
            }
        }
        Period per = Period.between(rentals[0].getStartDate(), rentals[1].getStartDate());
        System.out.println("Time between the two rentals: ");
        System.out.println(per.getYears() + " years, " + per.getMonths() + " months and " + per.getDays() + " days");
        System.out.println("Days between the two rentals: " + ChronoUnit.DAYS.between(rentals[0].getStartDate(),rentals[1].getStartDate()));
    }
}
