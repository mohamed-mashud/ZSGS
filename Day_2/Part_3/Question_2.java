
// 2. Given an integer number, return its corresponding column title as it appears in an Excel sheet.
// ‌
// For example:
// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28
// ...
// ‌
// Example 1:
// Input: number = 1
// Output: "A"
// ‌
// Example 2:
// Input: number = 28
// Output: "AB"
// ‌
// Example 3:
// Input: number = 701
// Output: "ZY"
// ‌
// Constraints:
// 1 <= number <= 2^31 - 1

import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(columnTitle(number));
        scanner.close();
    }

    static String columnTitle(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            number--; 
            int remainder = number % 26;
            result.append((char) ('A' + remainder));
            number /= 26;
        }

        return result.reverse().toString();
    }
}
