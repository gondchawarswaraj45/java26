import java.util.*;

class Demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        } 
        else {
            for (int j = num1; j <= num2; j++) {
                System.out.println(j);
            }
        }
    }
}
