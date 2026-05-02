import java.util.*;

class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Selling Price:");
        int sp = sc.nextInt();

        System.out.println("Enter Cost Price:");
        int cp = sc.nextInt();

        if (sp > cp) {
            int profit = sp - cp;
            System.out.println("Profit of " + profit);
        } else if (cp > sp) {
            int loss = cp - sp;
            System.out.println("Loss of " + loss);
        } else {
            System.out.println("No profit no loss");
        }
    }
}
