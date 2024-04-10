public class ATM {
    public static void main(String[] args) {

        KontoType debit = new KontoType("Debit","Hævekonto","Kan kun hæves på denne konto");
        Konto k1 = new Konto(debit);
        Konto k2 = new Konto(debit);

        System.out.println(k1);
        System.out.println(k1.beregnSaldo());
        k1.indsætBeløb(1000);
        k1.hævBeløb(200);
        k1.indsætBeløb(350);
        k1.indsætBeløb(200);
        k1.hævBeløb(700);
        System.out.println(k1.getTransaktioner());
        System.out.println(k1.beregnSaldo());
        k1.printTransaktioner();

    }
}
