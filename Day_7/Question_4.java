// 4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.

public class Question_4 {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee("Full time emp", 50_000);
        System.out.println(fte.calculateSalary());
        
        Employee pte = new PartTimeEmployee("Part time emp", 15_000, 2);
        System.out.println(pte.calculateSalary());
    }
}

interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return 12 * this.salary;
    }
}

class PartTimeEmployee implements Employee {
    private String name;
    private double salary;
    private int monthsWorked;

    public PartTimeEmployee(String name, double salary, int monthsWorked) {
        this.monthsWorked = monthsWorked;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public double calculateSalary() {
        return this.monthsWorked * salary;
    }
}