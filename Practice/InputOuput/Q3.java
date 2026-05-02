import java.util.*;

class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            // Descending order
            for (int i = num1; i >= num2; i--) {
                System.out.println(i);
            }
        } 
        else {
            // Ascending order
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
    }
}
