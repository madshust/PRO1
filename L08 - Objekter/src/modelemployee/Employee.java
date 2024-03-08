package modelemployee;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 */
public class Employee {
    /*
     * Attributter der beskriver den ansattes tilstand
     */
    private String firstName;
    private String lastName;
    private boolean trainee;
    private int age;

    /*
     * Constructor, når den ansatte oprettes, skal den have et navn. Ved
     * oprettelse er den ansatte en trainee
     */
    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        trainee = true;
    }

    public Employee() {

    }

    /*
     * Den ansattes navn kan ændres ved kald af setName metoden
     */
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
     * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
     */
    public String getName() {
        String fullName = new String();

        fullName = firstName + " " + lastName;
        return fullName;
    }

    public int getAge() {return age; }

    public int setAge(int age){
        return this.age = age;
    }


    /*
     * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
     */
    public void setTrainee(boolean isTrainee) {
        trainee = isTrainee;
    }

    /*
     * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
     * isTrainee
     */
    public boolean isTrainee() {
        return trainee;
    }

    public void birthday(){
        age++;
    }

    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Trainee " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
        System.out.println();
    }


    /*
     * Returnerer en kort tekst repræsentation af objektet
     */
//	public String toString(){
//		return name;
//	}
}
