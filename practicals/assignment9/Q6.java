import java.io.*;

class Laptop {
    String brand;
    int ram;
    double price;

    void setDetails(String b, int r, double p) {
        brand = b;
        ram = r;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
    }

    static void calculateGST(double price) {
        double gst = price * 0.18;
        double total = price + gst;
        System.out.println("Price with GST: " + total);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Brand: ");
        String brand = br.readLine();

        System.out.print("Enter RAM (GB): ");
        int ram = Integer.parseInt(br.readLine());

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(br.readLine());

        Laptop l = new Laptop();
        l.setDetails(brand, ram, price);
        l.displayDetails();
        Laptop.calculateGST(price);
    }
}
