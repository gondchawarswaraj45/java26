import java.util.Scanner;

class BankDemo {

    double bal = 200000;

    void display() {
        System.out.println("Current Balance: ₹" + bal);
    }

    void deposit(double amt) {
        bal = bal + amt;
        System.out.println("Amount Deposited: ₹" + amt);
        System.out.println("Updated Balance: ₹" + bal);
    }

    void withdraw(double wdamt) {
        if (wdamt > bal) {
            System.out.println("Insufficient Balance");
        } else {
            bal = bal - wdamt;
            System.out.println("Amount Withdrawn: ₹" + wdamt);
            System.out.println("Updated Balance: ₹" + bal);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankDemo bd = new BankDemo();

        int n;

        do {
            System.out.println("\n1. Display Current Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            n = sc.nextInt();

            switch (n) {

                case 1:
                    bd.display();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double amt = sc.nextDouble();
                    bd.deposit(amt);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wdamt = sc.nextDouble();
                    bd.withdraw(wdamt);
                    break;

                case 4:
                    System.out.println("Exited...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (n != 4);

    }
}
