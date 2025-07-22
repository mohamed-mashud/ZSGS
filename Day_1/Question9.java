// 9. Write a class Employee with attributes empId, name, department and salary and 
// define a parametrized constructor Employee(int empId, String name, String department, double salary) and
// assign these variables to instance variables accordingly and display them?

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int empId = scanner.nextInt();
        String name = scanner.nextLine();
        String department = scanner.nextLine();
        double salary = scanner.nextDouble();

        scanner.close();

        Employee employee = new Employee(empId, name, department, salary);
        System.out.println(employee.toString());
    }  
}

class Employee {
    int empId;
    String name, department;
    double salary;


    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + this.empId +
                "\nName : " + this.name +
                "\nDepartment : " + this.department +
                "\nSalary : " + this.salary;
    }
}
