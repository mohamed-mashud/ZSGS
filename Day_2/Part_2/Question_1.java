// 1. Write a program that creates an integer array of 10 elements,
//  accepts values of arrays and Find the sum of all odd numbers.
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 
        int sumOfOdds = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 1) {
                sumOfOdds += numbers[i];
            }
        }
        
        System.out.println("Sum of all odd numbers is: " + sumOfOdds);
        scanner.close();
    }
}