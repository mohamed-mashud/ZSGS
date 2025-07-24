// 4. Write a program to do the following patterns using 
// do...while loop?
// a) Pascal Triangle
// b) ZOHO
// CORP
// ORAT
// IONS

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Enter 1 for pascals, 2 for sqaure"
        );
        switch (scanner.nextInt()) {
            case 1:
                System.out.print("Enter number of rows: ");
                int rows = scanner.nextInt();
                printPascals(rows);
                break;
            case 2:
                System.out.print("Enter the string val");
                String str = scanner.next();
                printSquare(str);
                break;
            default:
                throw new AssertionError();
        }
    }

    static void printMatrix(char[][] chars) {
        for(char[] row : chars) {
            for(char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    
    static boolean isASqaure(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    static void printPascals(int rows) {
        int i = 0;
        do {
            int coef = 1;
            int j = 0;
            do {
                if (j <= i) {
                    System.out.print(coef + " ");
                    coef = coef * (i - j) / (j + 1);
                }
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }

    static void printSquare(String string) {
        int n = string.length();

        if(!isASqaure(n)) {
            System.out.println("Not possible");
            return;
        }

        int sqrt_n = (int) Math.sqrt(n);
        char[][] chars = new char[sqrt_n][sqrt_n];

        for(int i = 0; i < n; i++) {
            chars[i / sqrt_n][i % sqrt_n] = string.charAt(i);
        }

        printMatrix(chars);
    }
}