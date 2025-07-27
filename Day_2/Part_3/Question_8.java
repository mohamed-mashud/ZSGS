// 8. We define the usage of capitals in a word to be right when one of the following cases holds:
// 1. All letters in this word are capitals, like "USA".
// 2. All letters in this word are not capitals, like "leetcode".
// 3. Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.
// Example 1:
// Input: word = "USA"
// Output: true
// ‌
// Example 2:
// Input: word = "FlaG"
// Output: false
// ‌
// Constraints:
// 1 <= word.length <= 100
// word consists of lowercase and uppercase English letters.
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        boolean captilized = isCaptilized(word);
        if(captilized)
            System.out.println(true);
        else
            System.out.println(false);
        scanner.close();
    }

    static boolean isCaptilized(String word) {
        int count = 0;
        int n = word.length();
        if(n == 1)  return true;

        for(int i = 0; i < n; i++) {
            char ch = word.charAt(i);

            if(isUpperCase(ch))
                count++;
        } 

        return (count == 1 && isUpperCase(word.charAt(0))) || 
                (count == 0 || count == n);
    }

    static boolean isUpperCase(char ch) {
        return 'A' <= ch && ch <= 'Z';
    }
}
