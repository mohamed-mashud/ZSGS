// 1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. 
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.


public class Question_1 {
    public static void main(String[] args) {
        String name = "John";
        int rollNo = 2;

        Student student = new Student(name, rollNo);
        student.display();
    }    
}

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println(
            "Name: " + name + "\n" +
            "Roll No: " + rollNo
        );
    }
}
