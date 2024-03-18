package Opgave2;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        if (middleName == null)
            return firstName + " " + lastName;
        else
            return firstName + " " + middleName + " " + lastName;
    }

    public String getInit() {
        String init = "";
        if (middleName == null) {
            init += firstName.substring(0, 1);
            init += lastName.substring(0, 1);
        } else {
            init += firstName.substring(0, 1);
            init += middleName.substring(0, 1);
            init += lastName.substring(0, 1);
        }
        return init;
    }

    public String getUsername() {
        String username = "";
        if (middleName == null) {
            username += firstName.toUpperCase().substring(0, 2);
            username += 0;
            username += lastName.toLowerCase().substring(lastName.length() - 2, lastName.length());
        } else {
            username += firstName.toUpperCase().substring(0, 2);
            username += middleName.length();
            username += lastName.toLowerCase().substring(lastName.length() - 2, lastName.length());
        }
        return username;
    }

    public String getCryptoInit(int count){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String init = getInit();
        String cryptoInit = "";


        for (int i = 0; i <= init.length()-1; i++){
            char ch = init.charAt(i);
            int index = (alphabet.indexOf(ch)+count)%alphabet.length();
            cryptoInit += alphabet.charAt(index);
        }

        return cryptoInit;
    }
}
