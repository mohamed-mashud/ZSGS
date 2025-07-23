// 3. Given a string s, reverse only all the vowels in the string and return it.
// ‌
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
// ‌
// Example 1:
// Input: s = "hello"
// Output: "holle"
// ‌
// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"
// ‌
// Constraints:
// 1 <= s.length <= 3 * 10^5
// s consist of printable ASCII characters.

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String rev_vowles = getReversedString(s);
        System.out.println(rev_vowles);
        scanner.close();
    }        

    static String getReversedString(String str) {
        char[] ch = str.toCharArray();

        int n = ch.length, i = 0, j = n - 1;
        while(i < j) {
            while(i < j && !isVowel(ch[i])) i++;
            while(i < j && !isVowel(ch[j])) j--;

            swap(ch, i, j);
            i++; j--;
        }
        return new String(ch);
    }

    static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
}
