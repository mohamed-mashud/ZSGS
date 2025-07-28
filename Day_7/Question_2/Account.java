class Account {
    String name;
    String accountNo;
    
    // debit balance
    private double balance;
    // credit balance
    private double creditAmount = 0;

    public Account(String name, String accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }
    
    public double getCreditAmount() {
        return creditAmount;
    }

    public void addCreditAmount(double amount) {
        creditAmount += amount;
    }

    public double getBalance()  { return this.balance; }
    
    public void setBalance(double amount)  { 
        this.balance = amount;
    }
}