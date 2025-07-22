// 7. Write a program to check if a number is a power of 2?
import java.util.Scanner;

public class Question7 {
    public static boolean isAPowerOf2(int num) {
        if (num <= 0)   return false;
        return (num & (num - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        
        boolean powerOf2 = isAPowerOf2(number);
        if(powerOf2)
            System.out.println(number + "is a power of 2");
        else
            System.out.println(number + "is a power of 2");
    }
}
