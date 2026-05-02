import java.util.*;

class Demo7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

            switch (ch) {

                case '+':
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case '-':
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case '*':
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case '/':
                    if (num2 != 0)
                        System.out.println("Result = " + (num1 / num2));
                    else
                        System.out.println("Division by zero not allowed");
                    break;

                case '%':
                    System.out.println("Result = " + (num1 % num2));
                    break;
            }
        } 
        else {
            System.out.println("Invalid operator");
        }
    }
}
