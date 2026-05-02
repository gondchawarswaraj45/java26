import java.util.*;

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("Enter amount to withdraw:");
        int amt = sc.nextInt();

        if (amt <= 0) {
            System.out.println("Invalid amount");
        } else if (amt > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amt;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
    }
}
