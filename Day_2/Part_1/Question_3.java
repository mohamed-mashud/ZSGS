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
        int mid = rows / 2;
        int num = 1;

        // Upper half including middle
        int i = 0;
        while (i <= mid) {
            int k = rows - i;
            while (k > 0) {
                System.out.print(" ");
                k--;
            }

            int j = 0;
            while (j <= i) {
                System.out.printf("%d",num++);
                j++;
            }
            System.out.println();
            i++;
        }

        // Lower half
        i = mid + 1;
        while (i > 0) {
            int k = 0;
            while (k < rows - i + 2) {
                System.out.print(" ");
                k++;
            }

            int j = 0;
            while (j < i - 1) {
                System.out.printf("%3d",num++);
                j++;
            }
            System.out.println();
            i--;
        }
    }
    static void printPyramid(int rows, char ch) {
        int mid = (rows / 2) + 1;
        int count = 1;
        int i = 1;

        while(i <= rows) {
            for(int time = 0; time < count; time++)
                System.out.print(ch + " ");
            if(i >= mid)
                count--;
            else
                count++;
            i++;
            System.out.println();
        }
    }
}
