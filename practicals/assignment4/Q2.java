import java.util.*;

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num >= 1 && num <= 1000) {
            System.out.println("In range");
        } else {
            System.out.println("Not in range");
        }
    }
}
