public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("riya", "Patil", 25000);
        Employee emp2 = new Employee("Sneha", "jagadale", 30000);

        System.out.println("Yearly Salary of " + emp1.getFirstName()
                + " : " + emp1.getYearlySalary());

        System.out.println("Yearly Salary of " + emp2.getFirstName()
                + " : " + emp2.getYearlySalary());

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");

        System.out.println("Yearly Salary of " + emp1.getFirstName()
                + " : " + emp1.getYearlySalary());

        System.out.println("Yearly Salary of " + emp2.getFirstName()
                + " : " + emp2.getYearlySalary());
    }
}
