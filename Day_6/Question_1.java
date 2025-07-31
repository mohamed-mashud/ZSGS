// 1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]

public class Question_1 {
    public static void main(String[] args) {
        User payer = new User();
        User payee = new User();

        payer.setName("Dude_A");
        payee.setName("Dude_B");
        
        PaymentGatewaySystem transaction = new PaymentGatewaySystem();
        transaction.setTransactionId(1001);
        transaction.setPayer(payer);
        transaction.setPayee(payee);
        transaction.setAmount(2500.75);
        transaction.setTransactionStatus(true);

        transaction.displayTransactionSummary();
    }
}

class User {
    private String name;
    private int id;
    static int count = 0;

    public User() {
        this.id = getCount();
    }

    public int getCount() {
        return ++count;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setUserName(String name2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUserName'");
    }

    public void setPassword(String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPassword'");
    }
}

class PaymentGatewaySystem {
    private int transactionId;
    private User payer;
    private User payee;
    private double amount;
    private boolean transactionStatus;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public User getPayee() {
        return payee;
    }

    public void setPayee(User payee) {
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public void displayTransactionSummary() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payer: " + payer.getName());
        System.out.println("Payee: " + payee.getName());
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Status: " + (transactionStatus ? "Successful" : "Failed"));
    }
}
