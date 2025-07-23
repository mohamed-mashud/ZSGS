/*
3. Write a program to do the following patterns using while loop?
a) 
        1
       2  3
      4  5  6
       7  8
        9
b)
    w 
    w w
    w w w 
    w w
    w
*/

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the odd number for rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the rows and char");
        int Rows = scanner.nextInt();
        char c = scanner.next().charAt(0);

        printDiamondNumbers(rows);
        printPyramid(Rows, c);
    }

    static void printDiamondNumbers(int rows) {
        
    }
    static void printPyramid(int rows, char ch) {

    }
}
