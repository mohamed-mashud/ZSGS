// 8. Write a program to find the first set bit of a number?
import java.util.Scanner;

public class Question8 {
    public static int getPositionOfFirstSetBit(int n) {
        int position = 1;
        
        while ((n & 1) == 0) {
            n = n >> 1;
            position++;
        }
        return position;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int position = getPositionOfFirstSetBit(number);
        // from right
        System.out.println("The position of the first set bit is: " + position);
        scanner.close();
   } 
}