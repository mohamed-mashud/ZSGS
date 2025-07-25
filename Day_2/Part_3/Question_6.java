

// 6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
// ‌
// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
// ‌
// Example 1:
// Input: num1 = "11", num2 = "123"
// Output: "134"
// ‌
// Example 2:
// Input: num1 = "456", num2 = "77"
// Output: "533"
// ‌
// Example 3:
// Input: num1 = "0", num2 = "0"
// Output: "0"
// ‌
// Constraints:
// 1 <= num1.length, num2.length <= 10^4
// num1 and num2 consist of only digits.
// num1 and num2 don't have any leading zeros except for the zero itself.
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        System.out.println(addStrings(num1, num2));
        scanner.close();
    }    

    static String addStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0, sum = 0;
        while(i >= 0 && j >= 0) {
            sum = (a.charAt(i--) - '0') + (b.charAt(j--) - '0');
            result.append(sum % 10);
            carry = sum / 10;
        }

        while(i >= 0) {
            sum = (a.charAt(i--) - '0') + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        while(j >= 0) {
            sum = (b.charAt(j--) - '0') + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0)   result.append(carry);

        return result.reverse().toString();
    }
}
