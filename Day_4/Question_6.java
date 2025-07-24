// 6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
// 1. int length() – Returns the number of characters.
// 2. char charAt(int index) – Returns the character at the specified index.
// 3. boolean equals(MyString other) – Checks if two MyString objects are equal.
// 4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
// 5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
// 6. MyString substring(int start, int end) – Returns a substring from start to end-1.
// 7. MyString concat(MyString other) – Concatenates another string to the current one.
// 8. boolean contains(MyString sub) – Checks if a substring exists.
// 9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
// 10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
// * Implement proper constructors, including one that takes a char[] or String as input.
// * Avoid using any built-in String methods to perform the operations internally.
// * Write a main method to demonstrate the working of your MyString class.

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String val");

        String input = scanner.nextLine();
        MyString string = new MyString(input);
        System.out.println("Length: " + string.length());

        System.out.print("Characters: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();

        System.out.println("Enter another String to test equals:");
        String input2 = scanner.nextLine();
        MyString string2 = new MyString(input2);
        System.out.println("Equals? " + string.equals(string2));

        System.out.println("To Upper Case: " + string.toUpperCase());
        System.out.println("To Lower Case: " + string.toLowerCase());

        System.out.println("Enter substring start index:");
        int start = scanner.nextInt();
        System.out.println("Enter substring end index:");
        int end = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Substring: " + string.substring(start, end));

        System.out.println("Enter String to concatenate:");
        String concatStr = scanner.nextLine();
        MyString concatMyString = new MyString(concatStr);
        string.concat(concatMyString);
        System.out.println("After concatenation: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
        }
        System.out.println();

        System.out.println("Enter substring to check contains:");
        String containsStr = scanner.nextLine();
        MyString containsMyString = new MyString(containsStr);
        System.out.println("Contains? " + string.conatains(containsMyString));

        System.out.println("Enter character to find indexOf:");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("Index of '" + ch + "': " + string.indexOf(ch));

        System.out.println("Enter character to replace:");
        char oldCh = scanner.nextLine().charAt(0);
        System.out.println("Enter new character:");
        char newCh = scanner.nextLine().charAt(0);
        string.replace(oldCh, newCh);
        System.out.println("After replace: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
        scanner.close();
    }
}

class MyString {
    private char[] data;

    public MyString(String string) {
        data = getCharArr(string);
    }

    
    public int length() {
        return data.length;
    }

    public char charAt(int indx) {
        if(indx >= data.length) return ' ';
        return data[indx];
    }

    public boolean equals(MyString other) {
        char other_data[] = getCharArr(other);
        
        if(data.length != other_data.length)    return false;
        for(int i = 0; i < data.length; i++) {
            if(data[i] != other_data[i])
                return false;
            }
            return true;
        }
        
        public char[] toCharArray() {
            return this.data;
        }

    public String toUpperCase() {
        char[] upperCaseData = new char[data.length];
        for(int i = 0; i < data.length; i++) {
            int diff =  'a' - 'A';
            if('a' <= data[i] && data[i] <= 'z')
            upperCaseData[i] = (char) ('a' - diff);
            else 
            upperCaseData[i] = data[i]; 
        }
        return getString(upperCaseData);
    }

    public String toLowerCase() {
        char[] lowerCaseData = new char[data.length];
        for(int i = 0; i < data.length; i++) {
            int diff =  'a' - 'A';
            if('A' <= data[i] && data[i] <= 'Z')
            lowerCaseData[i] = (char) (diff + 'a');
            else 
            lowerCaseData[i] = data[i]; 
        }
        return getString(lowerCaseData);
    }

    public String substring(int start, int end) {
        String sub = "";
        for(int i = start; i < end; i++) {
            sub += data[i];
        }
        return sub;
    }

    public void concat(MyString other) {
        char[] other_data = other.getCharArr(other);
        char[] newData = new char[data.length + other_data.length];

        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        for(int i = data.length; i < newData.length; i++) {
            newData[i] = other_data[i - data.length];
        }   
        data = newData;
    }
    
    public boolean conatains(MyString sub) {
        int subLength = sub.data.length;
        for(int i = 0; i <= data.length - subLength; i++) {
            boolean match = true;
            for(int j = 0; j < subLength; j++) {
                if(data[i + j] != sub.data[j]) {
                    match = false;
                    break;
                }
            }
            if(match) return true;
        }
        return false;
    }
    
    public int indexOf(char ch) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == ch) return i;
        }
        return -1;
    }
    
    public void replace(char oldChar, char newChar) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == oldChar) {
                data[i] = newChar;
            }
        }
    }
    
    public char[] getCharArr(MyString string) {
        char[] charArray = new char[string.length()];
        for(int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }

    public String getString(char[] ch) {
        String str = "";
        for(int i = 0; i < ch.length; i++) {
            str += ch[i];
        }
        return str;
    }

    private char[] getCharArr(String string) {
        char[] charArr = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charArr[i] = string.charAt(i);
        }
        return charArr;
    }
}
