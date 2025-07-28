// 3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). 
// Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
// Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.

public class Question_3 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Full bro", 50_000);
        Employee partTiEmployee = new PartTimeEmployee("Part Time", 20_000, 3);

        System.out.println(
            "Full time employee salary: " +
            fullTimeEmployee.calculateSalary() + 
            " \nPart time employee salary: " +
            partTiEmployee.calculateSalary()
        );
    }
}

abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    String name;
    double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return this.salary * 12;
    }
}

class PartTimeEmployee extends Employee {
    String name;
    double salary;
    int monthsWorked;

    public PartTimeEmployee(String name, double salary, int monthsWorked) {
        this.name = name;
        this.salary = salary;
        this.monthsWorked = monthsWorked;
    }

    double calculateSalary() {
        return this.salary * this.monthsWorked;
    }
}