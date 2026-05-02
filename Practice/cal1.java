import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("Enter operator (+, -, *, /): ");
        char op = br.readLine().charAt(0);

        int result = 0;

        switch(op) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator");
        }

        System.out.println("Result = " + result);
    }
}
