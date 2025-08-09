// 6. Use Threads to implement the ATM machine, where create thread to check the PIN number
// another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.

import java.util.Scanner;

public class Question_6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ATMMachine ATM = new ATMMachine();
        System.out.println(ATM);

        int uid = Integer.parseInt(getInput("Enter user ID :"));
        User user = ATM.getUser(uid);
        if(user == null)    {
            System.out.println("User with the user id doesnt exist :-( \n Exiting..........");
            return;
        }

        String PIN = getInput("Enter PIN :");
        Thread checkPIN = new Thread(() -> {
            if(!ATM.checkPIN(user, PIN)) {
                System.out.println("Invalid PIN exiting.....");
                System.exit(1);
            }
        });
        checkPIN.setName("checkPIN");
        checkPIN.start();

        try {
            checkPIN.join();
        }catch (InterruptedException e){
            System.out.println("Exception caugth while joining checkPin thread " + e.getMessage());
        }

        long amount = Long.parseLong(getInput("Enter amount to withdraw: "));
        Thread cashWithdrawal = new Thread(() -> {
           ATM.withdraw(user, amount);
        });


        Thread checkBalance = new Thread(() -> {
            System.out.println("Balance amount is : " + ATM.checkBalance(user));
        });

        cashWithdrawal.setName("cashWithdrawal");
        checkBalance.setName("checkBalance");

        cashWithdrawal.start();
        checkBalance.start();
    }

    private static String getInput(String contents) {
        System.out.println(contents);
        return scanner.nextLine();
    }
}



