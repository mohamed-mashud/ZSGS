public class Account {
    private String accountNo;
    private String IFSCCode;
    private String bankName;
    private double balance;
    AccountType accountType;

    public Account(
        String accountNo, String IFSCCode, 
        String bankName, AccountType accountType, double balance
    ) {
        this.accountNo = accountNo;
        this.IFSCCode = IFSCCode;
        this.bankName = bankName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "\nAccount number: " + this.accountNo +
                "\nIFSC code: " + this.IFSCCode + 
                "\nBank name: " + this.bankName +
                "\nAccount type: " + this.accountType +
                "\nBalance: " + this.balance;
    }
}