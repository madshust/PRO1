package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Teacher extends Person {

private double salary;
private LocalDate hired;
private int yearsEmployed;


    public Teacher(String name, String address, String qualification, double salary) {
        super(name, address, qualification);

        this.salary = salary;
        this.hired = LocalDate.now();

    }

    @Override
    public void print(){
        super.print();
        System.out.println("salary = " + salary);
        System.out.println("Years employed = " + getYearsEmployed());
    }

    public double getAnnualSalary(){
        return (this.salary * 12)+(this.salary*12)*0.125;
    }

    public void setHired(LocalDate hired) {
        this.hired = hired;
    }

    public long getYearsEmployed(){
            return ChronoUnit.YEARS.between(this.hired,LocalDate.now());
    }


}
