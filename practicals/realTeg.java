import java.io.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ShoppingSystem {
    Product[] products = new Product[3];

    ShoppingSystem() {
        products[0] = new Product(1, "Laptop", 50000);
        products[1] = new Product(2, "Phone", 20000);
        products[2] = new Product(3, "Headphones", 3000);
    }

    void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].id + " " + products[i].name + " " + products[i].price);
        }
    }

    double calculateTotal(int[] qty) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total = total + (products[i].price * qty[i]);
        }
        return total;
    }

    double applyDiscount(double total) {
        if (total > 50000) {
            return total - (total * 0.20);
        } else if (total > 20000) {
            return total - (total * 0.10);
        } else {
            return total - (total * 0.05);
        }
    }

    void generateBill(String username, int[] qty) {
        StringBuffer bill = new StringBuffer();
        double total = calculateTotal(qty);
        double finalAmount = applyDiscount(total);

        bill.append("\n----- BILL -----\n");
        bill.append("User: ").append(username).append("\n");

        for (int i = 0; i < products.length; i++) {
            if (qty[i] > 0) {
                bill.append(products[i].name)
                    .append(" x ")
                    .append(qty[i])
                    .append(" = ")
                    .append(products[i].price * qty[i])
                    .append("\n");
            }
        }

        bill.append("Total: ").append(total).append("\n");
        bill.append("Final Amount: ").append(finalAmount).append("\n");

        System.out.println(bill);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ShoppingSystem s = new ShoppingSystem();

        System.out.print("Enter Username: ");
        String username = br.readLine();

        int[] qty = new int[3];

        s.displayProducts();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter quantity for " + s.products[i].name + ": ");
            qty[i] = Integer.parseInt(br.readLine());
        }

        s.generateBill(username, qty);
    }
}
