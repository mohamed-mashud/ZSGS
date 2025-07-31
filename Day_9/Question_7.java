// 7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.

public class Question_7 {
    public static void main(String[] args) {
        Question_7 qn7 = new Question_7();
        qn7.method1();    
    } 

    private void method1() {
        try {
            method2();    
        } catch (Exception e) {
            System.out.println("Exception handled " + e.getMessage());
        }
    }

    private void method2() throws Exception {
        method3();
    }

    private void method3() throws Exception  {
        throw new Exception("This is an exception from method3");
    }


}