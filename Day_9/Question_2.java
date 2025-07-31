// 2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers,
// and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNum1 = scanner.nextLine();
        String stringNum2 = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(stringNum1);
            int num2 = Integer.parseInt(stringNum2);

            double result = (double) num1 / num2;
            System.out.println(result);
        
        } catch (InputMismatchException e) {
            System.out.println("InputMismatch "+ e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number fromat excception "+ e.getMessage());
        } catch ( ArithmeticException e) {
            System.out.println("Arithmetic exception " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: "  + e.getMessage());
        }
        scanner.close();
    } 
}
