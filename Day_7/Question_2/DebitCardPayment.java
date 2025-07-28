class DebitCardPayment implements PaymentGateway {
    public void pay(Account account, double amount) {
        if(account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("cant pay insufficent balance");
        }
    }
}