import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void setDetails(String n, double s) {
        name = n;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Employee Name = " + name);
        System.out.println("Salary = " + salary);
    }

    static void calculateBonus(double salary) {
        double bonus = salary * 0.10;
        System.out.println("Bonus (10%) = " + bonus);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee();

        emp.setDetails(name, salary);
        emp.displayDetails();
        calculateBonus(salary);
    }
}
