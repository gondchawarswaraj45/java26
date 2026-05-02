import java.util.*;

class RechargeMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Recharge Plan:");
        System.out.println("1. ₹149 Plan");
        System.out.println("2. ₹299 Plan");
        System.out.println("3. ₹499 Plan");
        System.out.println("4. ₹999 Plan");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Plan ₹149 selected");
            System.out.println("1GB/day data, 20 days validity, unlimited calls");
        }
        else if (choice == 2) {
            System.out.println("Plan ₹299 selected");
            System.out.println("1.5GB/day data, 28 days validity, unlimited calls");
        }
        else if (choice == 3) {
            System.out.println("Plan ₹499 selected");
            System.out.println("2GB/day data, 28 days validity, unlimited calls");
        }
        else if (choice == 4) {
            System.out.println("Plan ₹999 selected");
            System.out.println("2.5GB/day data, 84 days validity, unlimited calls");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
