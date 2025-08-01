// 8. Write a program which takes in 10 people’s age and gives 
// number of people who are <18, 18-60, >60.

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 10;
        int[] ages = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) 
            ages[i] = scanner.nextInt();

        countPeople(ages);
        scanner.close();
    }

    static void countPeople(int[] ages) {
        int under_18 = 0, between_18_and_60 = 0, above_60 = 0;

        for(int age : ages) {
            if(age < 18)
                under_18++;
            else if(age <= 60)
                between_18_and_60++;
            else
                above_60++;
        }
        
        System.out.println("Number of people under 18: " + under_18);
        System.out.println("Number of people between 18 and 60: " + between_18_and_60);
        System.out.println("Number of people above 60: " + above_60);
    }
}
