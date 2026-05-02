import java.io.*;

class Car {
    void showDetails(String brand, String model, double price) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Brand: ");
        String brand = br.readLine();

        System.out.print("Enter Model: ");
        String model = br.readLine();

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(br.readLine());

        Car c = new Car();
        c.showDetails(brand, model, price);
    }
}
