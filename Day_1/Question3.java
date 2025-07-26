// 3. Write a program to find the maximum of two numbers using ternary operator.

public class Question3 {
    public static void main(String[] args) {
        // generates a random double value within 0.0 to 1.0 
        // multiply it by 100 gets the values between 0 to 100
        // converting it to int after that
        int number_1 = (int) (Math.random() * 100);
        int number_2 = (int) (Math.random() * 100);

        System.out.println("The Maximum number is" + (
            number_1 > number_2 ? number_1 : number_2
        ));
    }
}
