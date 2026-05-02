import java.util.*;

class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting range:");
        int start = sc.nextInt();

        System.out.println("Enter ending range:");
        int end = sc.nextInt();

        int i = start;

        while (i <= end) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
