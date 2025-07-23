// 1. Write a program that uses if statement to find the minimum of three numbers.

public class Question_1 {
    public static void main(String[] args) {
        
        // generates a random double value within 0.0 to 1.0 
        // multiply it by 100 gets the values between 0 to 100
        // converting it to int after that
        int number_1 = (int) (Math.random() * 100);
        int number_2 = (int) (Math.random() * 100);
        int number_3 = (int) (Math.random() * 100);

        int min_of_3_numbers = number_1;

        if(number_1 < number_2 && number_1 < number_3)  min_of_3_numbers = number_1;
        else if(number_2 < number_1 && number_2 < number_3)  min_of_3_numbers = number_2;
        else min_of_3_numbers = number_3;

        System.out.println("Min of three numbers is " + min_of_3_numbers);
    } 
}
