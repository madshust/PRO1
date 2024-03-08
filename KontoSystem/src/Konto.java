public class Konto {

    private int nr;
    private String kontoType;
    private int saldo = 0;
    private String status = "Åben";

    public Konto(int nr, String kontoType) {
        this.nr = nr;
        this.kontoType = kontoType;
    }

    public void indsætBeløb(int beløb){

        if (status.equals("Åben")){
            saldo += beløb;
        }

    }

    public void hævBeløb(int beløb){
        if (status.equals("Åben")){
            saldo -= beløb;
        }

    }

    public void lukKonto(){
        status = "Lukket";
    }


    public int getSaldo() {
        return saldo;
    }

    public int getNr() {
        return nr;
    }

    public String getKontoType() {
        return kontoType;
    }

    public void setKontoType(String kontoType) {
        this.kontoType = kontoType;
    }

    public String getStatus() {
        return status;
    }


}
