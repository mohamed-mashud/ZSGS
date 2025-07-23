// 3. Write a Java program where you define a class named Employee. 
// Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
// a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
// b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
// c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.

public class Question_3 {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Sam curran", 1234, "yellow soka guy", 5318008.69);
        Employee emp3 = new Employee(emp2);

        System.out.println(
            emp1.toString() + " " +
            emp2.toString() + " " +
            emp3.toString()
        );
    }
}

class Employee {
    String name;
    int employeeId;
    String designation;
    double salary;

    public Employee() {
        System.out.println("Object created with no-argument constructor");
        name = "Unkown";
        employeeId = 0;
        designation = "Unkown";
        salary = 0.0;
    }

    public Employee(String name, int employeeId, String desingation, double salary) {
        System.out.println("Made with parameterized constructor");
        this.name = name;
        this.employeeId = employeeId;
        this.designation = desingation;
        this.salary = salary;
    }

    public Employee(Employee other) {
        System.out.println("Made with copy constructor");
        this.name = other.name;
        this.employeeId = other.employeeId;
        this.designation = other.designation;
        this.salary = other.salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nemployeeID: " + this.employeeId + 
                "\nDesignation: " + this.designation +
                "\nSalary: " + this.salary;
    }
}