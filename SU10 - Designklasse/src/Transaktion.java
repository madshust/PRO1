import java.time.LocalDate;

public class Transaktion {
    private int beløb;
    private String beskrivelse;
    private LocalDate dato;

    public Transaktion(int beløb, String beskrivelse) {
        this.beløb = beløb;
        this.beskrivelse = beskrivelse;
        dato = LocalDate.now();
    }

    public int getBeløb() {
        return beløb;
    }

    public LocalDate getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return beløb + ": " + dato.toString();
    }
}
