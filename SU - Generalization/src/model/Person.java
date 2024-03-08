package model;

public class Person
{

    private String name; // ej synlig i subklasser, kan tilgås via public
    // getName metode, som i alle andre situationer, det anbefales at
    // attributterne er private i superklasser af samme årsag som andre klasser
    protected String address; // synlig i subklasser og samme package, ok
    // løsning på problemet med at subklassen ikke har direkte
    // adgang til superklassens attributter. Det har dog den
    // bagdel at flere nu har adgang til attributten, så noget af
    // kontrollen mht. at håndtere attributten rigtigt mistes. Det
    // anbefales at attributter i en superklasse er private og at der
    // laves get-metoder til at tilgå dem.
    private String qualification;

    public Person(String name, String address, String qualification)
    {
        this.name = name;
        this.address = address;
        this.qualification = qualification;

    }

    public String getName()
    { // nødvendig for subklassen når attributten name
      // er private
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

//    public String getAddress()
//    { // ej nødvendig for subklassen da attributten
//      // address er protected
//      // men kan være nødvendig for objekter af
//      // person
//        return address;
//    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getQualification()
    {
        return qualification;
    }

    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }

    public void udskrivPerson()
    {
        System.out.println("Navn: " + name);
        System.out.println("Adresse: " + address);
        System.out.println("Kvalifikation: " + qualification);
    }
}
