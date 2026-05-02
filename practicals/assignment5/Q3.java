import java.util.*;

class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println("Divisible by 7");
        } else {
            System.out.println("Not divisible by 7");
        }
    }
}
