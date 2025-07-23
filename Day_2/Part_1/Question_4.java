// 4. Write a program to do the following patterns using 
// do...while loop?
// a) Pascal Triangle
// b) ZOHO
// CORP
// ORAT
// IONS
public class Question_4 {
    public static void main(String[] args) {
        
        String string = "ZOHOCORPORATIONS";
        int n = string.length();

        if(!isASqaure(n)) {
            System.out.println("Not possible");
            return;
        }

        int sqrt_n = (int) Math.sqrt(n);
        char[][] chars = new char[sqrt_n][sqrt_n];

        for(int i = 0; i < n; i++) {
            chars[i / sqrt_n][i % sqrt_n] = string.charAt(i);
        }

        printMatrix(chars);
    }

    static void printMatrix(char[][] chars) {
        for(char[] row : chars) {
            for(char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    
    static boolean isASqaure(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
