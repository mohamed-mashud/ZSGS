// 5. Write a program to initialize the following character 
// arrays and print a suitable message after checking the 
// arrays whether the two arrays are identical or not. Make 
// suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} 
// and Y[] =('m', 'n', 'o', 'p' }

public class Question_5 {
    public static void main(String[] args) {
        char x[] = {'m', 'n', 'o', 'p'};
        char y[] = {'m', 'n', 'o', 'p'};
        boolean identical = isIdentical(x, y);

        if(identical)   System.out.println("Same array");
        else            System.out.println("Different array");
    }
    
    public static boolean isIdentical(char a[], char b[]) {
        if(a.length != b.length) return false;

        for(int i = 0; i < a.length; i++) 
            if(a[i] != b[i]) return false;

        return true;
    }
}
