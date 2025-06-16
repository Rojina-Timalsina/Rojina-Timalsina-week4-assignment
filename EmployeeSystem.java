//Base class Employee with private fields name, id, and method calculateSalary().
//Subclasses:
//Manager with bonus
//Developer with overtimeHours
//Use encapsulation for fields and override calculateSalary():
//For Manager, salary = base + bonus
//For Developer, salary = base + overtimeHours * rate
//File: EmployeeSystem.java.


class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    
    public double calculateSalary() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}


class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

   
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}


class Developer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Developer(String name, int id, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * overtimeRate);
    }
}


public class EmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Ram", 1, 5000, 1200);
        Developer developer = new Developer("Shyam", 2, 4000, 15, 40);

        System.out.println("Manager Details:");
        manager.displayInfo();
        System.out.println("Salary: " + manager.calculateSalary());

        System.out.println("Developer Details:");
        developer.displayInfo();
        System.out.println("Salary: " + developer.calculateSalary());
    }
}