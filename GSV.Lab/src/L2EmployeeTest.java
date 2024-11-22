
import java.util.Scanner;

class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    void displaySalary() {
        System.out.println("Salery : " + monthlySalary);
    }

    void salaryHike() {
        monthlySalary = monthlySalary + monthlySalary / 10;
        System.out.print("after hike, the new salary is ");
        displaySalary();
    }

    // Set methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Get methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}

public class L2EmployeeTest {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter \nFirst Name of Employee 1:");
            String firstname = sc.nextLine();

            System.out.println("Last Name of Employee 1:");
            String lastname = sc.nextLine();

            System.out.println("Monthly Salary of Employee 1: ");
            int salary = sc.nextInt();

            Employee e1 = new Employee(firstname, lastname, salary);

            System.out.println("Enter \nFirst Name of Employee 2:");
            firstname = sc.nextLine();

            System.out.println("Last Name of Employee 2:");
            lastname = sc.nextLine();

            System.out.println("Monthly Salary of Employee 2: ");
            salary = sc.nextInt();

            Employee e2 = new Employee(firstname, lastname, salary);

            System.out.println("The salary of " + e1.getFirstName() + " " + e1.getLastName() + "is");
            e1.displaySalary();
            e1.salaryHike();

            System.out.println("The salary of " + e2.getFirstName() + " " + e2.getLastName() + "is");
            e2.displaySalary();
            e2.salaryHike();
        }
    }
}
