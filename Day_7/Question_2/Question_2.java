// 2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name and account no: ");

        String name = scanner.nextLine();
        String accountNo = scanner.nextLine();
        Account account = new Account(name, accountNo);

        DebitCardPayment debitCardPayment = new DebitCardPayment();
        System.out.println("Enter amount");
        double amount = scanner.nextDouble();
        debitCardPayment.pay(account, amount);
        
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        System.out.println("Enter amount");
        double amount_credit = scanner.nextDouble();
        creditCardPayment.pay(account, amount_credit);
        
        UPIPayment upiPayment = new UPIPayment();
        System.out.println("Enter amount");
        double amount_upi = scanner.nextDouble();
        upiPayment.pay(account, amount_upi);
    }
}