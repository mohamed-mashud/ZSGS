// --- stringutils: This package should include a class that defines methods for:
// a. Concatenating two strings
// b. Reversing a string
// c. Finding the length of a string

package stringutils;

public class StringUtilities {    
    public String concatStrings(String a, String b) {
        return a + b;
    }

    public String reversedString(String a) {
        char[] ch = a.toCharArray();

        int i = 0, j = ch.length - 1;

        while(i < j) {
            swap(ch, i++, j--);
        }
        return new String(ch);
    }

    public int getLength(String a) {
        return a.length();
    }

    private void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
