import java.util.*;

class Demo8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();

        int result = sp - cp;

        if (result > 0) {
            System.out.println("Profit is " + result);
        } 
        else if (result < 0) {
            System.out.println("Loss is " + (-result));
        } 
        else {
            System.out.println("No Profit No Loss");
        }
    }
}
