// 4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringFromUser = scanner.nextLine();
        
        try {
            int integerValue = Integer.parseInt(stringFromUser);
            System.out.println("The integer value is: " + integerValue);
        } catch (NumberFormatException e) {
            System.out.println(
                "Invalid input. Please enter a valid number." + e.getMessage()
            );
        }

        scanner.close();
    }
}
