class UPIPayment implements PaymentGateway {
    public void pay(Account account, double amount) {
        DebitCardPayment debitCardPayment = new DebitCardPayment();
        debitCardPayment.pay(account, amount);
    }
}