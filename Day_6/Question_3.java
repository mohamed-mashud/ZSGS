// 3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.

public class Question_3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(0, "Chad", "SDE", "Publish", 20_000);
        System.out.println(emp1.getAnnualSalary());
    }    
}

class Employee {
    private int employeeID;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    public Employee(int employeeID, String name, String designation, String department, double monthlySalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualSalary() {
        return this.monthlySalary * 12;
    }
}
