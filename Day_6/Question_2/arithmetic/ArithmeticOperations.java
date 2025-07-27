// --- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
// a. Addition
// b. Subtraction
// c. Multiplication
// d. Division
// e. Modulo

package arithmetic;

public class ArithmeticOperations {
    
    public int Addition(int a, int b) {
        return a + b;
    }
    
    public int Subtraction(int a, int b) {
        return a - b;
    }
    
    public double Multiplication(int a, int b) {
        return (double) a * b;
    }
    
    public double Division(int a, int b) {
        if(b == 0)
            throw new ArithmeticException();
        return (double) a / b;
    }

    public int Modulo(int a, int b) {
        if(b == 0)
            throw new ArithmeticException();
        return a % b;
    }

}
