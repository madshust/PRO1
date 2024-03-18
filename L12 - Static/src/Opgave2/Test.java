package Opgave2;

public class Test {
    public static void main(String[] args) {
        Name n1 = new Name("Mads","Hust");
        System.out.println(n1.getFullName());
        System.out.println(n1.getInit());
        System.out.println(n1.getUsername());
        Name n2 = new Name("Mads","Nedergaard","Hust");
        System.out.println(n2.getFullName());
        System.out.println(n2.getInit());
        System.out.println(n2.getUsername());
        System.out.println(n2.getCryptoInit(1000058));

    }
}
