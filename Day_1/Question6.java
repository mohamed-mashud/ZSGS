// 6. Write a program that illustrate the Explicit type casting?

public class Question6 {
    public static void main(String[] args) {
      
        // generates a random double value within 0.0 to 1.0 
        // multiply it by 100 gets the values between 0 to 100
        // converting it to int after that with explicit type casting
        double random_value = Math.random() * 100;
        int number = (int) random_value;

        System.out.println(number);
    }
}
