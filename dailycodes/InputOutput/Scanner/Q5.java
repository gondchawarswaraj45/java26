import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Greater number is " + num1);
        } 
        else if (num2 > num1) {
            System.out.println("Greater number is " + num2);
        } 
        else {
            System.out.println("Both numbers are equal");
        }
    }
}
