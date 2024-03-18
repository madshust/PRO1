package Opgave1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        for (int i = 0; i < 10; i++)
            accounts.add(new BankAccount(100));

        // termination bools
        boolean finished = false;

        while (!finished) {
            boolean menu = false;
            int iD = 0;
            // prompt for input
            System.out.println("Please enter account ID: ");
            iD = input.nextInt();
            // check for valid input
            if (iD > accounts.size()-1 || iD < 0) {
                System.out.println("Not a valid ID");
            } else {
                while (!menu) {
                    int choice = 0;
                    double amount = 0;
                    System.out.println("==============================");
                    System.out.println("=============MENU=============");
                    System.out.println("Please choose an option:");
                    System.out.println("1: View balance");
                    System.out.println("2: Withdraw");
                    System.out.println("3: Deposit");
                    System.out.println("4: Exit to main menu");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You current balance is: " + accounts.get(iD).getBalance());
                            System.out.println("return to menu? ");
                            String enter = input.nextLine();
                            break;

                        case 2:
                            System.out.println("Please enter amount: ");
                            amount = input.nextDouble();
                            accounts.get(iD).withdraw(amount);
                            System.out.printf("%.2f withdrawn from account %d. New balance is %.2f\n", amount, iD, accounts.get(iD).getBalance());
                            break;
                        case 3:
                            System.out.println("Please enter amount: ");
                            amount = input.nextDouble();
                            accounts.get(iD).deposit(amount);
                            System.out.printf("%.2f deposited to account %d. New balance is %.2f\n", amount, iD, accounts.get(iD).getBalance());
                            break;
                        case 4:
                            menu = true;
                    }

                }

            }
        }
    }
}
