// 2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
// --- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
// a. Addition
// b. Subtraction
// c. Multiplication
// d. Division
// e. Modulo
// --- stringutils: This package should include a class that defines methods for:
// a. Concatenating two strings
// b. Reversing a string
// c. Finding the length of a string
// In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
// ‌
import arithmetic.ArithmeticOperations;
import stringutils.StringUtilities;


public class Question_2 {
    public static void main(String[] args) {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        StringUtilities stringUtilities = new StringUtilities();

        System.out.println(
            "Addition: " + arithmeticOperations.Addition(10, 5) +
            "\nSubtraction: " + arithmeticOperations.Subtraction(10, 5) +
            "\nMultiplication: " + arithmeticOperations.Multiplication(10, 5) +
            "\nDivision: " + arithmeticOperations.Division(10, 5) +
            "\nModulo: " + arithmeticOperations.Modulo(10, 5)
        );

        System.out.println(
            "Concatenation: " + stringUtilities.concatStrings("Hello, ", "World!") + 
            "\nReverse string: " + stringUtilities.reversedString("siht daer dluohs ouy ereht ih") +
            "\nLength of string: " + stringUtilities.getLength("A verry big string of length idk")
        );
    }
}