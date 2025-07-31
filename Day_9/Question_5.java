// 5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.

public class Question_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Executing try block.....");
            return;
        } finally {
            System.out.println("Executing finally block.....");
        }
    }
    /*  Output:
     *  Executing try block.....
     *  Executing finally block.....
     */
}
