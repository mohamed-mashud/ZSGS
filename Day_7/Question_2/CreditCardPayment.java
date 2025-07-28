class CreditCardPayment implements PaymentGateway{
    private final int CREDIT_LIMIT = 20_000;

    public void pay(Account account, double amount) {
        double account_credit = account.getCreditAmount();
        if(account_credit + amount > CREDIT_LIMIT) {
            System.out.println("cant process payment due to credit limit");
            return;
        }

        account.addCreditAmount(amount);
    }
}