import java.util.Scanner;

class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name:");
        String name = sc.next();   // use nextLine() if full name needed

        System.out.println("Enter Employee age:");
        int age = sc.nextInt();

        System.out.println("Enter Employee salary:");
        float salary = sc.nextFloat();

        System.out.println("Employee Details");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
