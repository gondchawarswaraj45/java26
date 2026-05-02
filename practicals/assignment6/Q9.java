import java.util.*;

class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start:");
        int start = sc.nextInt();

        System.out.println("Enter end:");
        int end = sc.nextInt();

        int sum = 0;

        while (start <= end) {
            sum = sum + start;
            start++;
        }

        System.out.println("Sum = " + sum);
    }
}
