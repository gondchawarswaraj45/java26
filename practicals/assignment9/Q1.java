import java.io.*;

class Product {
    void showProduct(String name, int id, double price) {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Product Name: ");
        String name = br.readLine();

        System.out.print("Enter Product ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter Product Price: ");
        double price = Double.parseDouble(br.readLine());

        Product p = new Product();
        p.showProduct(name, id, price);
    }
}
