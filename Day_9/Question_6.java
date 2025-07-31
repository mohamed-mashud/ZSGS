// 6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
// --->It must be exactly 4 digits long.
// --->It should contain only numeric characters.
// --->It must not start with 0.
// Display an appropriate message whether the PIN is valid or invalid.

import java.util.Scanner;

// Custom Exception for handling PIN
class PINNotValidException extends RuntimeException {
    public PINNotValidException(String message) {
        super(message);
    }
}

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String PIN = scanner.nextLine();
        
        try {
            validatePIN(PIN);
        } catch (PINNotValidException e) {
            System.out.println("Invalid PIN: " + e.getMessage());
        }    

        scanner.close();
    }    

    public static void validatePIN(String PIN) {
        if(PIN.length() != 4) 
            throw new PINNotValidException("PIN must be exactly 4 digits long.");
        else if(PIN.charAt(0) == '0')     
            throw new PINNotValidException("PIN should not start with '0'.");
        else if(containsNumericValues(PIN) == false)     
            throw new PINNotValidException("PIN must only contains numeric values.");
        
        System.out.println("Valid PIN");
    }        

    public static boolean containsNumericValues(String PIN) {
        for (int i = 0; i < PIN.length(); i++) {
            char ch = PIN.charAt(i);

            if(
                ('0' <= ch && ch <= '9') == false
            )      
                return false;
        }        
        return true;
    }    
}    



