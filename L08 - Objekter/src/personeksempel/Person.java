package personeksempel;

public class Person {

    private String name;
    private String adress;
    private double monthlySalary;
    private int numberOfEmployments;


    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setNumberOfEmployments(int numberOfEmployments){
        this.numberOfEmployments = numberOfEmployments;
    }

    public int getNumberOfEmployments(){
        return numberOfEmployments;
    }

    public void newJob(){
        ++numberOfEmployments;
    }

    public double getAnnualSalary(){

        double annualSalary = monthlySalary * 12;
        double vacayMoney = annualSalary * 0.025;
        return annualSalary + vacayMoney;
    }



    public void printPerson(){
        System.out.println("*******************");
        System.out.println("Navn: " + name);
        System.out.println("Adresse: " + adress);
        System.out.println("Løn pr. måned: " + monthlySalary);
        System.out.println("Løn pr. år inkl. feriepenge: " + getAnnualSalary());
        System.out.println("Antal jobs: " + numberOfEmployments);
        System.out.println("*******************");
    }
}
