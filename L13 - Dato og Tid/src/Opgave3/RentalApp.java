package Opgave3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        ArrayList<Rental> rentals = new ArrayList<>();

        rentals.add(new Rental(4, 10, LocalDate.of(2024, 04, 01), 350));
        rentals.add(new Rental(7, 6, currentDate.plusMonths(10), 350));

        for (int i = 0; i < rentals.size(); i++) {

            if (rentals.get(i) != null) {

                System.out.println(rentals.get(i).toString());
                System.out.println("The total price for the rental is: " + rentals.get(i).getTotalPrice());
                System.out.println("The end date for the rental: " + rentals.get(i).getEndDate());
                System.out.println("The day before the start of the rental is: " + rentals.get(i).getStartDate().minusDays(1));
            }
        }
        Period per = Period.between(rentals.get(0).getStartDate(), rentals.get(1).getStartDate());

        System.out.println("Time between the two rentals: ");
        System.out.println(per.getYears() + " years, " + per.getMonths() + " months and " + per.getDays() + " days");
        System.out.println("Days between the two rentals: " + ChronoUnit.DAYS.between(rentals.get(0).getStartDate(),rentals.get(1).getStartDate()));
    }
}
