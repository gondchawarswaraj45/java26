import java.util.*;

class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage:");
        double per = sc.nextDouble();

        if (per >= 75) {
            System.out.println("First class with distinction");
        }
        else if (per >= 60) {
            System.out.println("First class");
        }
        else if (per >= 50) {
            System.out.println("Second class");
        }
        else if (per >= 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
