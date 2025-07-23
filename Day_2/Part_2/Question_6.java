// 6. Write a program to accept the year of graduation from 
// school as an integer value from the users . Using the Binary 
// search technique on the sorted array of integers given 
// below . Output the message “record exists" if the value 
// input is located in the array and if not output the message 
// record does not exits”.
// {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        int[] graduation_years = {
            1982, 1987, 1993, 1996, 1999,
            2003, 2006, 2007, 2009, 2010, 2016, 2002
        };

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        boolean record_exists = isRecordExists(graduation_years, year);

        if(record_exists)
            System.out.println("Record exists");
        else 
        System.out.println("Record does not exist");
        
        scanner.close();
    }

    public static boolean isRecordExists(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)     return true;
            else if(nums[mid] < target) low = mid + 1;
            else                        high = mid - 1;
        }

        return false;
    }
}
