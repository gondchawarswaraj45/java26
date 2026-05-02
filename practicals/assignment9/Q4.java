import java.io.*;

class Shopping {
    static void calculateDiscount(double amount) {
        System.out.println("Total Amount: " + amount);

        double discount;
        if (amount > 5000) {
            discount = amount * 0.20;
        } else if (amount > 2000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.05;
        }

        double finalAmount = amount - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(br.readLine());

        Shopping.calculateDiscount(amount);
    }
}
