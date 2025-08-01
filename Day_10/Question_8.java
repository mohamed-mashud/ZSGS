//8. Develop a Java program to manage a list of bank accounts using ArrayList.
//--->Create an Account class with the following attributes:
//a. accountNumber (int)
//b. holderName (String)
//c. balance (double)
//--->Use autoboxing to store the balance and interest as Double wrapper objects.
//--->Use manual boxing to convert a primitive interest rate into a Double object.
//--->Unbox the values (both automatic and manual) to calculate and update the new balance.
//--->Add at least three Account objects to an ArrayList<Account>.
//--->For each account:
//a. Display the holder name, account number, original balance
//b. Apply 5% interest
//c. Show the new balance using primitive values (unboxed).

import java.util.ArrayList;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        ArrayList<Account> accounts = new ArrayList<>();
        Account.setInterestRate(5.0);

        for(int i = 0; i < n; i++) {
            System.out.println("Enter account number: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter account holder name: ");
            String holderName = scanner.nextLine();
            System.out.println("Enter account balance: ");
            double balance = scanner.nextDouble();

            // Autoboxing
            accounts.add(new Account(accountNumber, holderName, balance));
        }

        double interestRate = (double)Account.getInterestRate();
        for(Account account : accounts) {
            double accountBalance = account.getBalance();
            System.out.println("Before adding Interest:" + account.toString());

            double interestAmount = getInterestAmount(interestRate, accountBalance);
            account.setBalance(accountBalance + interestAmount);

            System.out.println("After adding interest: \n" + account.toString());
        }
    }

    public static double getInterestAmount(double interestRate, double accountBalance) {
        return interestRate / 100.0 * accountBalance;
    }
}


class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private static double interestRate;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
