public class KontoApp {
    public static void main(String[] args) {
        Konto konto = new Konto(1,"debit");
        System.out.println(konto.getSaldo());
        konto.indsætBeløb(1000);
        System.out.println(konto.getSaldo());
        konto.hævBeløb(500);
        System.out.println(konto.getSaldo());
        konto.lukKonto();
        konto.indsætBeløb(1000);
        System.out.println(konto.getSaldo());
    }
}
