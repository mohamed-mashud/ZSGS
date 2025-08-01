// 1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

public class Question1 {
    public static void main(String[] args) {
        Student student = new Student("Ajay", 21, "MALE");
        System.out.println(student.toString());    
    }
}

class Student {
    // final variable
    final String College = "a Random College";

    // instance variables
    String name, gender;
    int age, studentID;

    // static variable
    static int id = 0;

    public Student(String name, int age, String gender) {
        // variables contained within a method are called
	// local variables
	this.studentID = getStudentID();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static int getStudentID() {
        return id++;
    }

    @Override
    public String toString() {
        return "Student ID: " + this.studentID +
                "\nName: " + this.name + 
                "\nAge: " + this.age + 
                "\nGender: " + this.gender +
                "\nCollege: " + this.College;
    }
}
