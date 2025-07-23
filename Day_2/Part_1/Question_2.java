// 2. Write a program to do the following patterns using for loop?
//  1          1     
//     1    1       
//       1
//     1    1        
//  1          1   

// R R R R R 
// R       R 
// R R R R R 
// R     R   
// R       R 

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for x pattern: ");
        int n = scanner.nextInt();
        print_1_in_x_format(n);

        System.out.println("Enter for R pattern: ");
        int r = scanner.nextInt();
        print_r(r);
    }

    public static void print_1_in_x_format(int n) {
        if(n % 2 == 0) {
            System.out.println("Not possible with even numbers");
            return;
        }
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < n; j++) {
                if(
                    (i == j) || (i + j == n - 1)
                )  
                   System.out.print("1 ");
                else 
                    System.out.print(" ");
            }
    }
    
    public static void print_r(int rows) {
        if(rows % 2 == 0) {
            System.out.println("Not possible with even numbers");
            return;
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if(
                    i == 1 || j == 1 || 
                    i == (rows / 2) + 1 || 
                    (j == rows && i < (rows / 2) + 1) || 
                    (i > (rows / 2) + 1 && i == j) 
                )
                    System.out.print("R ");
                else 
                    System.out.print("  ");
            }
        }
    }
}