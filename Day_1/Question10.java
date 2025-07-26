// 10. Write a program to check whether the object is an instance of a particular class?

public class Question10 {
    public static void main(String[] args) {
        Question10 mainObj = new Question10();
        
        if(mainObj instanceof Question10) 
            System.out.println("This is an instance of Question10");
            else 
            System.out.println("This is not an instance of Question10");

    }
}
