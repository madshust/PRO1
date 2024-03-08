package Opgave9_2;

public class StockApp {
    public static void main(String[] args) {
        Stock company = new Stock("ORCL", "Oracle Corporation");
        company.setPreviousClosingPrice(34.5);
        company.setCurrentPrice(34.35);
        System.out.printf("The percentage change for %s or %s is today: %.2f", company.getName(), company.getSymbol(), company.getChangePercent());
        System.out.print("%");
    }

}
