// 7. Write a program to input and store the weight of ten people.
// Sort and display them in descending order using the Selection sort technique.
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 10;
        int[] weights = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) 
            weights[i] = scanner.nextInt();

        sortInDesc(weights);
        printArray(weights);

        scanner.close();
    }

    static void sortInDesc(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            int max_indx = 0;
            for(int j = i + 1; j < n; j++) {
                if(nums[max_indx] < nums[j])
                    max_indx = j;
            }
            swap(nums, i, max_indx);
        }
    }

    static void printArray(int[] nums) {
        for(int i : nums)
            System.out.print(i + " ");
    }

    static void swap(int[] nums, int indx1, int indx2) {
        int temp = nums[indx1];
        nums[indx1] = nums[indx2];
        nums[indx2] = temp;
    }
}
