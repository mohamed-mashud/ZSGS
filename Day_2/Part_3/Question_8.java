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
        boolean isAllCapitals = true;
        boolean isAllNotCapitals = true;
        boolean isOnlyFirstCapital = true;
        boolean isAnyCapital = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                isAllNotCapitals = false;
                isOnlyFirstCapital = false;
                isAnyCapital = true;
            } else 
                isAllCapitals = false;
        }
        return (isAllCapitals || isAllNotCapitals || (isOnlyFirstCapital && isAnyCapital));   
    }
}
