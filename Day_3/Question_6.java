
// 6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
// Name Year of joining Address
// Robert 1994 64C- WallsStreat
// Sam 2000 68D- WallsStreat
// John 1999 26B- WallsStreat
// Can use format method to format the above said output.
public class Question_6 {
    public static void main(String[] args) {
        // Create 3 Employee objects
        Employee e1 = new Employee("Robert", 1994, 50000, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, 55000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, 60000, "26B- WallsStreat");
    
        // Print table header
        System.out.format("%-10s %-15s %-20s\n", "Name", "Year of Joining", "Address");
    
        // Print employee details
        System.out.format("%-10s %-15d %-20s\n", e1.name, e1.yearOfJoining, e1.address);
        System.out.format("%-10s %-15d %-20s\n", e2.name, e2.yearOfJoining, e2.address);
        System.out.format("%-10s %-15d %-20s\n", e3.name, e3.yearOfJoining, e3.address);
    }
}

class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
}
