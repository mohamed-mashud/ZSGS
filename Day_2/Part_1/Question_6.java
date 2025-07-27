// 6. Define a method to convert the decimal number to a binary number?

public class Question_6 {
     public static void main(String[] args) {
          
          // generates a random double value within 0.0 to 1.0 
          // multiply it by 100 gets the values between 0 to 100
          // converting it to int after that
          int number = (int) (Math.random() * 100);
          String binary_value_of_number = getBinaryValue(number);
          
          System.out.println("Binary value of " + number + " is " + binary_value_of_number);
     }  

     public static String getBinaryValue(int number) {
          int remainder, quotient = number;
          String binary_number = "";

          while(quotient > 0) {
               remainder = quotient % 2;
               binary_number = remainder + binary_number;
               quotient /= 2;
          }
          return binary_number;
     }
}
