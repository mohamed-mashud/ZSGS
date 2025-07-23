// 1. Given two binary strings a and b, return their sum as a 
// binary string.
// Input: a = "11", b = "1"
// Output: "100"
// ‌
// Input: a = "1010", b = "1011"
// Output: "10101"
// ‌
// Constraints:
// 1 <= a.length, b.length <= 10^4
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the 
// zero itself.

import java.util.Scanner;


public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        String addition = addBinaryString(a, b);
        System.out.println(addition);
    }        

    static String addBinaryString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while(i >= 0 && j >= 0) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(j);

            int sum = carry;
            sum += (ch1 - '0') + (ch2 - '0');
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        while(i >= 0) {
            char ch1 = a.charAt(i);
            int sum = carry;
            sum += (ch1 - '0');
            result.append(sum % 2);
            carry = sum / 2;
            i--;
        }
        while(j >= 0) {
            char ch2 = b.charAt(j);
            int sum = carry;
            sum += (ch2 - '0');
            result.append(sum % 2);
            carry = sum / 2;
            j--;
        }
        if(carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
