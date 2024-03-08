package personeksempel;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person("Mads Hust");
        p1.setAdress("Søndre Ringgade 13, 8000 Aarhus C");
        p1.setMonthlySalary(6500);
        p1.setNumberOfEmployments(3);
        p1.printPerson();
        p1.newJob();
        p1.printPerson();
    }
}
