// 3. Write a program which generates 30 terms of Fibonacci 
// no in an array and then prints it.
public class Question_3 {
    public static void main(String[] args) {
        int terms = 30;
        int[] dp = new int[terms + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= terms; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        printArr(dp);
    } 
    public static void printArr(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
    }
}
