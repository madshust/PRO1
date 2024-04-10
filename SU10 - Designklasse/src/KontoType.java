public class KontoType {
    private String navn;
    private String beskrivelse;
    private String betingelser;

    public KontoType(String navn, String beskrivelse, String betingelser) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.betingelser = betingelser;
    }

    @Override
    public String toString() {
        return navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getBetingelser() {
        return betingelser;
    }

    public void setBetingelser(String betingelser) {
        this.betingelser = betingelser;
    }


}
