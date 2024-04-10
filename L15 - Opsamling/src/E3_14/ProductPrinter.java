package E3_14;

public class ProductPrinter {
    public static void main(String[] args) {
        Product p1 = new Product("Toaster", 29.95);
        Product p2 = new Product("Oven",249.95);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("=======================================");
        p1.reducePrice(5);
        p2.reducePrice(5);
        System.out.println(p1);
        System.out.println(p2);
    }
}
