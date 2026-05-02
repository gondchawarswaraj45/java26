import java.util.*;

class Demo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
        }
        else if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
        }
        else if (n1 == n2 && n1 > n3) {
            System.out.println("n1 = n2 = " + n1);
        }
        else if (n2 == n3 && n2 > n1) {
            System.out.println("n2 = n3 = " + n2);
        }
        else if (n1 == n3 && n1 > n2) {
            System.out.println("n1 = n3 = " + n1);
        }
        else {
            System.out.println("All are equal: " + n1);
        }
    }
}
