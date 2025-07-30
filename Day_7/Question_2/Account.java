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
    
    public Account(String string, String string2, String string3, AccountType current, int i) {
        //TODO Auto-generated constructor stub
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