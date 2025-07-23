// 6. Define a method to convert the decimal number to a binary number?

public class Question_6 {
   public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        String binary_value_of_number = getBinaryValue(number);
        System.out.println("Binary value of " + number + " is " + binary_value_of_number);
   } 

   public static String getBinaryValue(int number) {
        return Integer.toBinaryString(number);
   }
}
