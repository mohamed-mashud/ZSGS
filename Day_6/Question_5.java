// 5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.

public class Question_5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, "John Doe", 1000.0);

        account.deposit(10);
        account.withdraw(100000000);
        System.out.println(account.getBalance());  
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("Cant deposit negative amount");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("Cant withdraw negative amount");
        } else if (this.balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }
}
