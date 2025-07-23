// 4. Design a function void print( ) with a single dimensional 
// array x[ ] and n (as size of the array) as function 
// arguments. The function calculates sum of only single digit 
// and sum of only double digit elements from the array. Design 
// a main() function to input size of the array ‘len' and 
// single dimensional array of size 'len', and print the 
// required result by invoking the function print( ).

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) 
            nums[i] = scanner.nextInt();
        
        print(nums, n);
        scanner.close();
    }
    public static void print(int[] nums, int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for(int i : nums) {
            if(i < 10)  singleDigitSum += i;
            else if(10 <= i && i <= 99)
                doubleDigitSum += i;
        }

        System.out.println(singleDigitSum + " " + doubleDigitSum);
    }
}
