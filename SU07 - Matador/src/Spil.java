import java.util.ArrayList;

public class Spil {
    private ArrayList<Aktiv> aktiver;

    public void opretSpil(){
        Aktiv aktiv1 = new Aktiv(2000,"Sønderhøj");
        aktiver.add(aktiv1);
    }

    public ArrayList<Aktiv> getAktiver() {
        return aktiver;
    }
}
