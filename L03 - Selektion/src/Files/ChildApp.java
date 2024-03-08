package Files;

public class ChildApp {

    // Metoden skal retunere en tekststreng der beskriver hvilken institution et barn skal gå i, afhængig af barnets alder.
    // Reglerne for dette kan ses på opgavedsedlen
    public static String institution(int age) {
        String myString = new String();

        if (age == 0)
            myString = "Home";
        else if (age > 0 && age <= 2)
            myString = "Nusery";
        else if (age >= 3 && age <= 5)
            myString = "Kindergarten";
        else if (age >= 6 && age <= 16)
            myString = "School";
        else if (age >= 17 && age <= 110)
            myString = "Out of School";
        else if (age > 110)
            myString = "Graveyard";

        return myString;

    }


    // Metoden skal returenre en tekststreng der beskriver hvilket gymnastikhold et barn skal gå på, afhængig af barnets alder og køn.
    // Reglerne for dette kan ses på opgavedsedlen
    //
    public static String team(boolean isBoy, int age) {
        String myString = new String();

        if (isBoy)
        {
            if (age < 8)
                myString = "Young Cubs";
            if (age >= 8)
                myString = "Cool Boys";
        }
        else
        {
            if (age < 8)
                myString = "Tumbling Girls";
            if (age >= 8)
                myString = "Springy Girls";
        }

        return myString;

    }

}
