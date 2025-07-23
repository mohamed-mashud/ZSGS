// 2. Create a class named Student that has the following attributes:
// name (String)
// roll_no (int)
// phone_no (int)
// address (String)
// Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.

public class Question_2 {
    public static void main(String[] args) {
        Student s1 = new Student("Sam", 1, 1234567890, "xyz");
        Student s2 = new Student("John", 2, 976543210, "mnb");

        System.out.println(
            s1.toString() + " " + s2.toString()
        );
    }       
}
class Student {
    String name;
    int rollNo, phone_no;
    String address;

    public Student(String name, int rollNo, int phone_no, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phone_no = phone_no;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nRoll No: " + this.rollNo + 
                "\nPhone No: " + this.phone_no +
                "\nAddress: " + this.address;
    }
}
