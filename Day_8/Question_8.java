// 8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
// --->Create a class Student with fields like name, rollNo, and department.
// --->Attempt to clone an object of this class using the clone() method.
// --->Catch and handle the CloneNotSupportedException if thrown.
// ***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
// -->Your program should clearly illustrate:
// a. What happens if Cloneable is not implemented
// b. How the error is resolved by implementing Cloneable

/*
 * If cloneable is not implemented, there will be CloneNotFoundException thrown 
*/

public class Question_8 {
    public static void main(String[] args) {
        Student s1 = new Student("kevin", "Mechatronics");
        try {
            
            Student s2 = (Student)s1.clone();
            System.out.println(s2.toString());

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }    
}

class Student implements Cloneable{
    private String name;
    private int rollNo;
    private String department;
    static int studentCount;

    public Student(String name, String department) {
        this.name = name;
        this.rollNo = getStudentCount();
        this.department = department;
    }

    public final int getStudentCount() {
        return studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", department=" + department + "]";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }        
}