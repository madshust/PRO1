package Opgave9_2;

import java.util.function.Predicate;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getSymbol(){
        return symbol;
    }

    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getChangePercent(){

        // ((v2-v1)/v1) * 100
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }


}
