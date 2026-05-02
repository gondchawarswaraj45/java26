import java.util.*;

class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        } else if (num % 7 == 0) {
            System.out.println(num + " is divisible by 7");
        } else {
            System.out.println(num + " is neither divisible by 3 nor by 7");
        }
    }
}
