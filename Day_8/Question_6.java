// 6. Develop a Java program to illustrate pass-by-value.

public class Question_6 {

    public static void main(String[] args) {
        int x = 10;
        changeX(x);
        // doesnt change as x is passed as a copy 
        // cuz its a primitive data type
        System.out.println("Value of x after calling changeX: " + x);
    } 

    public static void changeX(int x) {
        x = 20;
    }
}
