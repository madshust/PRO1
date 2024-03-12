public class Aktiv {
    private int pris;
    private String navn;
    private Spiller ejetAf;

    public Aktiv(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Spiller getEjetAf() {
        return ejetAf;
    }

    public void setEjetAf(Spiller ejetAf) {
        this.ejetAf = ejetAf;
    }
}
