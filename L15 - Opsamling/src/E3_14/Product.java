package E3_14;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reducePrice(double price){
        this.price -= price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Price: " + price;
    }
}
