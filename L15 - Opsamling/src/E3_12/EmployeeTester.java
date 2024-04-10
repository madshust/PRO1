package E3_12;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee harry = new Employee("Harry",50000);
        harry.raiseSalary(10);
        System.out.println(harry.getName());
        System.out.printf("%.2f", harry.getSalary());
    }
}
