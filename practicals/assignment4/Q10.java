import java.util.*;

class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is maximum");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is maximum");
        }
        else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is maximum");
        }

        // equal cases
        else if (n1 == n2 && n1 > n3) {
            System.out.println(n1 + " and " + n2 + " are maximum");
        }
        else if (n2 == n3 && n2 > n1) {
            System.out.println(n2 + " and " + n3 + " are maximum");
        }
        else if (n1 == n3 && n1 > n2) {
            System.out.println(n1 + " and " + n3 + " are maximum");
        }

        else {
            System.out.println("All are equal");
        }
    }
}
