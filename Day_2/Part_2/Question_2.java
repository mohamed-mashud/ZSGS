// 2. Write a program to take in 10 values and 
// print only those numbers which are prime.

import java.util.Scanner;

public class Question_2 {
    /*
     * Take 10 values from user and get highest value
     * use seive of eranthrose and mark the rest as 
     * false print values only of prime
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int max = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        boolean[] isPrime = new boolean[max + 1]; 
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true; 
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers from nums:");
        for (int i = 0; i < 10; i++) {
            if (nums[i] >= 2 && nums[i] <= max && isPrime[nums[i]]) {
                System.out.print(nums[i] + " ");
            }
        }

        scanner.close();
    }
}