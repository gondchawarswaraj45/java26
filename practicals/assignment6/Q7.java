import java.util.*;

class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();

        int i = n;

        while (i >= 1) {
            System.out.print((i * i) + " ");
            i--;
        }
    }
}
