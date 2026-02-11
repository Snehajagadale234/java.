// Base Class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    // Constructor
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus (default 5%)
    double calculateBonus() {
        return salary * 0.05;
    }

    // Generate performance report
    void generatePerformanceReport() {
        System.out.println("Performance Report of " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    // Manage project
    void manageProject() {
        System.out.println(name + " is managing a general project.");
    }
}

// Manager Class
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    // Manager bonus 20%
    double calculateBonus() {
        return salary * 0.20;
    }

    void manageProject() {
        System.out.println(name + " is managing multiple teams and projects.");
    }
}

// Developer Class
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    // Developer bonus 10%
    double calculateBonus() {
        return salary * 0.10;
    }

    void manageProject() {
        System.out.println(name + " is developing software modules.");
    }
}

// Programmer Class
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    // Programmer bonus 8%
    double calculateBonus() {
        return salary * 0.08;
    }

    void manageProject() {
        System.out.println(name + " is writing and testing code.");
    }
}

// Main Class
public class EmployeeDemo {
 
    public static void main(String[] args) {

        Manager m = new Manager("Sneha", "Pune", 80000);
        Developer d = new Developer("Rahul", "Mumbai", 60000);
        Programmer p = new Programmer("Amit", "Nashik", 50000);

        System.out.println("----- Manager Details -----");
        m.generatePerformanceReport();
        System.out.println("Bonus: " + m.calculateBonus());
        m.manageProject();

        System.out.println("\n----- Developer Details -----");
        d.generatePerformanceReport();
        System.out.println("Bonus: " + d.calculateBonus());
        d.manageProject();

        System.out.println("\n----- Programmer Details -----");
        p.generatePerformanceReport();
        System.out.println("Bonus: " + p.calculateBonus());
        p.manageProject();
    }
}
