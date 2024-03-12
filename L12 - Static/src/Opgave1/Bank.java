package Opgave1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(1000);
        BankAccount account3 = new BankAccount(1000);
        BankAccount account4 = new BankAccount(1000);
        BankAccount account5 = new BankAccount(1000);
        BankAccount account6 = new BankAccount(1000);
        BankAccount account7 = new BankAccount(1000);
        BankAccount account8 = new BankAccount(1000);
        BankAccount account9 = new BankAccount(1000);
        BankAccount account10 = new BankAccount(1000);
        BankAccount account11 = new BankAccount(1000);
        BankAccount account12 = new BankAccount(1000);

        System.out.println(account5);
        System.out.printf("%.2f\n",account5.getBalance(5));
        System.out.println(account11);
        System.out.printf("%.2f\n",account11.getBalance(5));
        System.out.println("Number of accounts in Bank " +BankAccount.getNumberOfAccounts());


    }
}
