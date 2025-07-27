// 10. Write a menu driven program to do following operation on 
// two dimensional array A of size m x n. You should use 
// user-defined methods which accept 2-D array A, and its size 
// m and n as arguments. The options are:
// ● To input elements into matrix of size m x n
// ● To display elements of matrix of size m x n
// ● Sum of all elements of matrix of size m x n
// ● To display row-wise sum of matrix of size m x n
// ● To display column-wise sum of matrix of size m x n
// ● To create transpose of matrix of size n x m

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row count : ");
        int m = scanner.nextInt();
        System.out.println("Enter the col count : ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];
        
        // inputs the matrix
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
                arr[i][j] = scanner.nextInt();
        
        printMatrix(arr); 
        int sum = sumOfElements(arr);
        System.out.println("Sum of all elements of matrix of size m x n : "+ sum);

        int[] row_wise_sum = rowSum(arr);
        System.out.println("Row-wise sum of matrix of size m x n : "); printArr(row_wise_sum);

        int[] col_wise_sum = colSum(arr);
        System.out.println("Col-wise sum of matrix of size m x n : ");
        printArr(col_wise_sum);

        int[][] transpose_arr = transpose(arr);
        printMatrix(arr);
        scanner.close();
    }    

    static void printMatrix(int[][] arr) {
        for(int[] x : arr) {
            for(int i : x) 
                System.out.print(i + " ");
            System.out.println();
        }
    }
    
    static int sumOfElements(int[][] arr) {
        int sum = 0;
        for(int[] x : arr) 
            for(int i : x) 
                sum += i;
        return sum;
    }

    static int[] rowSum(int[][] arr) {
        int[] row_wise_sum = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                }
            row_wise_sum[i] = sum;
        }
        return row_wise_sum;
    }

    static int[] colSum(int[][] arr) {
        int[] col_wise_sum = new int[arr[0].length];
        for(int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int[] arr1 : arr) {
                sum += arr1[j];
            }
            col_wise_sum[j] = sum;
        }
        return col_wise_sum;
    }

    static void printArr(int[] arr) {
        for(int i : arr)    
            System.out.print(i + " ");
    }

    static int[][] transpose(int[][] arr) {
        int[][] transpose_arr = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                transpose_arr[j][i] = arr[i][j];
            }
        }
        return transpose_arr;
    }

}
