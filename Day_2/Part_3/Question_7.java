// 7. Given a string s, return the number of segments in the string.
// ‌
// A segment is defined to be a contiguous sequence of non-space characters.
// ‌
// Example 1:
// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
// ‌
// Example 2:
// Input: s = "Hello"
// Output: 1
// ‌
// Constraints:
// 0 <= s.length <= 300
// s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
// The only space character in s is ' '.

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countSegments(s));
        scanner.close();
    }

    static int countSegments(String s) {
        int count = 0;
        boolean character_found = false;
        for(char ch : s.toCharArray()) {
            if (ch != ' ') {
                character_found = true;
            } else {
                if(character_found) count++;
                character_found = false;
            }
        }
        if(character_found) count++;
        return count;
    }
}
