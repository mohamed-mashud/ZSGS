// 5. Write a program that illustrate the execution order of static block and initializer block?
public class Question5 {
    // static block
    static {
        System.out.println("Static block Executed");
    }

    public Question5() {
        System.out.println("Constructor");
    }

    // initializer block
    {
        System.out.println("Initializer block");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
        Question5 question5 = new Question5();
        System.out.println("Object created");
    }

    /**
     * Output:
     * Static block Executed
     * Main method called
     * Initializer block
     * Constructor
     * Object created
     */
}
