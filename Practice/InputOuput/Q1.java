import java.util.*;

class Demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number num1: ");
        int num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("Number is positive " + num1);
        } 
        else if (num1 < 0) {
            System.out.println("Number is negative " + num1);
        } 
        else {
            System.out.println("Number is zero");
        }

 
    }
}
