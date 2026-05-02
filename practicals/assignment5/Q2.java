import java.util.*;

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println(num + " is greater than 10");
        } else if (num < 10) {
            System.out.println(num + " is less than 10");
        } else {
            System.out.println(num + " is equal to 10");
        }
    }
}
