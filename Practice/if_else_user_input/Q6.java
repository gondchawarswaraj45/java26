import java.util.*;

class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is maximum");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum");
        } else {
            System.out.println("Both are equal");
        }
    }
}
