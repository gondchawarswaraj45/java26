import java.util.*;

class Demo {
    public static void main(String[] args) {

        int C;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Selling Price:");
        int A = sc.nextInt();

        System.out.println("Enter Cost Price:");
        int B = sc.nextInt();

        C = A - B;

        if (C > 0) {
            System.out.println("Profit is " + C);
        }
        else if (C < 0) {
            System.out.println("Loss is " + (-C));
        }
        else {
            System.out.println("No profit No loss");
        }
    }
}
