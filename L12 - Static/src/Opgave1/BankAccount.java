package Opgave1;

public class BankAccount {
    private double balance;
    private int iD = 0;
    private static int iDnumber = 0;
    private double rate;

    public BankAccount(double initialBalance) {
        iDnumber++;
        this.iD = iDnumber;
        balance = initialBalance;
        if (iD <= 10)
            this.rate = 0.05;
        else
            this.rate = 0.035;
    }

    public int getiD() {
        return iD;
    }

    public static int getNumberOfAccounts() {
        return iDnumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getBalance(int years) {
        return balance * Math.pow((1 + rate), years);
    }

    @Override
    public String toString() {
        return "BankAccount: " + iD;
    }
}
