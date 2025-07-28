// 3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.

public class Questions_3 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Full bro", "123456789", "random+zs@gmail.com", 91_120);

        PartTimeEmployee pte = new PartTimeEmployee("Part bro", "987654321", "partime+zs@gmail.com", 1000, 3);

        fte.calculateSalary();
        pte.calculateSalary();
    }
}

class Employee {
    private String name;
    private String phone;
    private String email;

    public Employee(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void calculateSalary() {}

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nphone: " + phone +
                "\nemail: " + email;
    }
}

class PartTimeEmployee extends Employee {
    private double salary;
    private int workingMonths;

    public PartTimeEmployee(
        String name, String phone, String email, double salary, int workingMonths
        ) {
            super(name, phone, email);
            this.salary = salary;
            this.workingMonths = workingMonths;
    }

    @Override
    public void calculateSalary() {
        System.out.println(workingMonths * salary);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(
        String name, String phone, String email, double salary
    ) {
        super(name, phone, email);
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println(12 * salary);
    }
}