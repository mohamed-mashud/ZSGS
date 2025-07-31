
import java.util.Scanner;

// 10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.

public class Question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        try {
            validateAge(age);
        } catch (IneligibleToVoteException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }    

    private static void validateAge(int age) {
        if (age < 18) {
            throw new IneligibleToVoteException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote go ahead and change the country");
        }
    }
}

class IneligibleToVoteException extends RuntimeException {
    public IneligibleToVoteException(String message) {
        super(message);
    }
}
