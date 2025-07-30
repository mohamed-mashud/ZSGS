// Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
/*  Hint:
// class Customer
// {
// //Personal Details ...
// // Few functions ...
// }
// class Account
// {
// // Account Detail ...
// // Few functions ...
// }
// abstract class RBI
// {
// Customer c; //hasA relationship
// Account a; //hasA relationship
// ..
// public abstract double getInterestRate();
// public abstract double getWithdrawalLimit();
// }
// class SBI extends RBI
// {
// //Use RBI functionality or define own functionality.
// }
// class ICICI extends RBI
// {
// //Use RBI functionality or define own functionality.
// }
*/
import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {

        Account sbiAccount = new Account("726362", "SBIN232409", "SBI", AccountType.CURRENT, 20_000);
        Account iciciAccount = new Account("726362", "ICICIN232409", "ICICI", AccountType.CURRENT, 20_000);
        
        Customer customer_a = new Customer("Ajay", "ajayrocks@gmail.com", "427638247687", sbiAccount);
        Customer customer_b = new Customer("Vijay", "vjkumar@gmail.com", "98765433259", iciciAccount);

        RBI SBI_BANK = new SBI();
        RBI ICICI_BANK = new ICICI();

        SBI_BANK.addAccount(sbiAccount);
        ICICI_BANK.addAccount(iciciAccount);

        SBI_BANK.transfer(sbiAccount, iciciAccount, 2_000);
        ICICI_BANK.transfer(iciciAccount, sbiAccount,  2_000);


        System.out.println(
            customer_a.toString() + "\n" + customer_b.toString()
        );
    }
}

abstract class RBI {
    static final int MIN_INTEREST_RATE = 4;
    static final double MIN_BALANCE_ALLOWED = 1_000;
    static final double MAX_WITHDRAWL_LIMIT = 40_000;

    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();
    public abstract double getMinBalance();
    public abstract void addAccount(Account account);

    public void transfer(Account payer, Account payee, double amount) {
        double payerBalance = payer.getBalance();
        double payeeBalance = payee.getBalance();

        if (payerBalance - getMinBalance() >= amount && getWithdrawalLimit() >= amount) {
            payer.setBalance(payerBalance - amount);
            payee.setBalance(payeeBalance + amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed: Insufficient balance or exceeds limits.");
        }
    }
}

class SBI extends RBI {
    final double ADDITIONAL_MIN_BALANCE = 1_000; 
    final int ADDITIONAL_INTEREST_RATE = 2;
    final double ADDITIONAL_WITHDRAWL_LIMIT = 10_000;

    private final int INTEREST_RATE = MIN_INTEREST_RATE + ADDITIONAL_INTEREST_RATE;
    private final double WITHDRAWL_LIMIT = MAX_WITHDRAWL_LIMIT + ADDITIONAL_WITHDRAWL_LIMIT;
    private final double MIN_BALANCE = MIN_BALANCE_ALLOWED + ADDITIONAL_MIN_BALANCE;
    private final List<Account> SBI_ACCOUNTS;

    public SBI() {
        SBI_ACCOUNTS = new ArrayList<>();
    }

    @Override
    public void addAccount(Account account) {
        SBI_ACCOUNTS.add(account);
    }

    @Override
    public double getInterestRate() {
        return this.INTEREST_RATE;
    }

    @Override
    public double getWithdrawalLimit() {
        return this.WITHDRAWL_LIMIT;
    }

    @Override
    public double getMinBalance() {
        return this.MIN_BALANCE;
    }
}

class ICICI extends RBI {
    final double ADDITIONAL_MIN_BALANCE = 500; 
    final int ADDITIONAL_INTEREST_RATE = 3;
    final double ADDITIONAL_WITHDRAWL_LIMIT = 20_000;

    private final int INTEREST_RATE = MIN_INTEREST_RATE + ADDITIONAL_INTEREST_RATE;
    private final double WITHDRAWL_LIMIT = MAX_WITHDRAWL_LIMIT + ADDITIONAL_WITHDRAWL_LIMIT;
    private final double MIN_BALANCE = MIN_BALANCE_ALLOWED + ADDITIONAL_MIN_BALANCE;
    private final List<Account> ICICI_ACCOUNTS;

    public ICICI() {
        ICICI_ACCOUNTS = new ArrayList<>();
    }

    @Override
    public void addAccount(Account account) {
        ICICI_ACCOUNTS.add(account);
    }

    @Override
    public double getInterestRate() {
        return this.INTEREST_RATE;
    }

    @Override
    public double getWithdrawalLimit() {
        return this.WITHDRAWL_LIMIT;
    }

    @Override
    public double getMinBalance() {
        return this.MIN_BALANCE;
    }
}