// 3. Write a program to illustrate how to throw a ClassNotFoundException.

public class Question_3 {
    public static void main(String[] args) {
        try {
            // Class.forName("com.class.doesnt.exist");
            throw new ClassNotFoundException("Thrown exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception" + e.getMessage());
        }
    }
}