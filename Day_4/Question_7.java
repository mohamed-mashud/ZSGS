// 7. Design a calculator application using Java Inheritance.
// ‌
// Create the following class hierarchy:
// ‌
// --->BasicCalculator (Base class):
// Implement at least three basic arithmetic methods, such as:
// ‌
// --->add(int a, int b)
// --->subtract(int a, int b)
// --->multiply(int a, int b)
// --->divide(int a, int b)
// ‌
// --->AdvancedCalculator (Inherits from BasicCalculator):
// Add 3 to 4 advanced mathematical operations, such as:
// ‌
// --->power(int base, int exponent)
// --->modulus(int a, int b)
// --->squareRoot(double number)
// ‌
// --->ScientificCalculator (Inherits from AdvancedCalculator):
// Add scientific functions, such as:
// ‌
// --->sin(double angle)
// --->cos(double angle)
// --->log(double value)
// --->exp(double value)
// * Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
// * Use appropriate access specifiers and method overrides where required.
// * Add a main() method to test all operations.

public class Question_7 {
    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        System.out.println("Basic Calculator Operations:");
        System.out.println(calculator.add(10, 20)); 
        System.out.println(calculator.subtract(10, 20)); 
        System.out.println(calculator.multiply(10, 20)); 
        System.out.println(calculator.divide(10, 20));
        
        System.out.println("Advanced Operations: ");
        System.out.println(calculator.power(2, 3));
        System.out.println(calculator.modulus(10, 3));
        System.out.println(calculator.squareRoot(16));

        System.out.println("Scientific Calculator operations: ");
        System.out.println(calculator.sin(0.5));
        System.out.println(calculator.cos(0.5));
        System.out.println(calculator.log(10));
        System.out.println(calculator.exp(10));
    }
}

class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(int a, int b) {
        return (double) a * b;
    }
    public double divide(int a, int b) {
        return (double) a / b;
    }
}

class AdvancedCalculator extends BasicCalculator {
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
    public int modulus(int a, int b) {
        return a % b;
    }
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

class ScientificCalculator extends AdvancedCalculator {
    public double sin(double angle) {
        return Math.sin(angle);
    }
    public double cos(double angle) {
        return Math.cos(angle);
    }
    public double log(double value) {
        return Math.log(value);
    }
    public double exp(double value) {
        return Math.exp(value);
    }
}