package Exercise6;

public class Student {

    private String name;
    private int age;
    private boolean active;

    public Student(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String isActiveString(){
        String active = new String();
        if (this.active == true)
            active = "Yes";
        else
            active = "No";
        return active;
    }

    @Override
    public String toString() {

        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Active: " + isActiveString();
    }
}
