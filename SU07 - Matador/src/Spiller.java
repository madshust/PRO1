import java.util.ArrayList;

public class Spiller {
    private int kapital;
    private String navn;
    private ArrayList<Aktiv> aktiver;

    public Spiller(String navn) {
        this.kapital = 20000;
        this.navn = navn;
    }

    public void købAktiv(Aktiv aktiv){
        if (kapital > aktiv.getPris()) {
            kapital -= aktiv.getPris();
            this.aktiver.add(aktiv);
        }
    }
}

