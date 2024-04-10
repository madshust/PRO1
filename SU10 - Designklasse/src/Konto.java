import java.util.ArrayList;

public class Konto {

    private int nr;
    private KontoType kontoType;
    private ArrayList<Transaktion> transaktioner = new ArrayList<>();
    private String status = "Åben";
    private static int numberOfAccounts = 0;

    public Konto(KontoType kontoType) {
        this.kontoType = kontoType;
        numberOfAccounts++;
        this.nr = numberOfAccounts;
    }

    public void indsætBeløb(int beløb) {

        if (status.equals("Åben")) {
            Transaktion t = new Transaktion(beløb, "Indsæt");
            transaktioner.add(t);
        }

    }

    public void hævBeløb(int beløb) {
        if (status.equals("Åben")) {
            Transaktion t = new Transaktion(-beløb, "Hæv");
            transaktioner.add(t);
        }

    }

    public void lukKonto() {
        status = "Lukket";
    }


    public int beregnSaldo() {
        int saldo = 0;
        for (Transaktion t : transaktioner) {
            saldo += t.getBeløb();

        }
        return saldo;
    }

    public int getNr() {
        return nr;
    }

    public KontoType getKontoType() {
        return kontoType;
    }

    public void setKontoType(KontoType kontoType) {
        this.kontoType = kontoType;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Kontonr: " + nr + "\n" +
                "Kontotype: " + kontoType;
    }

    public ArrayList<Transaktion> getTransaktioner() {
        return transaktioner;
    }

    public void printTransaktioner() {
        System.out.println("Transaktioner:");
        for (Transaktion t : transaktioner) {
            if (t.getBeløb() > 0)
                System.out.printf("%-10s %-2s %-10s\n", t.getDato().toString(), "beløb: ", t.getBeløb());
            else if (t.getBeløb() < 0)
                System.out.printf("%-10s %-2s %-2s\n", t.getDato().toString(), "beløb: ", t.getBeløb());

        }
    }
}
