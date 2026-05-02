import java.io.*;

class Book {
    String title;
    String author;
    double price;

    void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    static void applyDiscount(double price) {
        double discount = price * 0.15;
        double finalPrice = price - discount;
        System.out.println("Discounted Price: " + finalPrice);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Title: ");
        String title = br.readLine();

        System.out.print("Enter Author: ");
        String author = br.readLine();

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(br.readLine());

        Book b = new Book();
        b.setDetails(title, author, price);
        b.displayDetails();
        Book.applyDiscount(price);
    }
}
