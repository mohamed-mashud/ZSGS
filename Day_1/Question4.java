// 4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

public class Question4 {
    public static void main(String[] args) {
        // generates a random double value within 0.0 to 1.0 
        // multiply it by 100 gets the values between 0 to 100
        // converting it to int after that
        int number_1 = (int) (Math.random() * 100);
        int number_2 = (int) (Math.random() * 100);

        int xor_of_numbers = number_1 ^ number_2;

        switch(xor_of_numbers) {
            case 0:
                System.out.println("Numbers are same");
                break;
            default:
                System.out.println("Numbers are not same");
                break;
        }
    }
}
