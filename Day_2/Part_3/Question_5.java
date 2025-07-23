// 5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// ‌
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
// ‌
// Example 1:
// Input: s = "abc", t = "ahbgdc"
// Output: true
// ‌
// Example 2:
// Input: s = "axc", t = "ahbgdc"
// Output: false
// ‌
// Constraints:
// 0 <= s.length <= 100
// 0 <= t.length <= 10^4
// s and t consist only of lowercase English letters.
// ‌
// Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        boolean is_subseq = isASubsequence(s, t);
        if(is_subseq)
            System.out.println("true");
        else 
            System.out.println("false");
        scanner.close();
    }

    static boolean isASubsequence(String s, String t) {
        int sn = s.length();
        int tn = t.length();

        if(sn > tn) {
            return false;
        }

        int i = 0, j = 0;
        while(i < sn) {
            char c = s.charAt(i);
            while(j < tn) {
                if(t.charAt(i) == c)
                    break;
                j++;
            }    
            if(j == tn) {
                break;
            }
            i++;
            j++;
        }
        return i == sn;
    }
}
