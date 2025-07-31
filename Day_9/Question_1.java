// 1. int[] arr = {2, 5, 1, 4, 0, 7};
// int quotient = arr[7] / arr[4];
// Develop a Java program which handles any unexpected situations that may arise during execution.

public class Question_1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};

        try {
            int quotient = arr[7] / arr[4];
            System.out.println("Quotient: " + quotient);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "ArrayIndexOutOfBoundsException: " + e.getMessage()
            );
        } catch (ArithmeticException e) {
            System.out.println(
                "Arithmetic Exception" + e.getMessage()
            );
        }
    }
}
