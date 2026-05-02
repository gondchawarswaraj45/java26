import java.util.*;

class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num % 2 == 0 || num % 5 == 0 || num % 10 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
    }
}
